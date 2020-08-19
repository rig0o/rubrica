package com.visitor;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main (String[] argc) throws Exception {

        String ruta = "src/com/visitor/test.txt";
        CharStream cs = fromFileName(ruta);
                //CharStream cs = new ANTLRInputStream("6*3/9");
        visitorLexer lexer = new visitorLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        visitorParser parser = new visitorParser(token);
            ParseTree tree = parser.prog();

        System.out.println(tree.toStringTree(parser));
        MiVisitor mv = new MiVisitor();
        int resultado = mv.visit(tree);



        System.out.println("resultado = "+ resultado);

        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
