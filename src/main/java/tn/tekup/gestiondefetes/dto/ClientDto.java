package tn.tekup.gestiondefetes.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;
import tn.tekup.gestiondefetes.model.Client;


@Data
@Builder
public class ClientDto {

	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	@JsonIgnore
	private List<ReservationDto> reservations;
	
	
	

}
