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
public interface GENERAL {
    public abstract boolean isEmpty(final String campo, final String mascara);
    public abstract boolean isNull(final String campo);
    public abstract boolean isRight(final String campo, final String mascara);
}
