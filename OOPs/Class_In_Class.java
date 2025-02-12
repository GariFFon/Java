package OOPs;

public class Class_In_Class {
    class Student
    {
        int Roll_No;
        String Name;
        static String Department = "CSE";
        Student (int r, String n)
        {
            Roll_No = r;
            Name = n;
        }
        void Display()
        {
            System.out.println(Roll_No + " " +Name+ " "+ Department);
        }
    }
    public static void main(String[] args) {
        Class_In_Class g = new Class_In_Class();
        Student S1 = g.new Student(1, "Gourav");
        S1.Display();
    }
}
