public class Player_status {
    private int health;
    private int mana;

    public void loadBaseStats(String name) {
        this.health = 100;
        this.mana = 50;
        System.out.println("Статистика: Профиль '" + name + "' загружен. HP: " + health + ", MP: " + mana);
    }
}