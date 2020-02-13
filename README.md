# ValidadorBr
Api Java para validacao de Campos etc.

Como usar-lo.


Simplesmente chame a classe de validação e seja feliz.

Exemplo:

private JTextField campo;
//................................//
  toda implementação do código;
-//

//verifica se o campo está vázio.
//se sim, retorna true, senão retorna false;
General.getInstancia().isEmpty(this.campo.getText()); 

