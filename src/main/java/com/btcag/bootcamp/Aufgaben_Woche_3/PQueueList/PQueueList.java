package com.btcag.bootcamp.Aufgaben_Woche_3.PQueueList;

public class PQueueList implements PQueueListInterface {

    private int size;
    private int[] array;

    public PQueueList(){
        this.size = 0;
        array = new int[5];
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++){
            s += array[i];
            if (i < size-1){
                s += ", ";
            }
        }
        s += "]";
        return s;
    }


    private void chooseArrayRightSize(){
        if (size + 1 == array.length){
            int[] tempArray = new int[size*2];
            for (int i = 0; i < array.length; i++){
                tempArray[i] = array[i];
            }
            this.array = tempArray;
        }
    }

    @Override
    public int popFront() {
        if (size < 1){
            return -1;
        }
        int temp = array[0];
        for (int i = 1; i < this.size; i++){
            array[i - 1] = array[i];
        }
        size--;
        return temp;
    }

    @Override
    public int popLast() {
        if (size < 1){
            return -1;
        }
        return array[--size];
    }

    @Override
    public int pushLast(int i) {
        chooseArrayRightSize();
        array[size] = i;
        return size++;
    }

    @Override
    public int pushFront(int i) {
        chooseArrayRightSize();
        for (int j = size; j > 0; j-- ){
            array[j] = array[j - 1];
        }
        array[0] = i;
        size++;
        return 0;
    }


    @Override
    public int get(int i) {
        if (i >= size){
            return -1;
        }
        return array[i];
    }
}
