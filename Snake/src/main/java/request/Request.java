package request;

import lombok.Getter;

public class Request {
    @Getter
    private RequestType requestType;

    Request(RequestType requestType) {
        this.requestType = requestType;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}
