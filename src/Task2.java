import java.util.ArrayList;
import java.util.HashMap;


public class Task2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> dateHolidats = new ArrayList<>();
        dateHolidats.add(1);
        dateHolidats.add(7);
        stateHolidays.put("january", dateHolidats);
        dateHolidats = new ArrayList<>();
        dateHolidats.add(23);
        stateHolidays.put("february", dateHolidats);
        dateHolidats = new ArrayList<>();
        dateHolidats.add(8);
        stateHolidays.put("march", dateHolidats);
        dateHolidats = new ArrayList<>();
        dateHolidats.add(1);
        dateHolidats.add(9);
        stateHolidays.put("may", dateHolidats);
        dateHolidats = new ArrayList<>();
        dateHolidats.add(12);
        stateHolidays.put("june", dateHolidats);
        dateHolidats = new ArrayList<>();
        dateHolidats.add(4);
        stateHolidays.put("november", dateHolidats);



        System.out.println(stateHolidays);
    }
}