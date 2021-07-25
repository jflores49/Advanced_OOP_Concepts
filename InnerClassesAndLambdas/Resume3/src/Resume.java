import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO */
//Same two inner classes and member variables as in task 3.
public class Education{
    String school;
    String major;

    public Education(String school, String major){
        this.school = school;
        this.major = major;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getSchool(){return this.school;}

    public String getMajor(){return this.major;}

    @Override
    public String toString(){
        return this.major + " at " + this.school;
    }
}

/* TODO
Create a public static inner class called Experience, according to the specifications.*/

    public static class Experience{
        String job;
        int startYear;
        int toYear;

        public Experience(String job, int startYear, int endYear){
            this.job = job;
            this.startYear = startYear;
            this.toYear = endYear;
        }

        @Override
        public String toString(){
            return this.startYear + "-" + this.toYear + ": " + this.job;
        }
    }

    //Create a member variable of type Person (exactly as in task 2)
    private Person person;
    /* TODO */
//Create a List to hold values of type Education (exactly as in task 2)
    private List<Education> educationList;
    /* TODO */
//Create a Priority Queue that holds values of type Experience.
    PriorityQueue<Experience> experienceList;

    public Resume(Person p){
/* TODO */
//Same initialization of Person and the List of Education objects
    this.person = p;
    this.educationList = new ArrayList<>();
 /* TODO */
//Initialize the priority queue in one line, without importing the Comparator interface.
        this.experienceList = new PriorityQueue<>((exp1, exp2) -> exp2.toYear - exp1.toYear);
    }
/* TODO */
//The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()

    //Add a standard getter for the experiences. getExperience. it should return a priority queue.
    public PriorityQueue getExperience(){
        return this.experienceList;
    }

    /* TODO */
//Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)
    public void addExperience(Experience exp){
        this.experienceList.add(exp);
    }

    public void addEducation(Education edu){
        this.educationList.add(edu);
    }

    @Override
    public String toString(){
        String output = person.toString() + "\nExperience\n";
        for (Experience exp : experienceList) {
            output += exp + "\n";
        }
        output += "Education\n";
        for (Education edu : educationList) {
            output += edu + "\n";
        }
        return output;
    }



}
