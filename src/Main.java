//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Клиент работает ТОЛЬКО с Фасадом
        LotrGameFacade game = new LotrGameFacade();

        // Всего один вызов запускает всю сложную систему
        game.startSession("Арагорн");
    }
}