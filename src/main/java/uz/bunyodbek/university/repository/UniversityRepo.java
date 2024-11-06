package uz.bunyodbek.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bunyodbek.university.model.University;

public interface UniversityRepo extends JpaRepository<University,Integer> {
}
