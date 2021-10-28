package basepackage;
import java.util.Scanner;



public class Main {
    static void ShowTable(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    static void CheckAndReplaceXXX(char c, char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(c == arr[i][j]){
                    arr[i][j] = 'X';
                };
            }
        }
    }
    static void CheckAndReplace000(char c, char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(c == arr[i][j]){
                    arr[i][j] = '0';
                };
            }
        }
    }
    static void CheckWinner(char c, char[][] arr){//horizontal winner
        if( arr[0][0]==c && arr[0][1]==c && arr[0][2]==c ||
            arr[1][0]==c && arr[1][1]==c && arr[1][2]==c ||
            arr[2][0]==c && arr[2][1]==c && arr[2][2]==c ){
            System.out.println("Player " + c + " won horizontally");
            System.exit(0);
        }
        if( arr[0][0]==c && arr[1][0]==c && arr[2][0]==c ||
            arr[0][1]==c && arr[1][1]==c && arr[2][1]==c ||
            arr[0][2]==c && arr[1][2]==c && arr[2][2]==c ){
            System.out.println("Player " + c + " won vertically");
            System.exit(0);
        }
        if( arr[0][0]==c && arr[1][1]==c && arr[2][2]==c ||
            arr[0][2]==c && arr[1][1]==c && arr[2][1]==c ){
            System.out.println("Player " + c + " won diagonally");
            System.exit(0);
        }


    }

    public static void main(String[] args) {
        char[][] arr = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        Scanner myObj = new Scanner(System.in);
        while(true){
            CheckWinner('X', arr);
            CheckWinner('0', arr);

            char c = 'a';

            while(true){ //XXXinput
                System.out.println("Player XXX put your X in the vacant place");
                ShowTable(arr);
                System.out.println("Write 1-9 to put X");
                try{
                    String userInput = myObj.nextLine();
                    c = userInput.charAt(0);
                } catch (Exception exception) {}

                if(c == 'q'){
                    System.out.print("Goodbye");
                    System.exit(0);
                }

                if(c >= '1' && c <= '9'){
                    CheckAndReplaceXXX(c, arr);
                    break;
                }else{
                    System.out.println("Please Write 1-9 to put X");
                }

            }
            CheckWinner('X', arr);
            CheckWinner('0', arr);
            while(true){//000 input
                System.out.println("Player 000 put your X in the vacant place");
                ShowTable(arr);
                System.out.println("Write 1-9 to put 0");
                try{
                    String userInput = myObj.nextLine();
                    c = userInput.charAt(0);
                } catch (Exception exception) {}

                if(c == 'q'){
                    System.out.print("Goodbye");
                    System.exit(0);
                }

                if(c >= '1' && c <= '9'){
                    CheckAndReplace000(c, arr);
                    break;
                }else{
                    System.out.println("Please Write 1-9 to put X");
                }

            }



        }

	// write your code here
    }


}
