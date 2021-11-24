package tn.tekup.gestiondefetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.tekup.gestiondefetes.model.Reservation;
import tn.tekup.gestiondefetes.repository.ReservationRepo;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepo reservationRepo;

	@Override
	public List<Reservation> getAllReservation() {
		return reservationRepo.findAll();
	}

	@Override
	public Reservation createOrUpdate(Reservation reservation) {
		return reservationRepo.save(reservation);
	}

	@Override
	public void deleteReservation(Long id) {
		reservationRepo.deleteById(id);
	}

}
