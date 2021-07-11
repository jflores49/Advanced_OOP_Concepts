import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

public class Racer implements Runnable /* TODO
Add something here so that you can pass this Racer to the constructor of Thread*/{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO 
Create a constructor that receives a Car objec and initializes c.*/
    public Racer(Car c){
        this.c = c;
    }

    /* TODO
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
    @Override
    public void run(){
        while (c.odometer != distance){
            if(c.miles == 0){
                try{
                    System.out.println("Charging");
                    c.charge();
                    Thread.sleep((int) (c.miles));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
                c.move(1);
        }
    }

}
