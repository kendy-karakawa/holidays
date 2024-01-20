package com.holidayzer.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.classes.Holiday;


@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/holidays")
    public List<String> getRolidays(){

        Holiday days = new Holiday();
        return days.getHolidays();

    }

    @GetMapping("/holidays/{date}")
    public String checkDate(@PathVariable("date") String date) {
        Holiday days = new Holiday();
        return days.checkDay(date);
    }
}
