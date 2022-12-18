package hello.hellospring.domain;

public class Member {

    private static String name;
    private static Long sequence = 0L;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Member.name = name;
    }

    public static Long getSequence() {
        return sequence;
    }

    public static void setSequence(Long sequence) {
        Member.sequence = sequence;
    }
}
