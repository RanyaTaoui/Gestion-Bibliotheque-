package Taoui.Ranya.Controle.repository;
import java.util.List; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import Taoui.Ranya.Controle.model.LivreRANTAO;
@Repository
public interface LivreRANTAORepository extends JpaRepository<LivreRANTAO, Integer>{
	@Query("Select l from LivreRANTAO l where page>=300")
	List<LivreRANTAO> getLivres();
}
