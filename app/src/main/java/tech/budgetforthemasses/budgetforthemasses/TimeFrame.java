package tech.budgetforthemasses.budgetforthemasses;

public class TimeFrame {
    private String time;

    public TimeFrame(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return time;
    }
}
