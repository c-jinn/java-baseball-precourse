package baseball;

public class balls {
    public char getFirst() {
        return first;
    }

    public void setFirst(char first) {
        this.first = first;
    }

    public char getSecond() {
        return second;
    }

    public void setSecond(char second) {
        this.second = second;
    }

    public char getThird() {
        return third;
    }

    public void setThird(char third) {
        this.third = third;
    }

    private char first;
    private char second;
    private char third;


    public balls(char first, char second, char third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
