package com.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();

        int ch = 0;

       do {
            System.out.println("\n1.Add Student info");
            System.out.println("2.Display");
            System.out.println("3.Search Rollno");
            System.out.println("4.Sort Rollno");
            System.out.println("5.Sort Name");
            System.out.println("6.Sort Marks");
            System.out.println("7.Exit");
            System.out.print("Give choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Student name: ");
                    String Name = sc.nextLine();

                    System.out.print("Enter Student Rollno: ");
                    int Rollno = sc.nextInt();

                    System.out.print("Enter Student marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(Name, Rollno, marks);
                    list.add(s);

                    System.out.println("Student added successfully");
                    break;

                case 2:
                    System.out.println("Student info:");
                    for (Student st : list) {   
                        System.out.println(st);
                    }
                    break;

                case 3:
                	System.out.print("Enter roll no to search : ");
    		        Rollno = sc.nextInt();
    		        Student key = new Student("", Rollno, 0);
    		        int idx = list.indexOf(key);
    		        if (idx != -1)
    		            System.out.println(list.get(idx) + " found at index " + idx);
    		        else
    		            System.out.println("Not found");
    		        break;
                case 4:
                    Collections.sort(list); 
                    System.out.println("Sorted by Rollno");
                    list.forEach(System.out::println);
                    break;

                case 5:
                    list.sort(Comparator.comparing(Student::getName));
                    System.out.println("Sorted by Name");
                    list.forEach(System.out::println);
                    break;

                case 6:
                    list.sort(Comparator.comparingDouble(Student::getMarks));
                    System.out.println("Sorted by Marks");
                    list.forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 7);

        sc.close();
    }
}

