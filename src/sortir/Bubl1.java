package sortir;

import java.util.Arrays;

public class Bubl1
     {
        public  static void main(String[] args) {
            int[] arr = {0, 10, 20, 3, 4, 5, 600, 700, 8, 9, 35, 58, 1200, 400, 65};

            System.out.println("input data: "+Arrays.toString(arr));

            for (int barrier = arr.length - 1; barrier >= 0; barrier--) {


                for (int index = 0; index < barrier; index++) {


                    if (arr[index] > arr[index + 1]) {


                        int tmp = arr[index];
                        arr[index] = arr[index + 1];
                        arr[index + 1] = tmp;
                    }
                      System.out.println(Arrays.toString(arr)); //промежуточные данные
                }

            }
            System.out.println("answear : "+Arrays.toString(arr));
        }

}
