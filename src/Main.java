import java.util.ArrayList;

public class Main {

    static ArrayList<Object3D> all3D = new ArrayList<>();

    public static void main(String[] args) {
       mainMenu();
    }

    private static void mainMenu() {

        StringBuilder menu = new StringBuilder();
        menu.append("\nPilih Menu : \n")
            .append("1. Add new 3d Object\n")
            .append("2. Print all\n")
            .append("3.Exit\n");

        System.out.println(menu.toString());
        int pilihan = Util.inputInt();
        System.out.println();

        if(pilihan == 1){
            objectMenu();
        } else if(pilihan == 2){
            printAll();
        }

        mainMenu();
    }

    private static void objectMenu() {

        StringBuilder menu = new StringBuilder();
        menu.append("Pilih Object : \n")
            .append("1. Sphere\n")
            .append("2. Cylinder\n")
            .append("3. Cuboid\n")
            .append("4. Cube\n");

        System.out.println(menu.toString());
        int pilihan = Util.inputInt();
        System.out.println();

        if(pilihan == 1){

            System.out.print("Masukan radius : ");
            double radius = Util.inputDouble();

            all3D.add(new Sphere(radius));

        } else if(pilihan == 2){

            System.out.print("Masukan radius : ");
            double radius = Util.inputDouble();
            System.out.print("Masukan Height : ");
            double height = Util.inputDouble();

            all3D.add(new Cylinder(radius, height));

        } else if(pilihan == 3){

            System.out.print("Masukan Width : ");
            double width = Util.inputDouble();
            System.out.print("Masukan Height : ");
            double height = Util.inputDouble();
            System.out.print("Masukan Length : ");
            double length = Util.inputDouble();

            all3D.add(new Cuboid(width, height, length));

        } else if(pilihan == 4){

            System.out.print("Masukan Sisi : ");
            double side = Util.inputDouble();

            all3D.add(new Cube(side));
        }
    }

    private static void printAll(){

        for(Object3D o : all3D) {
            o.print();
        }

        Util.next();
    }
}