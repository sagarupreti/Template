/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ideapad-520S
 */
public class TypeCommand extends Doscommand {

    @Override
    public void execute(String[] tokens) throws IOException {
        if (tokens.length > 1) {
            try (BufferedReader reader = new 
        BufferedReader(new FileReader(tokens[1]))) {
                String line = "";
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);

                }
            }

        } else {
            System.out.println("The syntax of the command is incorrect.");
        }
    }

}
