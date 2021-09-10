package net.guides.springboot2.crud.controller;


import net.guides.springboot2.crud.dao.entity.Home;
import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @CrossOrigin
    @GetMapping("/homes/{id}")
    public ResponseEntity<Home> getHomeById(@PathVariable(value = "id") Long homeId)
            throws ResourceNotFoundException {
        Home homeEntity = homeRepository.findById(homeId)
                .orElseThrow(() -> new ResourceNotFoundException("Home not found for this id :: " + homeId));
        return ResponseEntity.ok().body(homeEntity);
    }

    // if you just pass in status_code will it update the database???
    // find out if @Valid only validates one or many property names
//    @CrossOrigin
//    @GetMapping("/homes/{id}")
//    public ResponseEntity<Home> updateHome(@PathVariable(value = "id") Long homeId, @Valid @RequestBody Home homeDetails) throws ResourceNotFoundException {
//        Home homeEntity = homeRepository.findById(homeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Home not found for this id :: " + homeId));
//
//        homeEntity.setBuilderName(homeDetails.getBuilderName());
//        homeEntity.setProjectName(homeDetails.getProjectName());
//        homeEntity.setPlanName(homeDetails.getPlanName());
//        homeEntity.setStatusCode(homeDetails.getStatusCode());
//        homeEntity.setCustomerName(homeDetails.getCustomerName());
//
//        final Home updatedHome = homeRepository.save(homeEntity);
//        return ResponseEntity.ok(updatedHome);
//    }

    @DeleteMapping("/homes/{id}")
    public Map<String, Boolean> deleteHome(@PathVariable(value = "id") Long homeId)
            throws ResourceNotFoundException {
        Home homeEntity = homeRepository.findById(homeId)
                .orElseThrow(() -> new ResourceNotFoundException("Home not found for this id :: " + homeId));
        homeRepository.delete(homeEntity);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Home Deleted", Boolean.TRUE);
        return response;
    }

}
