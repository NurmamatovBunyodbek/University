package uz.bunyodbek.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bunyodbek.university.dto.UniversityDto;
import uz.bunyodbek.university.model.Result;
import uz.bunyodbek.university.model.University;
import uz.bunyodbek.university.repository.UniversityRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {


    @Autowired
    UniversityRepo universityRepo;

    //read
    public List<University> getAllUniversity(){
        List<University> list = universityRepo.findAll();
        return list;
    }

    // read id
    public University getByIdUniversity(Integer id){
        Optional<University> optional = universityRepo.findById(id);
        return optional.get();
    }

    // create

    public Result createUniver(UniversityDto universityDto){
        University university = new University();

        university.setName(universityDto.getName());
        university.setAddress(universityDto.getAddress());
        universityRepo.save(university);
        return new Result(true,"Create");
    }


    // update

    public Result updateUniver(Integer id , UniversityDto universityDto){

        Optional<University> universityOptional = universityRepo.findById(id);

        if (universityOptional.isPresent()){
            University university = universityOptional.get();

            university.setName(universityDto.getName());
            university.setAddress(universityDto.getAddress());

            universityRepo.save(university);
            return new Result(true,"Updated");

        }
        return new Result(false,"Universitet not found");

    }

    // delete
    public Result deleteUniver(Integer id){
        universityRepo.deleteById(id);
        return new Result(true,"Deleted");
    }







}
