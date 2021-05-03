/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author YUME
 */
public class Folk {
    public String getFolkToy(){
        try {
            URL url = new URL("https://opend.data.go.th/opend-search/vir_9411_1609466306/query?");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");

            //adding header
            httpURLConnection.setRequestProperty("api-key", "n6g7OuyR86mVuPSmtjxgYNcl6QR6hs7e");
            httpURLConnection.setRequestProperty("dsname", "vir_9411_1609466306");
            httpURLConnection.setRequestProperty("path", "vir_9411_1609466306");
            httpURLConnection.setRequestProperty("loadAll", "1");
            httpURLConnection.setRequestProperty("type", "json");
            

            String line = "";
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder response = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
               }            
            bufferedReader.close();
            JSONObject jsonArray=new JSONObject(response.toString());
            //System.out.println(jsonArray.toString(4));
            return jsonArray.toString(4);
            } 
        catch (Exception e) {
            System.out.println("Error in Making Get Request");
            return "Error in Making Get Request";
        }
    
    }
    public String getFolkTale(){
        try {
            URL url = new URL("https://opend.data.go.th/opend-search/vir_8379_1607926453/query?");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");

            //adding header
            httpURLConnection.setRequestProperty("api-key", "n6g7OuyR86mVuPSmtjxgYNcl6QR6hs7e");
            httpURLConnection.setRequestProperty("dsname", "vir_8379_1607926453");
            httpURLConnection.setRequestProperty("path", "vir_8379_1607926453");
            httpURLConnection.setRequestProperty("loadAll", "1");
            httpURLConnection.setRequestProperty("type", "json");
            

            String line = "";
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder response = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
               }            
            bufferedReader.close();
            JSONObject jsonArray=new JSONObject(response.toString());
            //System.out.println(jsonArray.toString(4));
            return jsonArray.toString(4);
            } 
        catch (Exception e) {
            System.out.println("Error in Making Get Request");
            return "Error in Making Get Request";
        }
    
    }
}
