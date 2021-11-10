package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Banking_System bank = new Kaspi_kz(new Sulpak());
        Scanner scan = new Scanner(System.in);

        System.out.println("\"Здравствуйте! Укажите, какой предмет вы хотели бы взять?\nУкажите номер:\n1. Телефон\n2. Планшет");
        int item = scan.nextInt();
        if (item == 1) {
            System.out.println("Ok! Как ты хочешь его купить?\nУкажите номер:\n1. В рассрочку\n2. В кредит");
            int type = scan.nextInt();
            if (type == 1) {
                bank.hirePurchase("Телефон");
            } else if (type == 2) {
                bank.creditPurchase("Телефон");
            } else {
                System.out.println("Вы ввели неправильный номер :(\nПопробуйте снова");
            }
        } else if (item == 2) {
            System.out.println("Ok! Как ты хочешь его купить?\nУкажите номер:\n1. В рассрочку\n2. В кредит");
            int type = scan.nextInt();
            if (type == 1) {
                bank.hirePurchase("Планшет");
            } else if (type == 2) {
                bank.creditPurchase("Планшет");
            } else {
                System.out.println("Вы ввели неправильный номер :(\nПопробуйте снова");
            }
        } else {
            System.out.println("Вы ввели неправильный номер :(\nПопробуйте снова");
        }
    }
}
