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
public interface General {
    public abstract boolean isEmpty(final String campo, final String mascara);
    public abstract boolean isRight(final String campo, final String regex);
    public abstract boolean isRepeted(final String campo, final int tam, final String vetor[]);
}
