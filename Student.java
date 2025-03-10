class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 95) return "A+";
        else if (marks >= 80 && marks<=95) return "A";
        else if (marks >= 70 && marks<=80) return "B";
        else if (marks >= 60 && marks<=70) return "C";
		else if (marks >= 50 && marks<=60) return "C";
        else return "F";
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student student = new Student("Dhruv Sharma", 45, 100);
        student.displayDetails();
    }
}
/*
Output
Student Details:
Name: Dhruv Sharma
Roll Number: 45
Marks: 100.0
Grade: A+
*/