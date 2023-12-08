package ng.edu.bingham.inventory.controller.api;

import ng.edu.bingham.inventory.domain.Drink;
import ng.edu.bingham.inventory.repository.DrinkRepository;
import ng.edu.bingham.inventory.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrinkAPIController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks");
    @GetMapping("/drinks");

    public ResponseEntity<List<Drink>> getAllDrink(){
        return ResponseEntity.ok().body(drinkService.getAllDrink());
    }
}
