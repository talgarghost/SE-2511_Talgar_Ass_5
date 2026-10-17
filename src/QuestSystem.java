public class QuestSystem {
    private String activeQuest;

    public void loadQuests() {
        System.out.println("Квесты: База заданий синхронизирована.");
    }

    public void setActiveQuest(String quest) {
        this.activeQuest = quest;
        System.out.println("Квесты: Текущее активное задание - '" + activeQuest + "'");
    }
}