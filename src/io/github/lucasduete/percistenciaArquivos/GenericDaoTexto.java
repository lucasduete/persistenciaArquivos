/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.percistenciaArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasduete
 */
public class GenericDaoTexto <T>{
    
    private File arquivo;
    
    public GenericDaoTexto(String path) throws IOException {
        arquivo = new File(path);
        
        if(!arquivo.exists()) 
            arquivo.createNewFile();
    }
    
    public boolean salvar(T obj) throws IOException {  
        BufferedWriter writer = new BufferedWriter(
            new PrintWriter(
                new FileWriter(arquivo, true), true));
        
        writer.write(obj.toString());
        writer.newLine();
            
        writer.close();        
        return true;
    }
    
    public List<T> listar() {
        List<T> list = null;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            
            String linha = reader.readLine();
            list = new ArrayList<>();
            
            while(linha != null) {
                T obj = (T) linha;
                list.add(obj);
                linha = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
}
