package com.listener;


import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class main {
    public static void main(String[] args)throws Exception{
        //generar input
        String ruta = "src/com/listener/test.csv";
        CharStream input = fromFileName(ruta);

        //conectar parser con lexer
        listenerl lexer = new listenerl(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        listener parser = new listener(token);

        //regla inicio
        ParseTree tree = parser.file();

        MyListener lis = new MyListener();
        ParseTreeWalker walker   = new ParseTreeWalker();

        walker.walk(lis, tree);
        System.out.println(lis.filas);

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