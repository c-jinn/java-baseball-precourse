package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms.*;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static camp.nextstep.edu.missionutils.Console.*;
public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
//        balls counterBalls ;

        boolean continueFlag = true;

        while (continueFlag){
            continueFlag = false;
            int first,second, third;

            first = pickNumberInRange(1,9);
            second = pickNumberInRange(1,9);

            while(first == second){

//                System.out.println("first == second ");
//                System.out.println("first " + first);
//                System.out.println("second " + second);
                second = pickNumberInRange(1,9);

            }

            third = pickNumberInRange(1,9);

            while(first == third || second ==third){
//                System.out.println("f = s or s = t");
//                System.out.println("first " + first);
//                System.out.println("second " + second);
//                System.out.println("third " + third);
                third = pickNumberInRange(1,9);
            }
//            System.out.println("end : ");
//            System.out.println("first " + first);
//            System.out.println("second " + second);
//            System.out.println("third " + third);
//            System.out.println("first " + (first + '0'));
//            System.out.println("second " + (second +'0'));
//            System.out.println("third " + (third +'0'));

            Balls ball = new Balls(  (char) (first + '0'), (char) (second + '0') , (char) (third + '0'));
//
//            System.out.println("answer is : " + ball.getFirst() + ball.getSecond() + ball.getThird());
//            System.out.println(ball.getFirst() );
//            System.out.println( ball.getSecond());
//            System.out.println( ball.getThird());


            //점수 표시

            int b = 0;
            int s = 0;
//            String v1;
            Console c ;
            while(s!=3) {
//                v1 = null;
                b=s=0;

                //사용자 입력
                String v1 = readLine();

                if(v1.length() != 3){
//                    System.out.println("length is wrong");
                    throw new IllegalArgumentException();
                }

                //볼 점수 평가

                char sfirst = v1.charAt(0);
                char ssecond = v1.charAt(1);
                char sthird = v1.charAt(2);
//                System.out.println("볼 점수 평가");
//                System.out.println(sfirst);
//                System.out.println(ssecond);
//                System.out.println(sthird);


                if (ball.getFirst() == sfirst) {
//                    System.out.println("ball first strike");
                    s++;
                } else if (ball.getFirst() == ssecond || ball.getFirst() == sthird) {
                    b++;
//                    System.out.println("ball first ball");
                }

                if (ball.getSecond() == ssecond) {
//                    System.out.println("ball second strike");
                    s++;
                } else if (ball.getSecond() == sfirst || ball.getSecond() == sthird) {
//                    System.out.println("ball second ball");
                    b++;
                }

                if (ball.getThird() == sthird) {
//                    System.out.println("ball third strike");
                    s++;

                } else if (ball.getThird() == sfirst || ball.getThird() == ssecond) {
                    b++;
//                    System.out.println("ball third ball");
                }


                String resultScore = new String();
                if (s == 0 && b == 0) {
                    resultScore = "낫싱";
                }

                if (b > 0) {
                    resultScore += Integer.toString(b) + "볼";

                }

                if (s > 0) {
                    if(b>0)
                        resultScore += " ";
                    resultScore += Integer.toString(s) + "스트라이크";
                }

                System.out.println(resultScore);

            }
            if(s==3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로시작하려면 1, 종료하려면 2를 입력하세요.");
                if(readLine().equals("1")){
                    continueFlag = true;
                }

            }





//            Balls ball = new Balls((char) 0, (char) 0, (char) 0);
//            GenerateCounterBalls generateCounterBalls = new GenerateCounterBalls();
//            generateCounterBalls.generate(ball);
//
//
//            System.out.println("--");
//            System.out.println(ball.getFirst());
//            System.out.println(ball.getSecond());
//            System.out.println(ball.getThird());
        }








        //System.out.println(pickNumberInRange(1, 999));
//        String v1 = readLine();
//        System.out.println("return : " + v1);
    }
}
