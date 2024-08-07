package day05;

public class 배열 {

    public static void main(String[] args) {
        
        String[][] str = {
            {"Hello", "world!"},
            {"Java", "is", "fun."},
            {"Let's", "learn", "together."}
        };
        
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();  
        }
    }
}