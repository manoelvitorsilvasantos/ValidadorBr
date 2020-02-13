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
public interface ICEP {
    public abstract boolean isValidCep(final String Campo);
    public abstract boolean isEmpty(final String Campo, final String mascara);
    public abstract boolean isRepeted(final String campo);
    public static final String[] cepVetor =  new String[]{
      "00.000-000","11.111-111","22.222-222","33.333-333","44.444-444",
      "55.555-555","66.666-666","77.777-777","88.888-888","99.999-999"
    };
    public final static int vetorTam = cepVetor.length; 
}
