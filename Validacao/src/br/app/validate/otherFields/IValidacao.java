/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.otherFields;

/**
 *
 * @author mvictor
 */
public interface IValidacao {
    //verifica se o campo é válido.
    public abstract boolean isEmpty(final String Campo);
    //verifica se o campo é nulo.
    public abstract boolean isNull(final String Campo);
}
