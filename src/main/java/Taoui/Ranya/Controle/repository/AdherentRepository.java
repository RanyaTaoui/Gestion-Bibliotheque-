package Taoui.Ranya.Controle.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Taoui.Ranya.Controle.model.Adherent;
import Taoui.Ranya.Controle.model.Emprunt;

@Repository
public interface AdherentRepository extends JpaRepository<Adherent, Integer> {
@Query("select e from Emprunt e where e.adherent.numero=:id ")
List<Emprunt> getEmprunts(@Param("id")int id);
}
