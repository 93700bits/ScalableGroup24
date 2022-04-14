package com.group24.inventory93700;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.corba.se.impl.naming.pcosnaming.NameService;


@RestController 
public class InventoryController {

	@Autowired
	InventoryRepository invRep;
	@GetMapping("/inventory")  
	public Inventory retriveInventoryDetails()  
	{  
	return new Inventory(3,5,"No","Fiction");  
	} 
	@GetMapping(value = "/inventory/all")
	public @ResponseBody List<String> getAllDetails() throws SQLException{
		return invRep.displayAll();
	}
}
