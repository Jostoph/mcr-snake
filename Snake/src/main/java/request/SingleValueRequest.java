package request;

// note : can be of TYPE -> MULTIPLICATOR
public class SingleValueRequest extends Request {

    private int value;

    public SingleValueRequest(RequestType requestType, int value) {
        super(requestType);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
