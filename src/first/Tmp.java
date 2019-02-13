package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Tmp {
    String model;
    int maxSpeed;

    public static void main(String[] args) {

        Tmp gerl1 = new Tmp();
        gerl1.model = "Nata";
        gerl1.maxSpeed = 300;

        Tmp gerl2 = new Tmp();
        gerl2.model = "Nata";
        gerl2.maxSpeed = 300;

        System.out.println(gerl1 == gerl1);
    }
}