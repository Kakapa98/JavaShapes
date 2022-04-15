package za.co.kakapa.pattens;

public class Triangle {
    private int number;

    public Triangle(int num){
        this.number = num;

    }

    public void printTriangle(){
        System.out.println("---Right Angle Triangle---");
        for (int i = 1; i <= this.number ; i++) {

            for (int j = 1; j <= this.number; j++) {
                if(j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }

}
