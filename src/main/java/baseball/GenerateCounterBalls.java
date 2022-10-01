package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Set;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
public class GenerateCounterBalls {

    private Set<Integer> numbers;

    private int firstTemp;
    private int secondTemp;
    private int thirdTemp;

    public void generate(Balls ball) {

        RandomNum randomNum1 = new RandomNum();
        RandomNum randomNum2 = new RandomNum();
        RandomNum randomNum3 = new RandomNum();


        firstTemp = randomNum1.getRandom(1,9);
        ball.setFirst((char) firstTemp);

        secondTemp = randomNum2.getRandom(1,9);
        while(!checkDupBall(secondTemp,2)){
            secondTemp =randomNum2.getRandom(1,9);
        }

        thirdTemp =randomNum3.getRandom(1,9);
        while (!checkDupBall(thirdTemp, 3)) {
            thirdTemp = randomNum3.getRandom(1,9);
        }

        ball.setFirst((char) (firstTemp + '0'));
        ball.setSecond((char) (secondTemp+ '0'));
        ball.setThird((char) (thirdTemp+ '0'));

    }

    private boolean checkDupBall(int checkTemp, int i) {
        if(i == 2 && firstTemp == checkTemp){
            return true;
        }

        if(i==3 && ( firstTemp == checkTemp || secondTemp == checkTemp) ){
            return true;
        }
        return false;

    }

}
