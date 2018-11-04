/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal;

import com.cibt.lDay2Terminal.healper.FileHealper;
import com.cibt.lDay2Terminal.util.TemplateParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ideapad-520S
 */
public class program1 {

    public static void main(String[] args){
        try {
             String content = FileHealper.reader("e:/mytextfile.txt");
            List<String> names = new ArrayList<>();
            names.add("pratiksha");
            names.add("Dinesh");
            names.add("anish");
            names.add("sagar");
            names.add("Trimik");
            String course = "Advanced Java";
            String Date = new Date().toString();
            TemplateParser parser = new TemplateParser("{", "}", content);
            parser.addKey("Course", course).addKey("Date", Date);
            for (String name : names) {
                //System.out.println(name);
                parser.addKey("Name", name);
                System.out.println(parser.parse());

            }
        }
            catch(IOException ioe){
        System.out.println(ioe.getMessage());
        
    }

        }
    }
}
    
