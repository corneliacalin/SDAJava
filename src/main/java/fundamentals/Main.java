package fundamentals;

import javafx.concurrent.Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TasksExercises tasksExercises1= new TasksExercises();
        TasksExercises tasksExercises2= new TasksExercises();
        System.out.println("x="+tasksExercises1.x);
        System.out.println("y="+tasksExercises1.y);
        System.out.println("x2="+tasksExercises2.x);
        System.out.println("y2="+tasksExercises2.y);
        tasksExercises1.x=22;
        TasksExercises.y=3;
        System.out.println("x1="+tasksExercises1.x);
        System.out.println("y1="+tasksExercises1.y);
        System.out.println("x2="+tasksExercises2.x);
        System.out.println("y2="+tasksExercises2.y);
//// task1
//           tasksExercises.circlePerimeter();
//        TasksExercises.circlePerimeter();
//        System.out.println(tasksExercises.x);
    }
}
