package com.example.uproot;
import java.util.*;
import java.sql.*;
import javafx.util.*;

public class Crud
{

	 @SuppressWarnings("restriction")
	public  Pair<ResultSet,Connection> Connect()  throws ClassNotFoundException, SQLException
	 
     {
		      
		      String myDriver = "com.mysql.cj.jdbc.Driver"	;
		      String myUrl = "jdbc:mysql://localhost:3306/projectnilesh?allowPublicKeyRetrieval=true&useSSL=false";
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, "root", "password");

		      String query = "SELECT * FROM birth";

		     
		      Statement st = conn.createStatement();
		      
		      ResultSet rs = st.executeQuery(query);
		    
		     
		     return new Pair<ResultSet,Connection>(rs,conn);	 	
		     
	 }

}
