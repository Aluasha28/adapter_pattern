package com.company;

public class Kaspi_kz implements Banking_System {
    private Sulpak sulpak;

    public Kaspi_kz(Sulpak sulpak) {
        this.sulpak = sulpak;
    }
    @Override
    public void hirePurchase(String item) {
        if (item.equals("Phone")) {
            this.sulpak.buyPhone();
        } else if (item.equals("Tablet")) {
            this.sulpak.buyNotebook();
        }
        System.out.println("Вы купили в рассрочку");
    }

    @Override
    public void creditPurchase(String item) {
        if (item.equals("Phone")) {
            this.sulpak.buyPhone();
        } else if (item.equals("Tablet")) {
            this.sulpak.buyNotebook();
        }
        System.out.println("Вы купили в кредит");
    }
}
