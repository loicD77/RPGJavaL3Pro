package ProtectiveOriginal; // Déclaration correcte du package pour la classe ProtectionItem

import Player.Player; // Import correct de la classe Player
import Item.Item; // Import correct de la classe Item
public abstract class ProtectionItem extends Item {
    protected int defense; // Attributs protégés
    protected int price;

    public ProtectionItem(String name, String description, int defense, int price) {
        super(name, description, price);
        this.defense = defense;
        this.price = price;
    }

    public int getDefensePoints() {
        return defense; // Getter pour les points de défense
    }

    @Override
    public abstract String asciiArt(); // Méthode abstraite

    @Override
    public abstract void use(Player player); // Méthode abstraite

    public int getDefense() {
        return defense; // Getter pour la défense
    }

    public int getPrice() {
        return price; // Getter pour le prix
    }


}