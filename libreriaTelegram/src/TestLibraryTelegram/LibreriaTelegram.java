/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibraryTelegram;

import org.json.*;
import TelegramApi.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marturano_michele
 */
public class LibreriaTelegram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        TelegramApi a =new TelegramApi();
        a.sendMessage("ciao","lu");
        
    }
}
