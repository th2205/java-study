package hello.hellospring.domain;

public class Member {

    private String name;
    private Long id = 0L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long sequence) {
        this.id = sequence;
    }
}
