package com.epam.nadia.spring_core_1.service;

import com.epam.nadia.spring_core_1.service.interfeces.SalaryService;

import java.util.Random;

public class SalaryServiceImpl implements SalaryService {

    public double calculate() {
        Random random = new Random();
        return random.nextDouble() * 10000.0;
    }
}
