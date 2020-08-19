package com.listener;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends listenerBaseListener{

    public static final String VACIO = "";
    List<Map<String,String>> filas = new ArrayList<Map<String,String>>();

    List<String> cabecera;
    List<String> datosFila;

    @Override
    public void exitHeder(listener.HederContext ctx) {
        cabecera = new ArrayList<String>();
        cabecera.addAll(datosFila);
    }

    @Override
    public void enterLine(listener.LineContext ctx) {
        datosFila = new ArrayList<String>();
    }

    @Override
    public void exitLine(listener.LineContext ctx) {
       if(ctx.getParent().getRuleIndex()== listener.RULE_heder) return;

       Map<String,String> mapa = new LinkedHashMap<String, String>();

       int a = 0 ;
       for(String act : datosFila) {
            mapa.put(cabecera.get(a),act);
            a++;
       }
       filas.add(mapa);
    }

    @Override
    public void exitTexto(listener.TextoContext ctx) {
        //System.out.println("ENTRO");
        datosFila.add(ctx.TEXTO().getText());
    }
}
