/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.percistenciaArquivos;

import io.github.lucasduete.percistenciaArquivos.model.Pessoa;
import java.io.IOException;

/**
 *
 * @author lucasduete
 */
public class App {
    public static void main(String[] args) {
        try {
            GenericDaoTexto<Pessoa> dao = new GenericDaoTexto<>("Pessoa.txt");
            
            dao.salvar(new Pessoa("Lusca", 19));
            
            System.out.println(dao.listar());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

