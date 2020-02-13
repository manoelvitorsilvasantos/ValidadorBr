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
public final class Pessoa implements CNPJ, CPF, CT, GENERAL, RG{
    
    private static volatile Pessoa instancia;
    private final static Object MONITOR = new Object();
    
    
    public Pessoa()
    {
        super();
    }
    
    public static Pessoa getInstancia()
    {
        synchronized(MONITOR)
        {
            if(instancia == null)
            {
                instancia = new Pessoa();
            }
        }
        return instancia;
    }

    @Override
    public boolean isEmpty(String campo, String mascara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isNull(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRight(String campo, String mascara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCNPJValid(String campo, String regex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCPFValid(String campo, String regex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCTValid(String campo, String regex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRGValid(String campo, String regex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
