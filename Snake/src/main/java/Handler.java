
import java.util.*;

/**
 * 
 */
public interface Handler {

    /**
     * @param handler
     */
    public void setNext(Handler handler);

    /**
     * @param request
     */
    public void Handler(Request request);

}