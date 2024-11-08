package uz.bunyodbek.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.bunyodbek.university.dto.UniversityDto;
import uz.bunyodbek.university.model.Result;
import uz.bunyodbek.university.model.University;
import uz.bunyodbek.university.service.UniversityService;

import java.util.List;

@RestController
public class UniversityController {


    @Autowired
    UniversityService universityService;

    @PostMapping("/university")
    public Result add(@RequestBody UniversityDto universityDto) {
        Result univer = universityService.createUniver(universityDto);
        return univer;
    }


    @GetMapping("/universitys")
    public List<University> getall() {
        List<University> list = universityService.getAllUniversity();
        return list;
    }

    @GetMapping("/university/{id}")
    public University getid(@PathVariable Integer id) {
        University service = universityService.getByIdUniversity(id);
        return service;
    }


    @PutMapping("/university/{id}")
    public Result edit(@PathVariable Integer id, @RequestBody UniversityDto universityDto) {
        Result result = universityService.updateUniver(id, universityDto);
        return result;
    }

    @DeleteMapping("/university/{id}")
    public Result del(@PathVariable Integer id) {
        Result result = universityService.deleteUniver(id);
        return result;
    }


}
