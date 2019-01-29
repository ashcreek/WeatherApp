package com.andreah.oauth2tutorial20190109.presentation;

import com.andreah.oauth2tutorial20190109.service.Weather;
import com.andreah.oauth2tutorial20190109.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/secured/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody
    List<Weather> getAll() {
        return weatherService.getAll();
    }
}