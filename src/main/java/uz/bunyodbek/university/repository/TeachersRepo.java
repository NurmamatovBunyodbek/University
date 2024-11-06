package uz.bunyodbek.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bunyodbek.university.model.Teachers;

public interface TeachersRepo extends JpaRepository<Teachers,Integer> {
}
