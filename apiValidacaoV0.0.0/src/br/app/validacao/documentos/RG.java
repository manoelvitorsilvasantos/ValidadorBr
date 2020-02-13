/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validacao.documentos;

/**
 *
 * @author mvictor
 */
public interface RG {
    public abstract boolean isRGValid(final String campo);
    public final static String[] rgVetor = new String[]
    {
        "00.000.000-0",
        "11.111.111-1",
        "22.222.222-2",
        "33.333.333-3",
        "44.444.444-4",
        "55.555.555-5",
        "66.666.666-6",
        "77.777.777-7",
        "88.888.888-8",
        "99.999.999-9",
    };
    public static final int vetorTam = rgVetor.length;
}
