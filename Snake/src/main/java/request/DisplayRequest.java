package request;

import java.util.ArrayList;
import java.util.List;

/**
 * this class represente a display request
 */
public class DisplayRequest extends Request {
    //TODO: information needed
    private List<Object> information = new ArrayList<>();

    public DisplayRequest() {
        super(RequestType.DISPLAYREQUEST);
    }

    //TODO: information to addinfo
    public void addinfo(Object info) {
        information.add(info);
    }

    public List<Object> getInformation() {
        return information;
    }
}
