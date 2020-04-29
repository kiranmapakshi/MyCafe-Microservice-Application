package com.chef.controller;

import com.chef.bo.Chef;
import com.chef.interfaces.IChefService;
import io.vavr.NotImplementedError;
import io.vavr.control.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChefRegistrationController {
    @Autowired
    public final IChefService chefService;

    public ChefRegistrationController(IChefService chefService) {
        this.chefService = chefService;
    }

    @PostMapping
    public Try<ResponseEntity> createChef(@RequestBody Chef chef){
        chefService.createChef(chef);
        return Try.failure(new NotImplementedError());
    }

    @PatchMapping
    public Try<ResponseEntity> modifyChef(@RequestBody Chef chef){
        chefService.modifyChef(chef);
        return Try.failure(new NotImplementedError());
    }

    @DeleteMapping
    public Try<ResponseEntity> deleteChef(@RequestBody Chef chef){
        chefService.deleteChef(chef);
        return Try.failure(new NotImplementedError());
    }
    @GetMapping
    public Try<ResponseEntity> getChefs(){
        return Try.failure(new NotImplementedError());
    }
}
