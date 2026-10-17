public class GAmeWorld {
    private String location;

    public void generateWorld(String locationName) {
        this.location = locationName;
        System.out.println("Мир: Локация '" + location + "' успешно сгенерирована.");
    }

    public void spawnPlayer() {
        System.out.println("Мир: Персонаж появился на карте.");
    }
}