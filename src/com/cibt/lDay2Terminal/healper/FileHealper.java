/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal.healper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ideapad-520S
 */
public class FileHealper {
    public static String reader(String fileName)
            throws IOException{
        BufferedReader reader=
                new BufferedReader
                       (new FileReader("fileName"));
                                
            String line="";
            StringBuilder content=new StringBuilder();
            while((line=reader.readLine())!=null){
              content.append(line).append("\r\n");
             
            }
          reader.close();
          return content.toString();
    }
}
