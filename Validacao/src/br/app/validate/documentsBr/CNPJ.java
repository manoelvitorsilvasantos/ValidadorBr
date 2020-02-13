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
public interface CNPJ {
    public abstract boolean isCNPJValid(final String campo);
    
    public final static String[] VetorCNPJ = new String[]
    {
        "00.000.000/0000-00",
        "11.111.111/1111-11",
        "22.222.222/2222-22",
        "33.333.333/3333-33",
        "44.444.444/4444-44",
        "55.555.555/5555-55",
        "66.666.666/6666-66",
        "77.777.777/7777-77",
        "88.888.888/8888-88",
        "99.999.999/9999-99",
    };
    public static final int sizeCNPJ = VetorCNPJ[0].length();
}
