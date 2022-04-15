package za.co.kakapa.pattens;

public class pyramid {
    protected int number;

    public pyramid(int num){
        this.number = num;

    }

    public void printPyramid(){
        System.out.println("---Pyramid---");
        for (int i = 1; i <= this.number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
