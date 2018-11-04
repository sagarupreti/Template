/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal.util;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ideapad-520S
 */
public class DirCommand extends Doscommand {

    @Override
    public void execute(String[] tokens) throws IOException {
        String path=(tokens.length==1)?".":tokens[1];
        File folder=new File(path);
        for(File file:folder.listFiles()){
            System.out.println(file.getAbsoluteFile() .getName());
            
        }
    } 
    
}
