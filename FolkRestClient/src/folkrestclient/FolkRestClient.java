/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folkrestclient;

import java.io.StringReader;
import javax.naming.spi.DirStateFactory.Result;
import javax.xml.bind.JAXB;
import org.json.JSONArray;
import org.json.JSONObject;
import util.FolkTalesClient;
import util.FolkToyClient;

/**
 *
 * @author YUME
 */
public class FolkRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FolkToyClient toy = new FolkToyClient();
        String strjson = toy.getJson();
        System.out.println("***************************** FOLK TOYS *****************************");
        System.out.println(strjson);
        JSONObject jsonObj = new JSONObject(strjson);
        System.out.println("Number of DATA :" + jsonObj.getString("numData"));
        JSONArray jArr = jsonObj.getJSONArray("data");
        for (int i=0;i<jArr.length();i++){
                System.out.println("NO. : "+jArr.getJSONObject(i).getString("ลำดับ"));
                System.out.println("Title : "+jArr.getJSONObject(i).getString("title"));
                System.out.println("subject : "+jArr.getJSONObject(i).getString("subject"));
                System.out.println("description : "+jArr.getJSONObject(i).getString("description"));
                System.out.println("URL : "+jArr.getJSONObject(i).getString("source.uri"));
                System.out.println("===========================================================\n");
        }
        FolkTalesClient tale = new FolkTalesClient();
        String strjsonTale = tale.getJson();
        System.out.println("***************************** FOLK TALES *****************************");
        System.out.println(strjsonTale);
        JSONObject jsonObjTale = new JSONObject(strjsonTale);
        System.out.println("Number of DATA :" + jsonObjTale.getString("numData"));
        JSONArray jsonArrTale = jsonObjTale.getJSONArray("data");
        for (int i=0;i<jsonArrTale.length();i++){
                System.out.println("NO. : "+jsonArrTale.getJSONObject(i).getString("ลำดับ"));
                System.out.println("Title : "+jsonArrTale.getJSONObject(i).getString("title"));
                System.out.println("subject : "+jsonArrTale.getJSONObject(i).getString("subject"));
                System.out.println("description : "+jsonArrTale.getJSONObject(i).getString("description"));
                System.out.println("URL : "+jsonArrTale.getJSONObject(i).getString("source.uri"));
                System.out.println("===========================================================\n");
            }
        // TODO code application logic here
    }
    
}
