package LabPackages.main;
import LabPackages.packageone.ClassOne;
import LabPackages.packagetwo.ClassTwo;
import LabPackages.packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();

        one.greet();
        System.out.println(one.greet());

        two.greet();
        System.out.println(two.greet());

        three.greet();
        System.out.println(three.greet());
    }
}
