package com.group24.inventory93700;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Inventory93700Application {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		SpringApplication.run(Inventory93700Application.class, args);		
		InventoryRepository invRep= new InventoryRepository();
		invRep.connectiondetails();
		invRep.displayAll();}

	}


