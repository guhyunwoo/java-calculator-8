package calculator.controller;

import camp.nextstep.edu.missionutils.Console;

public class InputHandler {
    private final static String DEFAULT_RESPONSE = "0";

    public String inputHandle() {
        String input = Console.readLine();
        if(input == null || input.isEmpty()) {
            return DEFAULT_RESPONSE;
        }
        return input;
    }
}
