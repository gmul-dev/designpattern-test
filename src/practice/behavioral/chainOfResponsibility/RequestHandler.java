package practice.behavioral.chainOfResponsibility;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if(next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(req + " handling request " + this);
    }

    @Override
    public abstract String toString();
}
