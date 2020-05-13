package com.epam.nadia.files.task1.service;

import com.epam.nadia.files.task1.service.interfeces.SalaryService;

import java.util.Random;

public class SalaryServiceImpl implements SalaryService {

    public double calculate() {
        Random random = new Random();
        return random.nextDouble() * 10000.0;
    }
}
