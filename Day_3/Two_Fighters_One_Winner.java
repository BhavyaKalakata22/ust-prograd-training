public class Kata{
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean isFighter1Turn = (fighter1.name == firstAttacker);
        while (fighter1.health > 0 && fighter2.health > 0) {
            if(isFighter1Turn) {
                fighter2.health -= fighter1.damagePerAttack;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
            }
            isFighter1Turn = !isFighter1Turn;
        }

        return (fighter1.health <= 0) ? fighter2.name : fighter1.name;
    }
}