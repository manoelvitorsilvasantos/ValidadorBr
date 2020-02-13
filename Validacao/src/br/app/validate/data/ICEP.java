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
public interface ICEP {
    public abstract boolean isValidCep(final String Campo);
    public abstract boolean isEmpty(final String Campo, final String mascara);
    public abstract boolean isRepeted(final String campo);
}
