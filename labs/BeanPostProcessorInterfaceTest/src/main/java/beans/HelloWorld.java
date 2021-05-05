package beans;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void init() {
        System.out.println("Bean is going to be initialized");
    }

    public void destroy() {
        System.out.println("Bean is going to be destroyed");
    }
}
