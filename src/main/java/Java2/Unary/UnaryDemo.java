package Java2.Unary;

/**
 * Unarni operatori:
 * <li> 1. + - SIGN</(li>
 * <li> 2. ++ INCREMENT
 *    <li> 2.1 PRE</li>
 *    <;I> 2.2 POST</;I>
 * </li>
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        number++; //POST
        System.out.println(number); //24
        number = 23;
        ++number; //PRE
        System.out.println(number); //24
        number = 23;
        System.out.println(++number); //24 -> 2 koraka : increment i pošalji u konzolu
        number = 23;
        System.out.println(number++); // 23 -> poslati pa uvećati
        System.out.println(number); //24




    }
}
