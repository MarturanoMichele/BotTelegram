/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelegramApi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author marturano_michele
 */
public class TelegramApi {

    public void test() {
        System.out.println("sono la libreria");
    }
    public void test2(){
        String jsonString = "{ciao:'mamma'}";
        JSONObject obj = new JSONObject(jsonString);
        String ciao = obj.getString("ciao");
        System.out.println(ciao);

        TelegramApi a = new TelegramApi();
        a.test();

        String path = "D:\\Marturano/salvaFile.csv";
        File file = new File(path);
        FileWriter fw;
        try {
            fw = new FileWriter(file);
            fw.write(ciao);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(TelegramApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
