import java.util.ArrayList;
import java.util.List;

public class Resume {
/* TODO
Create a public member inner class Education according to the specifications.*/
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

/* TODO
Create the Person and List of Education and List of experience objects. They should be private.*/
    private Person person;
    private List<Education> educationList;
    private List<Experience> experienceList;

    public Resume(Person p){
/* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work.*/
        this.person = p;
        this.educationList = new ArrayList<>();
        this.experienceList = new ArrayList<>();
    }

/* TODO
Create the addEducation, addExperience and override the toString methods as specified.*/
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
