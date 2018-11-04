/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal;

import com.cibt.lDay2Terminal.util.Doscommand;
import com.cibt.lDay2Terminal.util.DoscommandFactory;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ideapad-520S
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            String line = input.nextLine();
            String[] tokens = line.split(" ");
            try {
                Doscommand cmd = DoscommandFactory.get(tokens[0]);
                if(cmd!=null){
                    cmd.execute(tokens);
                    }else{
                     System.out.println("invalid Command");
                }
                }catch (IOException ioe) {
                System.out.println(ioe.getMessage());

            }
            }
        }

    }
