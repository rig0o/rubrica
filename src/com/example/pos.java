package com.example;

import java.util.ArrayList;
import java.util.List;

public class pos extends posBaseListener{

    List<String> lista = new ArrayList<String>();

    @Override
    public void exitTerm(posParser.TermContext ctx) {
        if (ctx.getParent().getRuleIndex()== posParser.RULE_expr) lista.add(ctx.INT().getText());
    }

    @Override
    public void enterSuma(posParser.SumaContext ctx) {
        lista.add(ctx.term().INT().getText());
        lista.add("+");
    }

    @Override
    public void enterResta(posParser.RestaContext ctx) {
        lista.add(ctx.term().INT().getText());
        lista.add("-");
    }

}
