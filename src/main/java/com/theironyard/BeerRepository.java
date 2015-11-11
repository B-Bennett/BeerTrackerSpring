package com.theironyard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by BennettIronYard on 11/10/15.
 */
public interface BeerRepository extends CrudRepository<Beer, Integer>{
    List<Beer> findByType(String type);
    List<Beer> findByTypeAndCalories(String type, Integer calories);
    List<Beer> findByTypeAndCaloriesIsLessThanEqual(String type, Integer calories);

    Beer findFirstByType(String type); //finding the first one entered into the database
    int countByType(String type); //
    List<Beer> findByTypeOrderByNameAsc(String type); //1st find by type then order by name

    @Query("SELECT b FROM Beer b WHERE LOWER(name) LIKE '%' || LOWER(?) || '%'") //table alliase b "*"
    List<Beer> searchByName(String name);
}
