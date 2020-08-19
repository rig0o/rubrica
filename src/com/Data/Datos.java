package com.Data;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;

import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Datos {
    public static void main(String []argc)throws Exception{

        String ruta = "src/com/Data/test.txt";
        //CharStream input = fromFileName(ruta);
        CharStream input = new ANTLRInputStream("2 1 1 3 1 1 1");
        DataLexer lex = new DataLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        DataParser parser = new DataParser(tokens);

        ParseTree tree = parser.file();

        System.out.println(tree.toStringTree(parser));

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
