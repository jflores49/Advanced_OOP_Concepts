public class Task {
    public static void main(String[] args){
/* TODO */
//Copy the Task from task 2 here and add experiences where the end years are not in order. Watch it print the resume with the dates in order from most recent to least.
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO
Create an education object. Schoo is NEIU, major is Computer Science.*/
        Resume.Education edu = r.new Education("NEIU", "Computer Science");
       /* TODO
add this education object to the resume "r"*/
        r.addEducation(edu);
        /* TODO
Create a new Experience object and add it to the resume.*/
        Resume.Experience exp = new Resume.Experience("Professor", 2009, 2018);
        r.addExperience(exp); /* TODO
Create a new experience object on the fly, inside the addExperiece call.);*/
        r.addExperience(new Resume.Experience("Nurse", 2010, 2016));
        r.addExperience(new Resume.Experience("Doctor", 2015, 2019));
        r.addExperience(new Resume.Experience("Engineer", 2012, 2020));


        System.out.println(r); //watch the resume print.

    }
}