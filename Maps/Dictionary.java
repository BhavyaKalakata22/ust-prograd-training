package com.company;
import java.util.HashMap;
    public class Dictionary extends HashMap<String,String>
    {
        public void newEntry(String key, String value){
            put(key,value);
        }
        public String look(String key){
            return getOrDefault(key, "Cant find entry for " + key);
        }
    }

