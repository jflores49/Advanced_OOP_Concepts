/*TODO
Create a Person class exactly as in Task 1. (Copy/Paste).*/

/* TODO
Import the java.time.LocalDate and java.time.Period classes.
You will need them later.*/
import java.time.LocalDate;
import java.time.Period;

/* TODO
Declare the class*/
public class Person {

    /* TODO
Create two private member variables to hold the name and the birthDate of the employee. The birthdate has to be a LocalDate*/
    private String name;
    private LocalDate birthDate;

    /* TODO
Create a member inner class called Position with two
member variables: a name and a salary. Override the toString()
method as specified in the instructions*/
    private class Position {
        private String name;
        private double salary;

        @Override
        public String toString(){
            return this.name + ":" + this.salary;
        }
    }

    /* TODO
Create a member variable (of Person) of type Position.*/
    private Position position;


    /* TODO
Create a constructor for Person that takes in two Strings. A name and a birthdate in ISO format (yyyy-mm-dd) and sets the corresponding memeber variables correctly*/
    public Person(String name, String birthdate){
        this.name = name;
        this.birthDate = LocalDate.parse(birthdate);
    }

    /* TODO
Create a getAge method that returns the age in years of this person. You need to use the Period class here.*/
    public int getAge(){
        LocalDate now = LocalDate.now();
        Period age = Period.between(this.birthDate, now);
        return age.getYears();
    }
    /* TODO
Code the setPosition method. This should take one String and one double for the title and the salary respectively.*/
    public void setPosition(String position, double salary){
        Position pos = new Position();
        pos.name = position;
        pos.salary  = salary;
        this.position = pos;
    }

    /* TODO
A getter for position.*/
    public Position getPosition(){
        return this.position;
    }

    /* TODO
Override the toString() method to display the person's name, age and position (with salary and title).*/
    public String toString(){
        return this.name + ", " + getAge() + ", " + this.position;
    }
/* TODO
Finish closing curly braces and the class.*/
}
