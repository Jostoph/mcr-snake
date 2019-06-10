package request;

import java.util.ArrayList;
import java.util.List;

public class DisplayRequest extends Request{
    //TODO: information needed
    private List<Object> information = new ArrayList<>();

    //TODO: information to addinfo
    public void addinfo(Object info) {
        information.add(info);
    }


}
