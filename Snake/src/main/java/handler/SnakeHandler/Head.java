package handler.SnakeHandler;

import handler.BaseHandler;
import handler.Handler;
import request.DisplayRequest;
import request.InputRequest;
import request.Request;

/**
 *
 */
public class Head extends SnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UNE TETE DE SERPENT";


    /**
     * @param request requête envoyé au handler
     *                envoye au suivant dans la liste
     */
    @Override
    public void Handler(Request request) {
        super.Handle(request);
        if (next != null) {
            next.Handler(request);
        }

    }



    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info);
    }

}