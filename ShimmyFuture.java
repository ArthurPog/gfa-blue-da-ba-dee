import java.util.Scanner;

public class ShimmyFuture {
    public static void getYourHoroscopeSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your birth month: ");
        int month = scanner.nextInt();
        System.out.print("Your birth day: ");
        int day = scanner.nextInt();
        scanner.close();

        String[] zodiacSigns = {
                "Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini",
                "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"
        };

        int[] startDates = {20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22};

        int index = (month - 1 + (day >= startDates[month - 1] ? 1 : 0)) % 12;
        System.out.println("Your horoscope sign is: " + zodiacSigns[index]);
        
        // testing new push
    }
}
