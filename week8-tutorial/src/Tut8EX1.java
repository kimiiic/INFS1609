public class Tut8EX1 {

    public static void main(String[] args){
        Person person = new Person("Yenni", "Business School", "76874325", "yeet@gmail");
        Student student = new Student("Tai", "Not School", "11111111", "t@gmail", "hello");
        Tutor tutor = new Tutor("Wilbert", "Sad School", "3333333", "w@gmail", "here", 100, "today");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(tutor.toString());
    }

}