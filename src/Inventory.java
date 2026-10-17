public class Inventory {
    private String equippedWeapon;

    public void loadItems() {
        System.out.println("Инвентарь: Базовые предметы загружены из сохранения.");
    }

    public void equipWeapon(String weapon) {
        this.equippedWeapon = weapon;
        System.out.println("Инвентарь: В руки взято оружие - " + equippedWeapon);
    }
}