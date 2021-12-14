package practicleweek2;

public class Teacher extends People {
    private String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public String getSubject() {
        return subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }


}
