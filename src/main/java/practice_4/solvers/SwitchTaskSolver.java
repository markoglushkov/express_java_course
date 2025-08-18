package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day number";
                break;
        }
        return dayOfWeek;
    }
    public String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Зима – холодно и снежно!";
            case SUMMER -> description = "Summer is hot!";
            case AUTUMN -> description = "Leaves falls";
            case SPRING -> description = "I love spring so much!";
        }
        return description;
    }
}
