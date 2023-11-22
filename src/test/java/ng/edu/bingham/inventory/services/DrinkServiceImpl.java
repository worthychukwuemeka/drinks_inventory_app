package ng.edu.bingham.inventory.services;

import ng.edu.bingham.inventory.domain.Drink;
import ng.edu.bingham.inventory.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DrinkServiceImpl implements DrinkService {
    @Autowired
    DrinkRepository drinkRepository;
    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long id) {
        //return (Drink) drinkRepository.findAll();
        Optional<Drink> drink = drinkRepository.findById(id);

        Drink drinkAvailable = null;
        if (drink.isPresent()){
            drinkAvailable = drink.get();
            return drinkAvailable;
        } else {
            throw new RuntimeException("Drink not found.");
        }
    }

    @Override
    public List<Drink> getAllDrink() {
        return drinkRepository.findAll();
    }

    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> optionalDrink = drinkRepository.findById(drink.getId());

        if(optionalDrink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink.setCapacity(drink.getCapacity());
            updateDrink.setColor(drink.getColor());
            updateDrink.setCompany(drink.getCompany());
            updateDrink.setName(drink.getName());
            updateDrink.setType(drink.getType());
            updateDrink.setId(drink.getId());
            updateDrink.setIngredientList(drink.getIngredientList());

            drinkRepository.save(updateDrink);
        } else {
            throw new RuntimeException("Drink does not exist.");
        }
        return drink;
    }

    @Override
    public void deleteDrink(long id) {
        drinkRepository.deleteById(id);
    }
}
