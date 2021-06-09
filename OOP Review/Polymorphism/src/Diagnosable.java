public interface Diagnosable {
    double getTemperature();
/* TODO */
/*Declare a hasFever method that reutrns true is the temperature
is greater than 100.4 */
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);

    default boolean hasFever()
    {
        return getTemperature() > 100.4;
    }
/* TODO */
/*Decleare two setters. One for systolic and one for diastolic.
Check the getters to infer the parameter types.*/

    void setSystolic(int s);
    void setDiastolic(int d);

}
