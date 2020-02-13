/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validacao.dados;

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
        return campo.equals("00\\00\\0000")||
               campo.equals("11\\11\\1111")||
               campo.equals("22\\22\\2222")||
               campo.equals("33\\33\\3333")||
               campo.equals("44\\44\\4444")||
               campo.equals("55\\55\\5555")||
               campo.equals("66\\66\\6666")||
               campo.equals("77\\77\\7777")||
               campo.equals("88\\88\\8888")||
               campo.equals("99\\99\\9999")||
               campo.length()!= 10;
    }
    
}
