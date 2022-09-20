package com.capgemini.client;
import java.time.LocalDate;


import com.capgemini.entities.Placement;
import com.capgemini.services.PlacementService;
import com.capgemini.services.PlacementServiceImpl;

public class Client2 {
public static void main(String[] args) {
	
	Placement placement=new Placement();
	PlacementService service=new PlacementServiceImpl();

	placement.setId(52);
	placement.setName("Capgemini");
	placement.setQualification("B.tech");
	placement.setYear(2022);
	placement.setLocaldate(LocalDate.of(2022, 9, 19));
	
	Placement placement1=new Placement();
	placement1.setId(54);
	placement1.setName("TCS");
	placement1.setQualification("B.tech");
	placement1.setYear(2022);
	placement1.setLocaldate(LocalDate.now());
	
		
	// one to many
	   service.addPlacement(placement);
	   service.addPlacement(placement1);
	  
		
		
		System.out.println("Data inserted");

}
		
}
