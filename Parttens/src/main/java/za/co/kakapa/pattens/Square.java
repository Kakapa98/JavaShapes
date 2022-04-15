package za.co.kakapa.pattens;

public class Square {
    private int number;

    public Square(int num){
        this.number = num;
    }

    public void printSquare(){
        System.out.println("---Square---");
        for (int i = 1; i <= this.number ; i++) {

            for (int j = 1; j <= this.number; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
