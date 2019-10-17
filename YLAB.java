/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ylab;

import java.io.*;
import net.sourceforge.tess4j.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;  

/**
 *
 * @author BAYRAMOGLU
 */
public class YLAB {
    
    public static void main(String[] args) throws TesseractException, ParseException
    {

  File imageFile = new File("C:\\Users\\BAYRAMOGLU\\Desktop\\fis.jpg");
         Tesseract instance = Tesseract.getInstance(); //
         instance.setDatapath ("C:\\Users\\BAYRAMOGLU\\Desktop\\Tess4J\\tessdata");
         instance.setLanguage("tur");
          String result = instance.doOCR(imageFile);
          //System.out.println(result);
          
          String[] bolunmus=result.split("\n");
         
         int i=0;
         for (String tempParsedStr : bolunmus) 
         {
                        i++;
         }
         
         String[] mm=new String[i]; 
         
         i=0;
         for (String tempParsedStr : bolunmus) 
         {
                        mm[i]= tempParsedStr;
                        i++;
         }
         
               System.out.println("\n\n");  
               int k;
         
        for(k=0;k<i;k++)
        {
           System.out.println(mm[k]);
        }
        
        System.out.println("\n\n");  
        
        
        
        
        int j;
        for(j=0;j<i;j++)
        {
            String[] boldu=mm[j].split(" ");
            for (String tempParsedStr : boldu) 
         { 
	System.out.println(tempParsedStr);
        if(tempParsedStr.matches("^(0?[1-9]|[12][0-9]|3[01])[\\.\\-](0?[1-9]|1[012])[\\.\\-]\\d{4}$") != true)
        {
        } else {
            System.out.println("TARİH BULUNDU\n\n");
                }
        }
      
        
        }
         
    }
}
   
