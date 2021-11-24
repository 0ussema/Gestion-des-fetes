package tn.tekup.gestiondefetes.dto;

import lombok.Builder;
import lombok.Data;
import tn.tekup.gestiondefetes.model.Admin;

@Data
@Builder
public class AdminDto {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;

	

}
