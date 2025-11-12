public class TimeCalc {
    public static void main(String[] args) {


        int hours = Integer.parseInt(""+args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt(""+args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(""+args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd ;
        int totalhour = totalMinutes/60;
        int newhour = totalhour%24;
        int newminutes = totalMinutes - (totalhour*60);

        System.out.println(String.format("%02d:%02d", newhour, newminutes));



}
}
