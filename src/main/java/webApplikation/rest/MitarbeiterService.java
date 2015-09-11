package webApplikation.rest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import webApplikation.model.Mitarbeiter;

@Path("/mitarbeiter")

public class MitarbeiterService 
{
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Mitarbeiter> getMitarbeiter()
	{
		ArrayList<Mitarbeiter> lstMitarbeiter = new ArrayList<Mitarbeiter>();
		Mitarbeiter worker = new Mitarbeiter();
		worker.Vorname = "Christian";
		lstMitarbeiter.add(worker);
		
		Mitarbeiter worker2 = new Mitarbeiter();
		worker2.Vorname = "Peter";
		lstMitarbeiter.add(worker2);
		return lstMitarbeiter;
	}
}
