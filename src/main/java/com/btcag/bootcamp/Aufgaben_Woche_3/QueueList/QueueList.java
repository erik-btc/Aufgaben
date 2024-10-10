package com.btcag.bootcamp.Aufgaben_Woche_3.QueueList;

public class QueueList implements QueueListInterface{

    int maxLength = 5;
    int[] list = new int[maxLength];


    public int[] doubleArray(int[] list) {
        int[] temp = new int[list.length * 2];
        System.arraycopy(list, 0, temp, 0, list.length);
        return temp;
    }


    @Override
    public int popFront() {
        int temp = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        return temp;
    }

    @Override
    public int popLast() {
        int temp = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            if(list[i] != 0){
                temp = list[i];
                list[i] = 0;
                break;
            }
        }

        return temp;
    }

    @Override
    public int pushLast(int i) {
        if (list[list.length - 1] != 0) {
            list = doubleArray(list);
        }
        int temp = -1;
        for (int j = list.length - 1; j >= 0; j--) {
            if(list[j] != 0){
                list[j + 1] = i;
                temp = list[j + 1];
                break;
            }
        }
        if(list[0] == 0){
            list[0] = i;
            temp = list[0];
        }

        return temp;
    }

    @Override
    public int pushFront(int i) {
        if(list[list.length - 1] != 0){
            list = doubleArray(list);
        }

        int temp = -1;

        if (list[0] != 0) {
            for (int j = list.length - 2; j >= 0; j--) {
                list[j + 1] = list[j];
            }
        }
        list[0] = i;
        if(list[0] != 0){
            temp = list[0];
        }
        return temp;

    }

    @Override
    public int get(int i) {
        return list[i];
    }
    public void getList(){
        for (int i: list){
            System.out.print(i + " ");
        }
    }
}
