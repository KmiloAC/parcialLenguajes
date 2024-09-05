import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TrigCalc {
    public static class EvalVisitor extends TrigExprBaseVisitor<Double> {
        @Override
        public Double visitSinExpr(TrigExprParser.SinExprContext ctx) {
            double value = visit(ctx.expr());
            return Math.sin(Math.toRadians(value));  // Convertir a radianes
        }

        @Override
        public Double visitCosExpr(TrigExprParser.CosExprContext ctx) {
            double value = visit(ctx.expr());
            return Math.cos(Math.toRadians(value));  // Convertir a radianes
        }

        @Override
        public Double visitTanExpr(TrigExprParser.TanExprContext ctx) {
            double value = visit(ctx.expr());
            return Math.tan(Math.toRadians(value));  // Convertir a radianes
        }

        @Override
        public Double visitNumberExpr(TrigExprParser.NumberExprContext ctx) {
            return Double.parseDouble(ctx.getText());
        }
    }

    public static void main(String[] args) throws IOException {
        // Leer el archivo de entrada
        String inputFile = "expr.in";
        FileInputStream fis = new FileInputStream(new File(inputFile));
        CharStream input = CharStreams.fromStream(fis);

        // Crear lexer y parser
        TrigExprLexer lexer = new TrigExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigExprParser parser = new TrigExprParser(tokens);

        // Parsear las expresiones
        ParseTree tree = parser.prog();

        // Evaluar las expresiones
        EvalVisitor eval = new EvalVisitor();
        for (int i = 0; i < tree.getChildCount(); i++) {
            double result = eval.visit(tree.getChild(i));
            System.out.printf("%.1f\n", result);  // Imprimir con un decimal
        }
    }
}
