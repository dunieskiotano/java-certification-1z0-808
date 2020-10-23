package mdc.flowcontrol;

    public class ForLoop {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                //System.out.println("i = " + i);
                System.out.print(i + " "); // returns 0 1 2 3 4 5 6 7 8 9
            }
            System.out.println(); // prints a new ling sign

            int a;
            for (a = 0; a < 10; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println("after for loop a = " + a);

//        for(;;){
//            System.out.println("Hello");
//            //break;
//        }  prints an endless or infinite loop

            int x = 0;
            for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
                System.out.println("y = " + y);
            }
            System.out.println("x = " + x);

            for (long z = 0; z < 10; z++) {
            }
            for (double xy = 0.0; xy < 10.5; xy += 0.5) {
            }

            //for (long z = 0, int d = 4; z < 10; z++, d++){} => this will not compile
        }

        public static class IfElseStatement {
            public static void main(String[] args) {

                boolean b = false;
                if (!b) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }

                int x = 1;
                // if(x){} => this does not compile
                // if (x = 1){} => this does not compile

                if (x == 1) {
                    System.out.println(x);
                }

                int testScore = 90;
                char grade;

                if (testScore >= 90) {
                    grade = 'A';
                } else if (testScore >= 80) {
                    grade = 'B';
                } else if (testScore >= 70) {
                    grade = 'C';
                } else if (testScore >= 60) {
                    grade = 'D';
                } else if (testScore >= 50) {
                    grade = 'E';
                } else {
                    grade = 'F';
                }
                System.out.println("grade = " + grade);

                int hoursOfDay = 10;
                if (hoursOfDay < 11) System.out.println("Morning");
                else if (hoursOfDay < 17) System.out.println("Evening");
                else
                    System.out.println("Day");
                hoursOfDay++;
                System.out.println(hoursOfDay);
                if (hoursOfDay < 17) {
                    System.out.println("Afternoon");
                } else if (hoursOfDay < 11) { // 11 < 17, this will never be executed
                    System.out.println("Morning");
                } else {
                    System.out.println("Evening");
                }
            }
        }

        public static class DoWhileLoop {
            public static void main(String[] args) {
                int a = 0;

                // do {write code here} while(boolean expression);
                do {
                    a++;
                } while (false);

                System.out.println("a = " + a);

                //while(false){} this will not compile

                int x = 20;
                while (x > 10) {x--; System.out.println(x);}
                System.out.println("x = " + x);

                int x2 = 20;
                do {x2--; System.out.println(x2);}
                while(x2 > 10);

                System.out.println("x2 = " + x2);

                int y = 10;
                int z = 5;
                while(y < 20){
                    y++;
                }
                // y = 20
                z +=2; // => 5 + 2 => z = 7
                y += 10; // => y = y + 10 => 20 + 10 => y = 30
               // y = 30
                System.out.println("x = " + x + ", y = " + y + ", z = " + z);

                int number = 10;
                while( number > 10){
                    number--;
                }
                do{
                    number--;
                    // number = 9
                    while (number > 5){
                        number -= 2;
                        // number = 7
                        // number = 5
                    }
                }while(number > 10);
                System.out.println("number = " + number);
            }
        }
    }
