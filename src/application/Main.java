package application;

import java.util.Arrays;

final public class Main {

    public static void main(final String[] args) {

        for (final var s : Arrays.stream(args).toList()) {

            if (s.isEmpty()) {

                System.out.println("Empty...");
            }

            else if (s.equals("--Hex")) {

                String parsedInteger = Integer.toHexString(s.charAt(1));
                System.out.println(parsedInteger);

            }

            else if (s.equals("--Dec")) {

                int parsedInteger = Integer.parseInt(String.valueOf(s.charAt(2)));
                System.out.println(parsedInteger);

            }


        }

    }

}