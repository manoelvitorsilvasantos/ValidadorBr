package br.app.validate.master;


import br.app.validacao.documentos.CPF;
import br.app.validacao.documentos.Pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvictor
 */
public class Main {
    public Main()
    {
        super();
        INICIAR();
    }
    
    public static void main(String[] args)
    {
        new Thread(){
            @Override
            public void run()
            {
                new Main();
            }
        }.start();
    }

    private void INICIAR() {
        String cpf = "111.111.111-11";
        if(Pessoa.getInstancia().isRepeted(cpf,CPF.vetorTam, CPF.cpfVetor))
        {
            System.out.println("CPF INVALIDO");
        }
        else{
            System.out.println("CPF VÁLIDO");
        }
    }
}
