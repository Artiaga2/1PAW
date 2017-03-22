package com.artiaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> tasklist = new ArrayList<String>();

        tasklist.add("Echar sopa en el alcon Milenario");
        tasklist.add("Entrenar con Obi Wan");
        tasklist.add("Quedar con Amidala");
        tasklist.add("Darle una paliza a Jabba");

        int option;

        while((option = showmenu(tasklist) ) != 4){
        switch (option){
            case 1:
                showTasks(tasklist);
                break;

            case 2:
                addTask(tasklist);
                break;

            case 3:
                deleteTask(tasklist);
                break;
                default:
            }
        }
    }



    public static  void showTasks(ArrayList<String> myTask){

        int index = 0;

        for (String tasks : myTask){
            System.out.println((index++) + "-" + tasks );
        }
    }

    public static int showmenu(ArrayList<String> taskList){
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("**********************");
        System.out.println("* 1 - Ver tareas     *");
        System.out.println("* 2 - Añadir tareas  *");
        if (taskList.size() > 0) {
            System.out.println("* 3 - Eliminar tarea *");
        }
        System.out.println("* 4 - Salir          *");
        System.out.println("**********************");
        System.out.println("*Opcion");

        option = input.nextInt();

        return option;
    }

    public static void addTask (ArrayList<String> taskList){
        Scanner input = new Scanner(System.in);
        String task;

        do {
            System.out.println("Introduce nueva tarea");
            task = input.nextLine();

        }while (task.length() == 0);

        taskList.add(task);
    }

    public static void deleteTask(ArrayList<String> taskList){
        Scanner input = new Scanner(System.in);

        int index;

        showTasks(taskList);

        do {
            System.out.println("Introducir el indice: ");

            index = input.nextInt();
        }while(correctIndex(index,taskList));

        taskList.remove(index - 1);

    }


    public static boolean correctIndex (int index, ArrayList<String> arrayList){

        if(index >=0 && index < arrayList.size()){
            return true;
        }else{
            return false;
        }
    }
}
