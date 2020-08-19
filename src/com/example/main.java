package com.example;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class main {
    public static void main(String [] argc)throws Exception{

        String  ruta = "src/com/pos/test.txt";
        CharStream input = fromFileName(ruta);

        posLexer lex = new posLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        posParser   parser = new posParser(tokens);

        ParseTree tree = parser.expr();

        pos lis = new pos();
        ParseTreeWalker walker   = new ParseTreeWalker();

        walker.walk(lis, tree);
        System.out.println(lis.lista);

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
