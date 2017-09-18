/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.percistenciaArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasduete
 */
public class GenericDaoBinario <T> {
    
    private File arquivo;
    
    public GenericDaoBinario(String path) throws IOException {
        arquivo = new File(path);
        
        if (!arquivo.exists())
            arquivo.createNewFile();
       
    }
    
    public List<T> listar() throws IOException, ClassNotFoundException {
        if (arquivo.length() == 0)
            return new ArrayList<>();
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
        
        List<T> lista = (List<T>) in.readObject();
        in.close();
        return lista;
    }
    
    public boolean salvar(T obj) throws IOException, ClassNotFoundException {
        List<T> lista = listar();
        
        if (lista.add(obj)) {
            atualizarArquivo(lista);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean deletar(T obj) throws IOException, ClassNotFoundException {
        List<T> lista = listar();
        
        if(lista.remove(obj)) {
            atualizarArquivo(lista);
            return true;
        } else {
            return false;
        }
    }
    
    private void atualizarArquivo(List<T> lista) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
        
        out.writeObject(lista);
        out.close();
    }
    
}