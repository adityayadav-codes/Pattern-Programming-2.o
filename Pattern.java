public class Pattern {
    static void pattern1() {
        System.out.println("Pattern 1:");
          for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        System.out.println("Pattern 2:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j ++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("Pattern 3:");
        for (int i = 1; i <= 5; i++){
            for (int j = 1;j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
   
    static void pattern4() {
        System.out.println("Pattern 4:");
       for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
       }
    }
    
    static void pattern5() {
        System.out.println("pattern 5:");
        for(int i = 5; i >= 1; i--){
            for(int j = 5; j >=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
   
    static void pattern6() {
        System.out.println("pattern 6:");
        int k = 1;
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.printf("%2d ", k);
                k++;
            }
            System.out.println();
        }

    }
    static void pattern7() {
        System.out.println("pattern 7:");
        int k = 1; 
        for(int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%2d ", k);
                k += 2;
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {

       // pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        pattern7();
    }

}

