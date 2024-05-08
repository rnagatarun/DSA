public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 5;
//
//        /*
//        *****
//        *****
//        *****
//        *****
//        *****
//         */
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){System.out.print("*");}
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//
//
//
//
//
//
//
//
//
//
//        System.out.println("Pattern-2");
//        /*
//         *
//         **
//         ***
//         ****
//         *****
//         */
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){System.out.print("*");}
//            System.out.println();
//        }
//
//
//
//        System.out.println();
//        System.out.println();
//
//
//
//
//
//        System.out.println("Pattern-3");
//        /*
//         *
//         **
//         ***
//         ****
//         *****
//         */
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){System.out.print(j);}
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){System.out.print(i);}
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//
//
//
//        System.out.println("Pattern-4");
//        /*
//         *****
//         ****
//         ***
//         **
//         *
//         */
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){System.out.print("*");}
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Pattern-7");
//        /*
//         *
//         **
//         ***
//         ****
//         *****
//         */

//        for(int i=0;i<n;i++){
//            //space
//            for(int j = 0; j<n-i-1;j++){System.out.print(" ");}
//            for(int j=0;j<2*i+1;j++){System.out.print("*");}
//            for(int j = 0; j<n-i-1;j++){System.out.print(" ");}
//            System.out.println();
//        }


        System.out.println();
        System.out.println();
        System.out.println("Pattern-8");

        for(int i=0;i<n;i++) {
            //space
            for (int j = 0; j < i; j++) {System.out.print(" ");}
            for (int j = 0; j < 2*n-(2*i+1); j++) {System.out.print("*");}
            for (int j = 0; j < i; j++) {System.out.print(" ");}
            System.out.println();
        }








    }
}