package ng.edu.bingham.inventory.services;

import ng.edu.bingham.inventory.domain.Drink;

import java.util.List;

public interface DrinkService {
    // get drinks by ID
    // get all drinks
    // update drinks
    // delete drinks
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
    void deleteDrink(long id);

    Drink updateDrinkById(Drink drink);

    void deleteDrinkById(long id);
}
