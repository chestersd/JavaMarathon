package org.chester_sd.day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int counterPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (counterPlayers < 6)
            counterPlayers++;
    }

    public void run(){
        if (stamina == 0)
            return;

        stamina--;
        if (stamina == 0)
            counterPlayers--;
    }

    public static void info(){
        if (counterPlayers < 6) {
            System.out.println("Команды неполные, еще есть " +
                    (6 - counterPlayers) + " свободных мест");
        } else System.out.println("Мест больше нет");
    }

    public int getStamina() {
        return stamina;
    }
}
