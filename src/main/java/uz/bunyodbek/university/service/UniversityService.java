package uz.bunyodbek.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bunyodbek.university.model.Result;
import uz.bunyodbek.university.model.University;
import uz.bunyodbek.university.repository.UniversityRepo;
@Service
public class UniversityService {


    @Autowired
    UniversityRepo universityRepo;


    public Result createUniver(University university){
        University university1 = new University();

        university1.setName(university.getName());
        university1.setAddress(university.getAddress());
        universityRepo.save(university1);

        return new Result(true,"Create");
    }




}
