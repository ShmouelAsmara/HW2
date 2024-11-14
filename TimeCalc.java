public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hour = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[1]);
        int minutesToAdd = Integer.parseInt(args[2]);

        // clac for the min and ex for hours
        int totalMinutes = (hour * 60) + minutes + minutesToAdd;
        // calc hour
        int calcHour = (totalMinutes / 60);
        int newHour = calcHour % 24;
        // calc minutes
        int newMinutes = totalMinutes - (calcHour * 60);
        if (newHour < 9) {
            if (newMinutes < 9) {
                System.out.println("0" + newHour + ":0" + newMinutes);
                return;
            }
            System.out.println("0" + newHour + newMinutes);
            return;
        }
        if (newMinutes < 9) {
            System.out.println(newHour + ":0" + newMinutes);
        } else
            System.out.println(newHour + ":" + newMinutes);

    }
}
