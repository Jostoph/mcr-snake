package handler.inputValidator;

import Manager.Deplacement;
import request.InputRequest;

import java.util.List;

public class ValidatorAllHandler {
    private InputValidator head;

    ValidatorAllHandler() {
        DeplacementInputValidator deplacementInputValidatorleft = new DeplacementInputValidator(Deplacement.LEFT, "GAUCHE");
        DeplacementInputValidator deplacementInputValidatorRight = new DeplacementInputValidator(Deplacement.RIGHT, "RIGHT");
        DeplacementInputValidator deplacementInputValidatorDown = new DeplacementInputValidator(Deplacement.DOWN, "DOWN");
        DeplacementInputValidator deplacementInputValidatorUP = new DeplacementInputValidator(Deplacement.UP, "UP");
        InputValidator wallValidator = new WallOnNextMoveValidator();

        head = deplacementInputValidatorleft;
        head.setNext(deplacementInputValidatorRight);
        deplacementInputValidatorRight.setNext(deplacementInputValidatorDown);
        deplacementInputValidatorDown.setNext(deplacementInputValidatorUP);
        deplacementInputValidatorUP.setNext(wallValidator);

    }

    void handler(InputRequest inputRequest) {
        head.Handler(inputRequest);

    }

}
