/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.percistenciaArquivos;

import io.github.lucasduete.percistenciaArquivos.model.Pessoa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lucasduete
 */
public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("Pessoa.bin");
        
        if (!f.exists())
            f.createNewFile();
        
//        ESCREVER
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
//        
//        Pessoa p = new Pessoa("Lusca", 17);
//        out.writeObject(p);
//        out.close();
        
//        LER
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
//        Pessoa p = (Pessoa) in.readObject();
//        System.out.println(p);
    }
}

