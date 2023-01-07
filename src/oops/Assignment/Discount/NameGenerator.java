package oops.Assignment.Discount;

import java.util.Random;

public class NameGenerator {
        private static final String[] CUSTOMER_NAMES = {"Ramesh", "Jayesh", "Mahesh", "Diksha", "Manisha"};

        private static final Random random = new Random();

        public static String getName(){
        int randomIndex = random.nextInt(CUSTOMER_NAMES.length);
        return CUSTOMER_NAMES[randomIndex];

    }
}
