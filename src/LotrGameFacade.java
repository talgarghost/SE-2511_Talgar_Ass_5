public class LotrGameFacade {
    private Player_status stats;
    private Inventory inventory;
    private QuestSystem quests;
    private GAmeWorld world;

    public LotrGameFacade() {
        // Фасад сам создает объекты подсистемы
        this.stats = new Player_status();
        this.inventory = new Inventory();
        this.quests = new QuestSystem();
        this.world = new GAmeWorld();
    }
    public void startSession(String playerName) {
        System.out.println("=== Запуск игры The Lord of the Rings RPG ===");
        try {
            stats.loadBaseStats(playerName);

            inventory.loadItems();
            inventory.equipWeapon("Сломанный меч Нарсил");

            quests.loadQuests();
            quests.setActiveQuest("Добраться до Ривенделла");

            world.generateWorld("Средиземье");
            world.spawnPlayer();

            System.out.println("=== Игровая сессия успешно начата! ===");
        } catch (Exception e) {
            System.out.println("Ошибка при загрузке: " + e.getMessage());
        }
    }
}