/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal.util;

import java.io.IOException;

/**
 *
 * @author ideapad-520S
 */
public class ExitCommand extends Doscommand  {

    @Override
    public void execute(String[] tokens) throws IOException {
        System.exit(0);
        
    }
    
    
}
