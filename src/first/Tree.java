package first;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размерность елки");
        int h = scn.nextInt();
        String[] tree = new String[h];
        for(int i=0;i<tree.length;i++){
            tree[i]=" ";
        }
        //System.out.println(tree.length);
        int midle = tree.length / 2;
        tree[midle] = "x";
        String[] noga = tree.clone();
        noga[midle] = "x";
        for (int i = 1; i < midle; i++) {
            System.out.println(Arrays.toString(tree).replaceAll(",","").replaceAll("\\[","").replaceAll("]",""));
            tree[getMax(tree)+1]="x";
            tree[getMin(tree)-1]="x";
        }
        System.out.println(Arrays.toString(noga).replaceAll(",","").replaceAll("\\[","").replaceAll("]",""));
    }

    public static int getMax(String[] tree) {
        int max = 0;
        for (int i = tree.length - 1; i > 0; i--) {
            if (tree[i].equals("x") && max == 0) {
                max = i;
            }
        }
        return max;
    }

    public static int getMin(String[] tree) {
        int min = 0;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i].equals("x") && min == 0) {
                min = i;
            }
        }
        return min;
    }
}
