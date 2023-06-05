package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class ArrayElementstatistic {
    public static void main(String[] args) {
        int []array = {5,2,3,4,4,3,3,2,2,2,2,2,};
        var unical = new int[array.length];
        var counts =  new int[array.length];
        var count = 0;


        for (int i = 0; i < array.length; i++) {
            var element = array[i];

            var exis = false;
            for (int j = 0; j < count; j++) {
                if (unical[j]==element){
                    exis= true;
                    break;
                }
            }

            if (!exis){
                var number = 1;

                for (int j = i+1; j < array.length ; j++) {
                    if (element==array[j]){
                        number++;
                    }

                }
                unical[count]=element;
                counts[count]=number;
                count++;

            }

        }
        for (int i = 0; i < count; i++) {
            System.out.println(unical[i]+"="+((double)counts[i]*100/ array.length+"%"));
        }



    }
}
