package week_01.exercise_05;

public class Twofer {

    public String twofer(String name) {

        String message;

        if (name == null) {
            message = "One for you, one for me.";
        } else if (name.isEmpty()) {
            message = "One for you, one for me.";
        } else {
            message = "One for " + name + ", one for me.";
        }

        return message;
    }
}
