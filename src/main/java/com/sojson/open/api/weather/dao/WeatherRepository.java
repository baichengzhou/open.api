package com.sojson.open.api.weather.dao;

import com.sojson.open.api.common.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WeatherRepository extends JpaRepository<Weather, Long> {

    @Query("from Weather w where w.city=:city")
    Weather findWeather(@Param("city")String city);

    Weather findByCityId(Long cityId);


    Weather findById(Long id);


    @Query("from Weather w where w.cityId=:cityId")
    Weather findWeather(@Param("cityId") Long cityId);
}
