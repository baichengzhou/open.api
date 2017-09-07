package com.sojson.open.api.common.model;



import javax.persistence.*;
import java.io.Serializable;
/**
 *

 * <p>
 *
 *  测试 · 实体
 *
 * <p>
 *
 * 区分　责任人　日期　　　　<br/>
 * 创建　周柏成　2017年9月8日  　<br/>
 *
 * @author zhou-baicheng
 * @version 1.0 <br/>
 * @time 00:06:30 <br/>
 *
 */
@Entity
public class Weather implements Serializable{
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private Long id;
    @Column
    private Long cityId;
    /**城市*/
    @Column
    private String city;
    /**日出&日落*/
    @Column
    private String sunrise;
    @Column
    private String sunset;
    /**天气*/
    @Column
    private String weather;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
