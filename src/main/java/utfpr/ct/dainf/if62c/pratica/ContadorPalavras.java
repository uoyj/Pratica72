/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Jhonatan
 */
public class ContadorPalavras {
    
    private BufferedReader reader;
    private HashMap<String, Integer> map = new HashMap<>();
    private String line;
    
    public ContadorPalavras(FileReader in) {
        reader = new BufferedReader(in);
    }
    
    public HashMap<String, Integer> getPalavras() throws IOException
    {
        line = reader.readLine();
        while(line!=null)
        {
            line = line.replace(".", " ").replace("?", " ").replace("!"
                    , " ").replace(";", " ").replace(","," ").replace("\n",
                    " ").replace("\t", " ");
            String []trecho = line.trim().split(" ");
            for(String s: trecho)
            {
                if(!s.equals(""))
                {
                    if(map.containsKey(s))
                        map.put(s, map.get(s)+ 1);
                    else map.put(s, 1);
                }
            }
            line = reader.readLine();
        }
        return map;
    }
}
