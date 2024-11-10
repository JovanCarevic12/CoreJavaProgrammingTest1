package Java2;

public class Test2 {
    public static void main(String[] args) {
        //CELI BROJEVI
        byte firstNumber = 127;
        byte secondNumber = -128;
        //Short 16-bitni zapis
        short shortNumber = 32767;
        short secondShortNumber = -32768;
        System.out.println(firstNumber);
        //AUTOMASTKA KONVERZIJA TIPA IZ Byte -> Short
        short shortNumber3 = firstNumber;
        System.out.println(shortNumber3);
        short shortyNumber = 89;
        //EKSPLICITNA KONVERZIJA iz Short -> Byte
        byte byteNumber = (byte) shortyNumber;
        //32-bitni zapis
        int number = 23;
        //64-bitni zapis TIP Varijabla = vrednost;
        long longNumber = 2341;
        // ako je longnumber 234,svi koraci će se ispoštovati. ali ako je broj 2341,drugi korak se preskače
        //1. 234 evaluira ili tretira kao integer 32-bitni celi broj
        //2. automatska konverzija tipa 234 32-bitni = 64-bitni integer
        //3. Varijabli longnumber ću upisati vrednost 64-bitnog zapisa
        double doubleNumber = 3.14;
        // 1. 3.14 vrednost se tretira kao 64-bitni zapis
        // 2. operator dodele će upisati vrednost 3.14
        float floatNumber = 3.14F;
        // može se posle znaka = staviti (float) ili staviti 3.14f/F

        char slovo = 'A';
        char novoSlovo = 66;
        //umesto slovo može se staviti char
        int noviBroj = slovo;
        System.out.println("NOVIBROJ = " + noviBroj);
        System.out.println("NOVIBROJ = " + novoSlovo);
        char seperator = ';';
        int seperatorNumber = seperator;
        System.out.println("SEPERATOR = " + seperator + "SEPARATOR NUMBER = " + seperatorNumber);

        boolean condition = true;
        System.out.println(condition);

        //Java 10
        var nekiBroj  = 23; //int
        nekiBroj = 345;
        System.out.println("ISPIS NEKI BROJ = " + nekiBroj); //345
        var slovo2 = 'A'; //char
        slovo2 = 66;
        System.out.println ("slovo2 = " + secondNumber); //B





    }
}
