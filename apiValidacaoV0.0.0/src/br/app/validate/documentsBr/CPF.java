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
public interface CPF {
    public abstract boolean isCPFValid(final String campo);
    public final static String[] cpfVetor = new String[]
    {
        "000.000.000-00",
        "111.111.111-11",
        "222.222.222-22",
        "333.333.333-33",
        "444.444.444-44",
        "555.555.555-55",
        "666.666.666-66",
        "777.777.777-77",
        "888.888.888-88",
        "999.999.999-99",
    };
    public static final int vetorTam = cpfVetor.length;
}
