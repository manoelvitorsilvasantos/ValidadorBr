/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.documentsBr;

/**
 *
 * @author mvictor
 */
public final class General implements IGeneral{
    
    
    private static volatile General instancia;
    
    public General()
    {
        super();
    }
    
    public General getInstacia()
    {
        if(instancia == null)
        {
            synchronized(General.class)
            {
                if(instancia == null)
                {
                    instancia = new General();
                }
            }
        }
        return instancia;
    }

    @Override
    public final boolean isValid(final String Campo, final String Expressao) {
        return Campo.matches(Expressao);
    }

    @Override
    public final boolean isEmpty(final String Campo, final String Mascara) {
       return Campo.equals(Mascara);
    }
    
   
    
}
