package milesahead.micro.service1;

public class Service1 {

    private final long id;
    private final String content;

    public Service1(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
