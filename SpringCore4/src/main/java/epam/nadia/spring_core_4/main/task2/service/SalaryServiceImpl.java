package epam.nadia.spring_core_4.main.task2.service;

import epam.nadia.spring_core_4.main.task2.service.interfeces.SalaryService;

import java.util.Random;

public class SalaryServiceImpl implements SalaryService {

    @Override
    public double calculate() {
        Random random = new Random();
        return random.nextDouble() * 10000.0;
    }
}
