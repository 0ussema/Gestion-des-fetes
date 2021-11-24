package tn.tekup.gestiondefetes.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import tn.tekup.gestiondefetes.model.Proprietaire;

@Data
@Builder
public class SalleDto {

	private Long id;
	
	private String name;
	
	private Integer capacite;
	
	private Proprietaire proprietaire;
	
	private List<ReservationDto> reservations;
	
	
}
