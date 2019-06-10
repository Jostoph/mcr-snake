package request;

import Manager.SnakeManager;

public class InputRequest {
    //TODO class de l'input ?
    private Object input;
    private SnakeManager snakeManager;

    public InputRequest(Object input, SnakeManager snakeManager) {
        this.input = input;
        this.snakeManager = snakeManager;
    }

    public Object getInput() {
        return input;
    }

    public SnakeManager getSnakeManager() {
        return snakeManager;
    }
}

