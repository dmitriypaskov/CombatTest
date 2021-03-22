package pashkov;

public class Main {

    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(15,50);
        TimeSpan timeSpan2 = new TimeSpan(1,20);
        timeSpan1.add(timeSpan2);
        timeSpan1.sub(timeSpan2);
        timeSpan1.mult(3);
    }
}
