public class Racer implements Runnable { /* TODO
This class is exactly as the Racer from Task 1*/
    Car c;
    int distance = 1000;

    public Racer(Car c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (c.odometer != distance) {
            if (c.miles == 0) {
                try {
                    System.out.println("Charging");
                    c.charge();
                    Thread.sleep((int) (c.miles));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else
                c.move(1);
        }
    }
}
