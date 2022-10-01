package baseball;

public class Baseball {

    private char first;
    private char second;
    private char third;


    public Baseball(char first, char second, char third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Baseball() {

    }

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


    public void setBallAfterToChar(int firstBall, int secondBall, int thirdBall) {
        this.setFirst((char) (firstBall + '0'));
        this.setSecond((char) (secondBall + '0'));
        this.setThird((char) (thirdBall + '0'));
    }

    public void setBallAfterToChar(char firstBall, char secondBall, char thirdBall) {
        this.setFirst( firstBall);
        this.setSecond(secondBall);
        this.setThird(thirdBall);
    }

    @Override
    public String toString() {
        return "Baseball{ " +
                "first : " + first
                +", second : " + second
                + ", third : "  + third
                +" }";
    }
}
