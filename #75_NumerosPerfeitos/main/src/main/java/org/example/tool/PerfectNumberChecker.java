    package org.example.tool;

    import java.util.ArrayList;
    import java.util.List;

    public class PerfectNumberChecker {
        public static void perfectNumberChecker(int userNumber) {
            List<Integer> perfectNumbers = new ArrayList<>();

            for (int i = 1; i < userNumber; i++) {
                int temp = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        temp += j;
                    }
                }
                if (temp == i) {
                    perfectNumbers.add(i);
                }
            }
            System.out.print("Todos os numeros perfeito antes de "+userNumber+" são: ");
            perfectNumbers.forEach(x -> System.out.print(x + " "));
        }
    }
