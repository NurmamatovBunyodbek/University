package uz.bunyodbek.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bunyodbek.university.model.Kafedra;

public interface KafedraRepo extends JpaRepository<Kafedra,Integer> {
}
