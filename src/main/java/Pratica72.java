
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import utfpr.ct.dainf.if62c.pratica.ContadorPalavras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public class Pratica72 {
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        
        String end = "C:\\Documents and Settings\\Jhonatan\\Desktop\\teste.txt";
        ContadorPalavras CP = new ContadorPalavras(end);
        BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(end+".out"));
        
        Map<String, Integer> map = CP.getPalavras();
        map = new java.util.TreeMap<>(map);
        
        for (String s: map.keySet()) {
            Integer i = map.get(s);
            bw.write(s + " " + i);
            bw.newLine();
        }
        
        /*String format = "%-20s %-20s";
        System.out.println(String.format(format, "Palavra", "Conta"));
        for (String s: map.keySet()) {
            Integer i = map.get(s);
            System.out.println(String.format(format, s, i));
        }*/
        
        bw.close();
    }
}