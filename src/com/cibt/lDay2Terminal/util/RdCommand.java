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
public class RdCommand extends Doscommand {

    @Override
    public void execute(String[] tokens) throws IOException {
        if (tokens.length > 1) {
            File file = new File(tokens[1]);
            file.delete();

        } else {
            System.out.println("The syntax of the command is incorrect.");
        }
    }

}
