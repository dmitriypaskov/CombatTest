package pashkov;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 60) {
            throw new IllegalArgumentException("Incorrect number of minutes");
        }
        this.hours = hours;
        this.minutes = minutes;
    }


    public void add(TimeSpan timeSpan) {
        minutes = hours * 60 + minutes + timeSpan.getHours() * 60 + timeSpan.getMinutes();
        if (minutes > 0) {
            int fullHours = minutes / 60;
            int restMinutes = minutes - fullHours * 60;
            setHours(fullHours);
            setMinutes(restMinutes);
        } else throw new IllegalArgumentException("Incorrect number of minutes");
    }


    public void sub(TimeSpan timeSpan) {
        int fullMinutes = (hours * 60 + minutes) - (timeSpan.getHours() * 60 + timeSpan.getMinutes());
        if (fullMinutes > 0) {
            int fullHours = fullMinutes / 60;
            int restMinutes = fullMinutes - fullHours * 60;
            setHours(fullHours);
            setMinutes(restMinutes);
        } else throw new IllegalArgumentException("Incorrect number of minutes");
    }

    public void mult(double times) {
        double fullMinutes = (hours * 60 + minutes) * times;
        if (fullMinutes > 0) {
            int fullHours = (int) fullMinutes / 60;
            int restMinutes = (int) fullMinutes - fullHours * 60;
            setHours(fullHours);
            setMinutes(restMinutes);
        } else throw new IllegalArgumentException("Incorrect number of minutes");
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "TimeSpan{" + hours + " : " + minutes + '}';
    }
}

