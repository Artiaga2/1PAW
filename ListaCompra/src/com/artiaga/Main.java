package com.artiaga;

import model.ListaCompra;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here



        int option;


        while((option = ListaCompra.showmenu(ListaCompra.tasklist) ) != 4){
            switch (option){
                case 1:
                    ListaCompra.addTask(ListaCompra.tasklist);
                    break;

                case 2:
                    ListaCompra.deleteTask(ListaCompra.tasklist);
                    break;

                case 3:
                    ListaCompra.showTasks(ListaCompra.tasklist);
                    break;

                case 4:
                    ListaCompra.showImport(ListaCompra.tasklist);
                    break;

                case 0:
                    ListaCompra.pay(ListaCompra.tasklist);
                    break;
                default:
            }
        }


    }
}
