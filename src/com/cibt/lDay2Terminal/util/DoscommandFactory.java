/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.lDay2Terminal.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ideapad-520S
 */

public class DoscommandFactory {
    private static Map<String,Doscommand> commands=initcommands();
     
    private static Map<String,Doscommand> initcommands(){
         Map<String,Doscommand> commands=new HashMap<>();
        commands.put("md",new MDcommand());
        commands.put("rd",new RdCommand());
        commands.put("dir",new DirCommand());
        commands.put("type",new TypeCommand());
        commands.put("creat",new creatFileCommand());  
        commands.put("exit",new ExitCommand());
        return commands;
        
        
    }
    public static Doscommand get(String param){
        //initcommands();
        if(commands.containsKey(param)){
            return commands.get(param);
        }
        return null;
    }
}
  