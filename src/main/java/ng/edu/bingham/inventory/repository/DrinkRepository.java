package ng.edu.bingham.inventory.repository;

import ng.edu.bingham.inventory.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
    // @Query("")
    // List<Drink> findDrinkByPriceListGreaterThan(int price);
}
