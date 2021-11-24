package tn.tekup.gestiondefetes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import tn.tekup.gestiondefetes.model.Reservation;
import tn.tekup.gestiondefetes.service.ReservationService;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping
	public List<Reservation> getAllReservation(){
		return reservationService.getAllReservation();
	}

	@PostMapping
	public Reservation creatOrUpdate(@RequestBody Reservation reservation) {
		return reservationService.createOrUpdate(reservation);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReservation(@PathVariable Long id) {
		reservationService.deleteReservation(id);	
	}
}
