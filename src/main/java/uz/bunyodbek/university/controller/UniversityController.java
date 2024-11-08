package uz.bunyodbek.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.bunyodbek.university.model.Result;
import uz.bunyodbek.university.model.University;
import uz.bunyodbek.university.service.UniversityService;

@RestController
public class UniversityController {


    @Autowired
    UniversityService universityService;


    @PostMapping("/user")
    public Result add(@RequestBody University university){
        Result univer = universityService.createUniver(university);
        return univer;
    }



}
