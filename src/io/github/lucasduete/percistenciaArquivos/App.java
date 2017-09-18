/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.percistenciaArquivos;

import io.github.lucasduete.percistenciaArquivos.dao.GenericDaoBinario;
import io.github.lucasduete.percistenciaArquivos.model.Pessoa;
import java.io.IOException;

/**
 *
 * @author lucasduete
 */
public class App {
    public static void main(String[] args) {
        
        try {
            GenericDaoBinario<Pessoa> dao = new GenericDaoBinario<>("Pessoa.bin");
        
            dao.salvar(new Pessoa("Lusca", 19));
            dao.salvar(new Pessoa("Jose", 27));
            dao.salvar(new Pessoa("Maria", 27));
            
            System.out.println(dao.listar());
            
            dao.deletar(new Pessoa("Jose", 27));
            
            System.out.println(dao.listar());
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
}

