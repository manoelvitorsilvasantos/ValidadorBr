/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.otherFields;

/**
 *
 * @author mvictor
 */
public final class Validacao implements IValidacao{

    private static volatile Validacao instancia = null;
            
    public Validacao()
    {
        super();
    }
    
    public static Validacao getInstancia()
    {
        if(instancia == null)
        {
            synchronized(Validacao.class)
            {
                if(instancia == null)
                {
                    Validacao.instancia = instancia = new Validacao();
                }
            }
        }
        return instancia;
    }
    
    @Override
    public final boolean isEmpty(final String Campo) {
        return Campo.isEmpty();
    }

    @Override
    public boolean isNull(final String Campo) {
        return Campo == null;
    }
    
}
