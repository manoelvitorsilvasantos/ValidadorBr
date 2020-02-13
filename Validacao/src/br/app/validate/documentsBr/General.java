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
public class General implements IGeneral{
    
    
    private static General instancia;
    
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
    public boolean isValid(String Campo, String Expressao) {
        return Campo.matches(Expressao);
    }

    @Override
    public boolean isEmpty(String Campo, String Mascara) {
       return Campo.equals(Mascara);
    }
    
   
    
}
