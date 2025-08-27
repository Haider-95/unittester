package se.systementor.unittester.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public float Calculate(float tal1, float tal2, String action) {
        if (action.equals("add")) {
            return tal1 + tal2;
        }
        if (action.equals("subtract")) {
            return tal1 - tal2;
        }
        if (action.equals("multiply")) {
            return tal1 * tal2;
        }
        if (action.equals("divide")) {
            return tal1 / tal2;
        }
        throw new IllegalArgumentException("Invalid action");
    }
}
