package handler.snakeHandler;

import manager.SnakeManager;
import request.Request;
import request.RequestType;

/**
 *
 */
public class Tail extends SnakeSegment {

    public Tail(SnakeSegment previous) {
        //Tail always the last segment
        super(null, previous);
    }


    @Override
    public void handle(Request request) {

        if(request.getRequestType() == RequestType.SHUFFLEREQUEST) {
            SnakeSegment head = SnakeManager.getInstance().getHead();

            SnakeSegment s1;
            SnakeSegment s2;
            SnakeSegment s3;
            SnakeSegment s4;


            s1 =(SnakeSegment) head.next();
            s2 = (SnakeSegment) s1.next();
            s4 =  (SnakeSegment) this.previous();
            s3 = (SnakeSegment) s4.previous();

            //place s4
            s4.setNext(s2);
            s4.setPrevious(head);
            head.setNext(s4);
            s2.setPrevious(s4);

            //place s1
            s1.setPrevious(s3);
            s1.setNext(this);
            this.setPrevious(s1);
            s3.setNext(s1);
        }
    }
}