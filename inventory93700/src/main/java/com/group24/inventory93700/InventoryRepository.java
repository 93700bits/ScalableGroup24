package com.group24.inventory93700;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepository {

	static Connection conn=null;
	static String cdriver="driver_class_name";
	static String url = "db.url";
	static String user = "db.username";
	static String pwd = "db.password";
	private static Properties properties=null;
	public void connectiondetails() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		properties =new Properties();
		properties.load(new FileInputStream("src/database.properties"));
		Class.forName (properties.getProperty(cdriver));
		conn = DriverManager.getConnection (properties.getProperty(url), properties.getProperty(user), properties.getProperty(pwd));
		
//		String invData="";
//		String insertSQL = "INSERT INTO inventory.inventory (prodID, prodAvailability,category) VALUES (?, ?,?)";
//		PreparedStatement preparedStatement = conn.prepareStatement(insertSQL);
//		preparedStatement.setInt(1, 6);
//		preparedStatement.setString(2, "yes");
//		preparedStatement.setString(3, "Fiction");
//		preparedStatement.executeUpdate();
		
		
	}
	public List<String> displayAll() throws SQLException {
		String invData="";
		List<String> l=new ArrayList<String>();
		List<String> sl=new ArrayList<String>();
		Statement st=conn.createStatement();
		String query="select * from inventory.inventory where invID";
		ResultSet rs=st.executeQuery(query);
		ResultSetMetaData rsmd=rs.getMetaData();
		int colmnNo=rsmd.getColumnCount();
		while(rs.next()) {
			for(int i=1;i<=colmnNo;i++) {
				if(i<1)System.out.println(", ");
				String colVal=rs.getString(i);
				l.add(colVal);
				System.out.println(rsmd.getColumnName(i)+ " : " +colVal);
			}
			System.out.println("");
		}
		return l;
//			invData=rs.getInt(1)+" : "+rs.getInt(2)+" : "+rs.getString(3)+" : "+rs.getString(4);
//			System.out.println(invData);	
//			l.add(rs.getString(1));
//			l.add(rs.getString(2));
//			l.add(rs.getString(3));
//			l.add(rs.getString(4));
//			System.out.println();
//		}
//			
//		return l;
	}
	
}
