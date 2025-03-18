package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

import static org.example.entity.StringSet.findUniqueWords;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Project1", "Fix bug", "Ann", Status.ASSIGNED, Priority.HIGH);
        Task task2 = new Task("Project2", "Description2", "Bob", Status.IN_PROGRESS, Priority.MED);
        Task task3 = new Task("Project3", "Description3", "Carol", Status.IN_QUEUE, Priority.LOW);

        Set<Task> annsTasks = new HashSet<>();
        annsTasks.add(task1);
        Set<Task> bobsTasks = new HashSet<>();
        bobsTasks.add(task2);
        Set<Task> carolsTasks = new HashSet<>();
        carolsTasks.add(task3);
        Set<Task> unassignedTasks = new HashSet<>();

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        Set<Task> allTasks = taskData.getTasks("all");
        System.out.println("All tasks: " + allTasks);

        Set<Task> annsTasksResult = taskData.getTasks("ann");
        System.out.println("Ann's tasks: " + annsTasksResult);

        Set<Task> multiAssignedTasks = taskData.getTasksAssignedToMultiple();
        System.out.println("Tasks assigned to multiple: " + multiAssignedTasks);


        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println("Benzersiz kelimeler: " + uniqueWords);
        System.out.println("Benzersiz kelime sayısı: " + uniqueWords.size());
    }
}