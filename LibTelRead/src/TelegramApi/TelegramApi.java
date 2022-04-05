/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelegramApi;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author marturano_michele
 */
public class TelegramApi {

    String botKey = "5216980306:AAG6Zkbt0P0mUtCFHZ1tHeRCgLqXHgpFQ-4";

    public void test() {
        System.out.println("sono la libreria");
    }

    public void jsonParser() {
        String jsonString = "{ciao:'lucaIlPesciolino'}";
        JSONObject obj = new JSONObject(jsonString);
        String ciao = obj.getString("ciao");
        System.out.println(ciao);

        TelegramApi a = new TelegramApi();
        a.test();

        String path = "D:\\BotTelegram/salvaFile.csv";
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

    public void sendMessage(String id, String message) throws MalformedURLException, IOException {
        id="196356323";
        message="istria";
        URL url = new URL("https://api.telegram.org/bot" + botKey + "/sendMessage?chat_id=" + id + "&text=" + message);
        URLConnection con = url.openConnection();
        InputStream is = new BufferedInputStream(con.getInputStream());
    }
    
    public void getJson() throws IOException{
        String temp = "";
        URL url = new URL("https://api.telegram.org/bot" + "chiaveBotTG" + "/getUpdates");
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        if (conn.getResponseCode() == 200) {//200 indica che la richiesta è andata a buon fine
            Scanner scan = new Scanner(url.openStream());
            while (scan.hasNext()) {
                temp += scan.nextLine();
            }
        }
        JSONObject json = new JSONObject(temp);
    }
}
