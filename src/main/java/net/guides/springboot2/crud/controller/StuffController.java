package net.guides.springboot2.crud.controller;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Stuff;
import net.guides.springboot2.crud.repository.StuffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StuffController {
    @Autowired
    private StuffRepository stuffRepository;

    @CrossOrigin
    @GetMapping("/stuff")
    public List<Stuff> getAllStuff() {
        return stuffRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/stuff/{id}")
    public ResponseEntity<Stuff> getStuffById(@PathVariable(value = "id") Long stuffId)
            throws ResourceNotFoundException {
        Stuff stuff = stuffRepository.findById(stuffId)
                .orElseThrow(() -> new ResourceNotFoundException("Stuff not found for this id :: " + stuffId));
        return ResponseEntity.ok().body(stuff);
    }

    @CrossOrigin
    @PostMapping("/stuff")
    public Stuff createStuff(@Valid @RequestBody Stuff stuff) {
        return stuffRepository.save(stuff);
    }

}
