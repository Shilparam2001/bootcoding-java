package keywords.Methods;

public class SeniorCitizen {
    public static void main(String[] args) {
        int[] ages = {12, 15, 5, 26, 40, 30};
        System.out.println(isSeniorCitizen(ages));
        System.out.println(isKids(ages));
        System.out.println(isAdult(ages));


    }

    public static boolean isSeniorCitizen(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 60) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKids(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] <= 12) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAdult(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18 && ages[i] < 60) {
                return true;
            }
        }
        return false;
    }
}

