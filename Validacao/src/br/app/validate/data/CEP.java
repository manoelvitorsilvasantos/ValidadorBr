/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mvictor
 */
public final class CEP implements ICEP{

    private static volatile CEP instancia = null;
    private final static Object MONITOR = new Object();
    
    private static final String cepRegex = "\\d{2}.\\d{3}-\\d{3}";

    
    public CEP()
    {
        super();
    }
    
    public static CEP getInstancia()
    {
        synchronized (MONITOR) {
            if (instancia == null) {
                instancia = new CEP();
            }
        }
        return instancia;
    }
    
    @Override
    public final boolean isValidCep(final String Campo){
        return Campo.matches(cepRegex);
    }

    @Override
    public boolean isEmpty(final String Campo, final String mascara) {
        return Campo.equals(mascara);
    }

    @Override
    public boolean isRepeted(String campo) {
        return campo.equals("00.000-000")||
               campo.equals("11.111-111")||
               campo.equals("22.222-222")||
               campo.equals("33.333-333")||
               campo.equals("44.444-444")||
               campo.equals("55.555-555")||
               campo.equals("66.666-666")||
               campo.equals("77.777-777")||
               campo.equals("88.888-888")||
               campo.equals("99.999-999")||
               campo.length()!=10;
    }
    
}
