package Manager;

import Edible.Edible;
import handler.SnakeHandler.Head;
import handler.SnakeHandler.SnakeSegment;


import java.util.*;


/**
 *
 */
public class SnakeManager {

    //TODO: linkedList pour avoir getLast?
    private LinkedList<Coordinate> snake = new LinkedList<>();
    private Map<Edible, Coordinate> edibles = new HashMap<>();
    private Head head;
    //TODO: edit les tailles
    private static final int MAXBOARDWIDTH = 100;
    private static final int MAXBOARDLEGHT = 50;
    private Deplacement deplacement;

    /**
     * Default constructor
     */
    public SnakeManager() {
        //TODO: de base apparait au millieu
        snake.add(new Coordinate(MAXBOARDLEGHT / 2, MAXBOARDWIDTH / 2));
        //ajoute une tête
        head = new Head( null);
        //TODO: de base se déplace vers la gauche
        deplacement = Deplacement.LEFT;
    }

    void addSnakeSegmentCoordinate(SnakeSegment snakeSegment) {
        //TODO: nouvelle élement toujours a droite
        snake.add(new Coordinate(snake.getLast().getX() + 1, snake.getLast().getY()));

        //TODO: ateint la fin de la liste (on pourrait le faire avec une requete peu être ?? ?
        SnakeSegment segment = head;
        while (segment.next() != null) {
            segment = segment.next();
        }
        segment.setNext(snakeSegment);
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}