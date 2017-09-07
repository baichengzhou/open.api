package com.sojson.open.api.weather.controller;


import com.sojson.open.api.common.model.Weather;
import com.sojson.open.api.common.vo.APIResult;
import com.sojson.open.api.weather.dao.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * <p>
 *
 *  测试 · Controller
 *
 * <p>
 *
 * 区分　责任人　日期　　　　<br/>
 * 创建　周柏成　2017年9月8日  　<br/>
 *
 * @author zhou-baicheng
 * @version 1.0 <br/>
 * @time 00:27:33 <br/>
 *
 */
@RestController
@RequestMapping("weather/basic")
public class WeatherBasicController {
    
    @Autowired
    WeatherRepository weatherRepository;

    @RequestMapping("json")
    public APIResult<List<Weather>> json(){
        List<Weather> list = new ArrayList<>();
        try{
            Weather w1 = weatherRepository.findById(1L);
            Weather w2 = weatherRepository.findWeather("北京");
            Weather w3 = weatherRepository.findOne(1L);
            Weather w4 = weatherRepository.findWeather(100100L);
            Weather w5 = weatherRepository.findByCityId(100100L);
//            List<Weather> list = weatherRepository.findAll();
            list.addAll(Arrays.asList(new Weather[]{w1, w2, w3, w4, w5}));
        }catch (Exception e){
            e.printStackTrace();;
        }
        return new APIResult<List<Weather>>(200,"success").setData(list);
    }

}
