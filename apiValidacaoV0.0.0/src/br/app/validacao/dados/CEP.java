/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validacao.dados;

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
        for (int posicao = 0; posicao < CEP.vetorTam; posicao++) {
            if(campo.equals(CEP.cepVetor[posicao]))
            {
                return true;
            }
        }
        return false;
    }
    
}
