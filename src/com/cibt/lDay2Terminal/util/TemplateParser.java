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
public class TemplateParser {
    private String LeftDelim,rightDelim,content;
    private Map<String,String> params;

    public TemplateParser(String LeftDelim, String rightDelim, String content, Map<String, String> params) {
        this.LeftDelim = LeftDelim;
        this.rightDelim = rightDelim;
        this.content = content;
        this.params = new HashMap<>();
        
    }

    public TemplateParser(String string, String string0, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public TemplateParser addKey(String key,String value){
        params.put(key,value);
        return this;
    }
    
        public String parse(){
            String finalcontent="";
            for(String key:params.keySet()){
                finalcontent=content;
                finalcontent=finalcontent.replace(LeftDelim+key+rightDelim,
                        params.get(key));       
                
            }
            return finalcontent;
        }
}
