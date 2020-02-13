/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.data;

/**
 *
 * @author mvictor
 */
public class Data implements IData{

    private static volatile Data instancia;
    private final static Object MONITOR = new Object();
    
    
    public Data()
    {
        super();
    }
    
    public static Data getInstancia()
    {
        synchronized(MONITOR)
        {
            if(instancia == null)
            {
                instancia = new Data();
            }
        }
        return instancia;
    }
    
    @Override
    public boolean isDateValid(String campo) {
        return campo.matches("\\d{2}\\d{2}\\d{4}");
    }

    @Override
    public boolean isRepeted(String campo) {
  
        for (int posicao = 0; posicao < Data.vetorTam; posicao++) {
            if(campo.equals(Data.dataVetor[posicao]))
            {
                return true;
            }
        }
        return false;
    }
    
}
