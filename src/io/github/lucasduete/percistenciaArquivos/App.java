/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.percistenciaArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JFileChooser;

/**
 *
 * @author lucasduete
 */
public class App {
    public static void main(String[] args) {
        
//        File f = new File("/home/lucasduete/Documents/arquivozin.txt");
        
//        System.out.println(f.exists());
//        System.out.println(f.isFile());
//        System.out.println(f.isDirectory());
//        System.out.println(f.canExecute());
//        System.out.println(f.canWrite());
//        System.out.println(f.canRead());
//        System.out.println(new Date(f.lastModified()));
//        try {
//            f.createNewFile();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }
//        f.delete();

//        System.out.println(f.getParent());

//        File f = new File("/home/lucasduete/Documents/");
//        
//        System.out.println(Arrays.toString(f.list()));
//        
//        File arquivos[] = f.listFiles();
//        for(File arquivo: arquivos) {
//            
//        }

//        JFileChooser chooser = new JFileChooser("/");
//        
////        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//        chooser.setApproveButtonText("ABRIR!");
//        chooser.setDialogTitle("Escolher Arquivo");
//        chooser.setMultiSelectionEnabled(true);
//        
//        switch (chooser.showOpenDialog(null)) {
//            case JFileChooser.APPROVE_OPTION:
//                File f = chooser.getSelectedFile();
//                System.out.println(f.length() + " Bytes");
//                break;
//            case JFileChooser.CANCEL_OPTION:
//                System.err.println("Cancelou");
//                break;
//        }

        File f = new File("/home/lucasduete/Documents/arquivozin.txt");
        
        try {
            BufferedWriter writer = new BufferedWriter(
                new PrintWriter(
                        new FileWriter(f, false), true));
            
            writer.write("HU3 HU3 HU3 HU3 HU3");
            writer.newLine();
            writer.close();
        }  catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            
            //System.out.println(reader.readLine());
            
            String s = reader.readLine();
            
            while(s != null) {
                System.out.println(s);
                s = reader.readLine();
            }
                
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

    }
}

