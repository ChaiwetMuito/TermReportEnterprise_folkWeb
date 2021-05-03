/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author YUME
 */
@Path("folktales")
public class FolkTales {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FolkTales
     */
    public FolkTales() {
    }

    /**
     * Retrieves representation of an instance of services.FolkTales
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
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

    /**
     * PUT method for updating or creating an instance of FolkTales
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
