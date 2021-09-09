package net.guides.springboot2.crud.controller;


import net.guides.springboot2.crud.model.Home;
import net.guides.springboot2.crud.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private HomeRepository homeRepository;

    @CrossOrigin
    @PostMapping("/homes")
    public Home createHome(@Valid @RequestBody Home home) {
        return homeRepository.save(home);
    }

    @CrossOrigin
    @GetMapping("/homes")
    public List<Home> getAllHomes() {
        return homeRepository.findAll();
    }



}
