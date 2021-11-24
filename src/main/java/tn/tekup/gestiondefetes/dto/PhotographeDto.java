package tn.tekup.gestiondefetes.dto;

import lombok.Builder;
import lombok.Data;
import tn.tekup.gestiondefetes.model.Client;
import tn.tekup.gestiondefetes.model.Photographe;

@Data
@Builder
public class PhotographeDto {

	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	

	

}
