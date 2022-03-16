package com.company;
public class Main {

    public static void main(String[] args) {
        int limit = 30;
        int[] array14 = new int[limit];
        int[] array15 = new int[limit];
        int[] array16 = new int[limit];

        int[] arrA14 = new int[10];
        int[] arrB14 = new int[10];
        int[] arrC14 = new int[10];

        int[] arrA15 = new int[10];
        int[] arrB15 = new int[10];
        int[] arrC15 = new int[10];

        int[] arrA16 = new int[10];
        int[] arrB16 = new int[10];
        int[] arrC16 = new int[10];

        ran(array14, limit);
        ran(array15, limit);
        ran(array16, limit);

        System.out.println("\nThis is Array 14 \n");
        for (float a : array14
        ) {
            System.out.print(" " + Math.round(a));
        }

        /*-----------------------------------*/
        System.out.println(" \n ");
        int i=0,j=0,k=0;
        for (float a : array14
        ) {
            if (a<=10){
                arrA14[i]=Math.round(a);
                i++;
            }
            if(a>10 && a<=20){
                arrB14[j]=Math.round(a);
                j++;
            }
            if(a>20 && a<=30){
                arrC14[k]=Math.round(a);
                k++;
            }
        }
        /*------------------------------------------*/
        i=0;
        j=0;
        k=0;
        for (float a : array15
        ) {
            if (a<=10){
                arrA15[i]=Math.round(a);
                i++;
            }
            if(a>10 && a<=20){
                arrB15[j]=Math.round(a);
                j++;
            }
            if(a>20 && a<=30){
                arrC15[k]=Math.round(a);
                k++;
            }
        }


        /*------------------------------------------*/
        i=0;
        j=0;
        k=0;
        for (float a : array16
        ) {
            if (a<=10){
                arrA16[i]=Math.round(a);
                i++;
            }
            if(a>10 && a<=20){
                arrB16[j]=Math.round(a);
                j++;
            }
            if(a>20 && a<=30){
                arrC16[k]=Math.round(a);
                k++;
            }
        }




        System.out.println("----------- \n ");
        for (int l = 0; l <arrA14.length ; l++) {
            System.out.println(" arrA14=" + Math.round(arrA14[l])+"     "+" arrA14=" + Math.round(arrA15[l])+"     "+" arrA16=" + Math.round(arrA16[l]));
        }

        System.out.println("----------- \n ");
        for (int l = 0; l <arrA15.length ; l++) {
            System.out.println(" arrB14=" + Math.round(arrB14[l])+"     "+" arrB15=" + Math.round(arrB15[l])+"     "+" arrB16=" + Math.round(arrB16[l]));
        }

        System.out.println("----------- \n ");
        for (int l = 0; l <arrA16.length ; l++) {
            System.out.println(" arrC14=" + Math.round(arrC14[l])+"     "+" arrC15=" + Math.round(arrC15[l])+"     "+" arrC16=" + Math.round(arrC16[l]));
        }




        /*-------------------------------------------------------*/

        System.out.println("----------- \n ");
        int pc=1;
        for (int l = 0; l <arrA14.length ; l++) {
            System.out.println("PC "+pc+"    "+" arrA14=" + Math.round(arrA14[l])+"     "+" arrA14=" + Math.round(arrA15[l])+"     "+" arrA16=" + Math.round(arrA16[l]));
            pc++;
            System.out.println("PC "+pc+"    "+" arrB14=" + Math.round(arrB14[l])+"     "+" arrB15=" + Math.round(arrB15[l])+"     "+" arrB16=" + Math.round(arrB16[l]));
            pc++;
            System.out.println("PC "+pc+"    "+" arrC14=" + Math.round(arrC14[l])+"     "+" arrC15=" + Math.round(arrC15[l])+"     "+" arrC16=" + Math.round(arrC16[l]));
            pc++;
            System.out.println("--------------------------------------------\n");
        }










       /* System.out.println(" \n ");
        for (float a : array14
        ) {
            if (a<=20 && a>10){
                System.out.print(" " + Math.round(a));
            }
        }
        System.out.println(" \n ");
        for (float a : array14
        ) {
            if (a<=30 && a>20){
                System.out.print(" " + Math.round(a));
            }
        }*/

       /* System.out.println("\nThis is Array 15 \n");
        System.out.println();
        for (float a : array15
        ) {
            System.out.print(" " + Math.round(a));
        }

        System.out.println("\nThis is Array 16 \n");
        System.out.println();
        for (float a : array16
        ) {
            System.out.print(" " + Math.round(a));
        }*/
    }


    public static boolean valueMatched(int[] arr, float random) {
        for (float v : arr) {
            if (v == random) {
                return true;
            }
        }
        return false;
    }

    public static void ran(int[] array, int limit) {
        int index = 0;
        for (int i = 0; ; i++) {
            float ran = Math.round((float) (Math.random()) * limit);
            if (index == array.length) {
                break;
            } else {
                boolean result = valueMatched(array, ran);
                if (!result) {
                    array[index] = (int) ran;
                    index++;
                }
            }
        }
    }
}
