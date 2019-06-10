package handler.inputValidator;

import Manager.Deplacement;
import request.InputRequest;

public class DeplacementInputValidator extends InputValidator {
    private final Deplacement deplacement;
    //TODO:input
    private final String input;

    public DeplacementInputValidator(Deplacement deplacement, String input) {
        this.deplacement = deplacement;
        this.input = input;
    }

    @Override
    public void Handler(InputRequest request) {
        if (request.getInput() == input) {
            request.getSnakeManager().setDeplacement(deplacement);
        }
        ((InputValidator) next).Handler(request);
    }
}
