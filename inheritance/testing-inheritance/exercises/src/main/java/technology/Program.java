package technology;

public class Program {
    public static void main(String[] args) {


        //TODO: INSTANTIATE A COMPUTER OBJECT
        Computer myComp = new Computer("Lenovo", 2024, "Dark Mode");

        Computer oldComp = new Computer("Microsoft Surface Pro", 2015, "Light Mode");

        //TODO: PRINT OUT VALUES OF OBJECT
        System.out.println(myComp.getBrand());
        System.out.println(myComp.getYear());
        System.out.println(myComp.getScreenMode());

        System.out.println(oldComp.getBrand());
        System.out.println(oldComp.getYear());
        System.out.println(oldComp.getScreenMode());

        //TODO: USE THE METHODS ON THE OBJECT
        System.out.println(myComp.isNew());
        System.out.println(myComp.powerOn());

        System.out.println(oldComp.isNew());
        System.out.println(oldComp.powerOn());


    }
}
