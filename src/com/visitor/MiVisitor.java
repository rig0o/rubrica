package com.visitor;

public class MiVisitor extends visitorBaseVisitor<Integer>{


    @Override
    public Integer visitDiv(visitorParser.DivContext ctx) {
        return visit(ctx.e(0)) / visit(ctx.e(1));
    }

    @Override
    public Integer visitMult(visitorParser.MultContext ctx) {
        return visit(ctx.e(0)) * visit(ctx.e(1));
    }

    @Override
    public Integer visitMenos(visitorParser.MenosContext ctx) {
        return visit(ctx.e(1)) - visit(ctx.e(1));
    }

    @Override
    public Integer visitPlus(visitorParser.PlusContext ctx) {
        return visit(ctx.e(0)) + visit(ctx.e(1));
    }

    @Override
    public Integer visitInt(visitorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
}
