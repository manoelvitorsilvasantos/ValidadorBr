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
public interface IData {
    public abstract boolean isDateValid(String campo);
    public abstract boolean isRepeted(String campo);
    public final static String[] dataVetor= new String[]
    {
        "11/11/1111","22/22/2222","33/33/3333","44/44/4444","55/55/5555",
        "66/66/6666","77/77/7777","88/88/8888","99/99/9999","00/00/0000" 
    };
    public final static int vetorTam = dataVetor.length;
}
