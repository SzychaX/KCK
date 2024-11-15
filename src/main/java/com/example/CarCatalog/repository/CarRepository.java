package com.example.CarCatalog.repository;

import com.example.CarCatalog.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("select c from Car c where c.brand ilike %:brand%")
    List<Car> findByBrandIgnoreCase(@Param("brand") String brand);

    @Query("select v from Car v where v.version ilike %:version%")
    List<Car> findByVersion(@Param("version") String version);
}
