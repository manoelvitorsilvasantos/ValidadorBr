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
public class CEP implements ICEP{

    private static volatile CEP instancia = null;
    private static final String CEP = "\\d{2}.\\d{3}-\\d{3}";

    public CEP()
    {
        super();
    }
    
    public static CEP getInstancia()
    {
        if(instancia == null)
        {
            synchronized(CEP.class)
            {
                if(instancia == null)
                {
                    instancia = new CEP();
                }
            }
        }
        return instancia;
    }
    
    @Override
    public boolean isValidCep(String Campo) {
        return Campo.matches(CEP);
    }

    @Override
    public boolean isEmpty(String Campo, String mascara) {
        return Campo.equals(mascara);
    }
    
}
