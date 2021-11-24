package tn.tekup.gestiondefetes.dto;

import java.util.Date;


import lombok.Builder;
import lombok.Data;
import tn.tekup.gestiondefetes.model.Client;
import tn.tekup.gestiondefetes.model.Reservation;



@Data
@Builder
public class ReservationDto {

	private Long id;
	
	private SalleDto salle;

	private ClientDto client;
	
	private Date dateReservation;
	
	private Float prix;
	
	

}
