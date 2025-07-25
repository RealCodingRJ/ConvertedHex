package application;

import java.util.Arrays;

final public class Main {

    public static void main(final String[] args) {

        for (final var s : Arrays.stream(args).toList()) {

            switch (s) {
                
                case "" -> System.out.println("Empty...");
                case "--Hex" -> {

                    String parsedInteger = Integer.toHexString(s.charAt(1));
                    System.out.println(parsedInteger);

                }
                case "--Dec" -> {

                    int parsedInteger = Integer.parseInt(String.valueOf(s.charAt(2)));
                    System.out.println(parsedInteger);

                }
            }


        }

    }

}