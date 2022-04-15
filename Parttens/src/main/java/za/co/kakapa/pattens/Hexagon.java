package za.co.kakapa.pattens;

public class Hexagon extends pyramid{

    public Hexagon(int num) {
        super(num);
    }

    public void printHexagon(){
        System.out.println("---Hexagon---");
        super.printPyramid();
        for (int i = 1; i <= super.number; i++) {

            for (int j = 1; j <= super.number + 3; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
