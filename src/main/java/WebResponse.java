import lombok.Data;

@Data
public class WebResponse<T> {

    private String code;

    private T body;

    private String message;

    public WebResponse() {

    }

    public WebResponse(T body) {
        this.body = body;
    }

    public WebResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public WebResponse(String code, T body, String message) {
        this.code = code;
        this.body = body;
        this.message = message;
    }

}
