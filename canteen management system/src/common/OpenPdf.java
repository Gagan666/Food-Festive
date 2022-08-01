/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author Tanmai
 */
public class OpenPdf {
    public static void OpenById(String id){
        try{
        if(new File("E:\\"+id+".pdf")).exists()){
            Process p=Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FillProtocolHandler E:\\"+id+".pdf")      
        }
        else
          JOptionPane.showMessageDialog(null, "File doesnot Exists");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
