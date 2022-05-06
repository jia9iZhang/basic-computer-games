import java.util.Scanner;

/**
 * Game of Qubit
 * <p>
 * Converted from BASIC to Java by Jiaqi.Zhang
 */
public class Qubit {

    private void play() {
        showInfo();
        startGame();
    }

    //打印Info
    private void showInfo() {
        System.out.println("3D Tic-Tac-Toe");
        System.out.println("CREATIVE COMPUTING  MORRISTOWN, NEW JERSEY");
    }

    //游戏开始
    private void startGame() {
        System.out.println();
        System.out.print("DO YOU WANT INSTRUCTIONS?");
        String flag = getData();
        while (!"YES".equals(flag) && !"NO".equals(flag)) {
            System.out.println("INCORRECT ANSWER.  PLEASE TYPE 'YES' OR 'NO'.");
            System.out.print("DO YOU WANT INSTRUCTIONS?");
            flag = getData();
            if (flag.equals("YES") || flag.equals("NO")) {
                break;
            }
        }
        //展示游戏简介
        if ("YES".equals(flag)) {
            System.out.println();
            System.out.println("THE GAME IS TIC-TAC-TOE IN A 4 X 4 X 4 CUBE.");
            System.out.println("EACH MOVE IS INDICATED BY A 3 DIGIT NUMBER, WITH EACH");
            System.out.println("DIGIT BETWEEN 1 AND 4 INCLUSIVE.  THE DIGITS INDICATE THE");
            System.out.println("LEVEL, ROW, AND COLUMN, RESPECTIVELY, OF THE OCCUPIED");
            System.out.println("PLACE.");
            System.out.println();
            System.out.println("TO PRINT THE PLAYING BOARD, TYPE 0 (ZERO) AS YOUR MOVE.");
            System.out.println("THE PROGRAM WILL PRINT THE BOARD WITH YOUR MOVES INDI-");
            System.out.println("CATED WITH A (Y), THE MACHINE'S MOVES WITH AN (M), AND");
            System.out.println("UNUSED SQUARES WITH A ( ).  OUTPUT IS ON PAPER.");
            System.out.println();
            System.out.println("TO STOP THE PROGRAM RUN, TYPE 1 AS YOUR MOVE.");
            System.out.println();
            System.out.println();
        }

        while (true) {
            System.out.println();
            System.out.print("DO YOU WANT TO MOVE FIRST?");
            while (true) {
                String data = getData();
                if ("YES".equals(data) || "NO".equals(data)) {
                    break;
                }
                System.out.print("INCORRECT ANSWER.  PLEASE TYPE 'YES' OR 'NO'.");
            }
            //进入游戏对战阶段
            while (true) {

            }
        }
    }

    //获取控制台输入
    private String getData() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void main(String[] args) {
        Qubit qubit = new Qubit();
        qubit.play();
    }
}
