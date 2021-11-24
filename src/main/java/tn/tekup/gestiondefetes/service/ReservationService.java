package tn.tekup.gestiondefetes.service;

import java.util.List;

import tn.tekup.gestiondefetes.model.Reservation;

public interface ReservationService {

	List<Reservation> getAllReservation();
	Reservation createOrUpdate(Reservation reservation);
	void deleteReservation(Long id);
}
