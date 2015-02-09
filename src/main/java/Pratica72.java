
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
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
        String end = "C:/Documents and Settings/Jhonatan/Desktop/teste.txt";
        FileReader fr = new FileReader(end);
        ContadorPalavras CP = new ContadorPalavras(fr);
        
        HashMap<String, Integer> map = CP.getPalavras();
        
        String format = "%-20s %-20s";
        System.out.println(String.format(format, "Palavra", "Conta"));
        for (String s: map.keySet()) {
            Integer i = map.get(s);
            System.out.println(String.format(format, s, i));
        }       
    }
}