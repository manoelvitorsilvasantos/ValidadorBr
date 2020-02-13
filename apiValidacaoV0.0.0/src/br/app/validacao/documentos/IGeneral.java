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
public interface IGeneral {
    public abstract boolean isValid(final String Campo, final String Expressao);
    public abstract boolean isEmpty(final String Campo, final String Mascara);
}
