package com.pos;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class posfija {
    public static void main (String [] argc)throws Exception{

        String ruta = "src/com/pos/test.txt";
        CharStream input = fromFileName(ruta);

        SimpleLexer lex = new SimpleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        SimpleParser parser = new SimpleParser(tokens);



        String posfija = parser.expr().s;
        System.out.println(posfija);



        /*ParseTree tree = parser.expr();
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/
    }
}
