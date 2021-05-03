<%-- 
    Document   : folktoy
    Created on : May 1, 2021, 4:21:49 PM
    Author     : YUME
--%>

<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Folk Tale</title>
    </head>
    <body style="background-image: url('https://png.pngtree.com/thumb_back/fw800/background/20190222/ourmid/pngtree-dreamy-beautiful-fairy-tale-wind-mountain-background-design-backgroundbeautiful-backgroundfairytale-backgroundillustration-image_63793.jpg');">
        <center>
            <div style="background-color:hsla(9, 100%, 64%, 0.5);">
                <h1 style="color:#00cc99;">ข้อมูลนิทานพื้นบ้าน</h1>
        <%  
            JSONObject jsonObj = (JSONObject) request.getAttribute("folk");
            JSONArray jArr = jsonObj.getJSONArray("data");
        %>
        <h2 style="color:#00cc99;">จำนวนของนิทานพื้นบ้าน <%=jsonObj.getString("numData")%></h2>
            </div>
        <table border="1" style="background-color:#ffffff;">
     <thread>
          <tr>
            <th>ลำดับ</th>
            <th>Title</th>
            <th>Subject</th>
            <th>Description</th>
            <th>URL</th>
          </tr></thread>
          <%for (int i=0;i<jArr.length();i++){%>
          <tr>
          <form name="AddToCart"action="AddToCart" method="POST">
              <td><%= jArr.getJSONObject(i).getString("ลำดับ") %></td>
              <td><%= jArr.getJSONObject(i).getString("title") %></td>
              <td><%= jArr.getJSONObject(i).getString("subject") %></td>
              <td><%= jArr.getJSONObject(i).getString("description") %></td>
              <td><%= jArr.getJSONObject(i).getString("source.uri") %></td>
          </form>
          </tr>
          <%
               }
          %>
    </table>
    <a href="index.html">เมนูหลัก</a>
        </center>
    </body>
</html>
