public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double mark;
    private char gender;

    public void setFromArray(String[] array)
    {
        setFirstName(array[0]);
        setLastName(array[1]);
        setAge(Integer.parseInt(array[2]));
        setGender(array[3].charAt(0));
        setMark(Double.parseDouble(array[4]));
    }
    public void Print()
    {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: "+ getLastName());
        System.out.println("Age: "+ getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Mark: "+ getMark());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
