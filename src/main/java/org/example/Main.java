package org.example;

public class Main {
    public static void main(String[] args) {

        Integer[] vetor = {9, 2, 15, 0, 11, 19, 4, 20};

        System.out.print("Vetor original: ");
        for (Integer num : vetor)
            System.out.print(", " + num);

        System.out.print("\nVetor ordenado: ");
        bubbleSort(vetor);
        for (Integer num : vetor)
            System.out.print(", " + num);
    }

    public static void bubbleSort(Integer[] vetor){
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length - i - 1; j++){
                if (vetor[j] > vetor[j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}