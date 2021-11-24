package tn.tekup.gestiondefetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.gestiondefetes.model.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
