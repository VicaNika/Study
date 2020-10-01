package HomeWork1;

public class Task1 {
    public static void main(String[] args) {

        // 0000 0000 0000 0000 0000 0000 0010 1010



        int a = 42; // a - 101010
        int b = 15; // b - 001111


        // Операции с числами 42 и 15

        System.out.println("42: " + Integer.toBinaryString(a)); // 0010 1010
        System.out.println("15: " + Integer.toBinaryString(b)); // 0000 1111

        // Оператор ~

        System.out.println("~a");
        System.out.println(~a); // результат -43 сразу в десятичной системе
        System.out.println(Integer.toBinaryString(~a));// это значение -43 в двоичной системе (11111111111111111111111111010101)

        System.out.println("~b");
        System.out.println(~b); // результат -16 сразу в десятичной системе
        System.out.println(Integer.toBinaryString(~b));// это значение -16 в двоичной системе (11111111111111111111111111110000)

        // Побитовый &

        System.out.println("Побитовый &");
        System.out.println(a&b); // результат 10
        System.out.println(Integer.toBinaryString(a&b)); // в двоичной системе 001010
        System.out.println(b);

        // Побитовый &=, получилось то же, что и выше

        System.out.println("Побитовый &=");
        System.out.println(a&=b); // результат 10
        System.out.println(Integer.toBinaryString(a)); // в двоичной системе 001010
        System.out.println(a); // переменной a присвоилось значение 10
        System.out.println(b);

        // Побитовый |

        a = 42;
        System.out.println("Побитовый |");
        System.out.println(a|b); // результат 47
        System.out.println(Integer.toBinaryString(a|b)); // в двоичной системе 101111

        // Побитовый |=

        System.out.println("Побитовый |=");
        System.out.println(a|=b); // переменной а присвоилось значение 47
        System.out.println(Integer.toBinaryString(a)); // в двоичной системе 101111
        System.out.println(b);


        // Побитовый ^

        a = 42;
        System.out.println("Побитовый ^");
        System.out.println(a^b); // результат 37
        System.out.println(Integer.toBinaryString(a^b)); // в двоичной системе 100101
        System.out.println(b);

        // >> Сдвиг вправо

        System.out.println(">> Сдвиг вправо ");
        System.out.println(a>>b); // результат 0
        System.out.println(Integer.toBinaryString(a>>b)); // 0
        System.out.println(b);

/*      System.out.println(">> Сдвиг вправо для b>>a");
        System.out.println(b>>a); // результат 0
        System.out.println(Integer.toBinaryString(b>>a)); // 0

        System.out.println(">> Сдвиг вправо для a>>a");
        System.out.println(a>>a); // результат 0
        System.out.println(Integer.toBinaryString(a>>a)); // 0

        System.out.println(">> Сдвиг вправо для b>>b");
        System.out.println(a>>a); // результат 0
 */       System.out.println(Integer.toBinaryString(a>>a)); // 0

        // попробовала сдвинуть число 15 на 42 значения вправо, но, я так понимаю, что этого нельзя сделать, слишком большое число

        // >>= Сдвиг вправо с присваиванием

        System.out.println(">>= Сдвиг вправо с присваиванием");
        System.out.println(a>>=b); // результат 0, переменной а присваивается значение 0
        System.out.println(Integer.toBinaryString(a)); // 0
        System.out.println(b);

        // >>> Сдвиг вправо с заполнением нулями

        a =42; // опять присваиваю а значение 42
        System.out.println(">>> Сдвиг вправо с заполнением");
        System.out.println(a>>>b); // результат 0
        System.out.println(Integer.toBinaryString(a>>>b)); // 0
        System.out.println(b);

        // >>>= Сдвиг вправо с заполнением нулями с присваиванием

        System.out.println(">>>= Сдвиг вправо с заполнением и присваиванием");
        System.out.println(a>>>=b); // результат 0, переменной а присвоилось значение 0
        System.out.println(Integer.toBinaryString(a)); // 0
        System.out.println(b);

        // << Сдвиг влево

        a = 42; // опять присваиваю а значение 42

        System.out.println("<< Сдвиг влево ");
        System.out.println(a<<b);// 1376256
        System.out.println(Integer.toBinaryString(a<<b)); // 1010 1000 0000 0000 00000
        System.out.println(b);

        // <<= Сдвиг влево с присваиванием

        System.out.println("<<= Сдвиг влево с присваиванием");
        System.out.println(a<<=b); // переменной а присваивается значение 1376256
        System.out.println(Integer.toBinaryString(a)); // 101010000000000000000
        System.out.println(a);

        // Операции с числами -42 и -15

        int c = -42; // 1111 1111 1111 1111 1111 1111 1101 0110
        int d = -15; // 1111 1111 1111 1111 1111 1111 1111 0001

        System.out.println(Integer.toBinaryString(c)); // 1111 1111 1111 1111 1111 1111 1101 0110
        System.out.println(Integer.toBinaryString(d)); // 1111 1111 1111 1111 1111 1111 1111 0001

        // Оператор ~

        System.out.println("~c");
        System.out.println(~c); // результат 41
        System.out.println(Integer.toBinaryString(~c));// 101001

        System.out.println("~d");
        System.out.println(~d); // результат 14
        System.out.println(Integer.toBinaryString(~d));// 1110

        // Побитовый &

        System.out.println("Побитовый &");
        System.out.println(c&d); // результат -48
        System.out.println(Integer.toBinaryString(c&d)); // 1111 1111 1111 1111 1111 1111 1101 0000

        // Побитовый &=, получилось то же, что и выше

        System.out.println("Побитовый &=");
        System.out.println(c&=d); // результат -48
        System.out.println(Integer.toBinaryString(c)); // 1111 1111 1111 1111 1111 1111 1101 0000
        System.out.println(c); // переменной c присвоилось значение -48

        // Побитовый |

        c = -42;
        System.out.println("Побитовый |");
        System.out.println(c|d); // результат -9
        System.out.println(Integer.toBinaryString(c|d)); // 1111 1111 1111 1111 1111 1111 1111 0111

        // Побитовый |=

        System.out.println("Побитовый |=");
        System.out.println(c|=d); // переменной c присвоилось значение -9
        System.out.println(Integer.toBinaryString(c)); // 1111 1111 1111 1111 1111 1111 1111 0111


        // Побитовый ^

        c = -42;
        System.out.println("Побитовый ^");
        System.out.println(c^d); // результат 39
        System.out.println(Integer.toBinaryString(c^d)); // 100111


        // >> Сдвиг вправо

        System.out.println(">> Сдвиг вправо ");
        System.out.println(c>>d); // результат -1
        System.out.println(Integer.toBinaryString(c>>d)); // 1111 1111 1111 1111 1111 1111 1111 1111
        // сдвиг проиходит на 17 значений вправо

        // >>= Сдвиг вправо с присваиванием

        System.out.println(">>= Сдвиг вправо с присваиванием");
        System.out.println(c>>=d); // результат -1, переменной c присваивается значение -1
        System.out.println(Integer.toBinaryString(c)); // 1111 1111 1111 1111 1111 1111 1111 1111
        // сдвиг проиходит на 17 значений вправо, так как берется пять последних младших битов числа -15
        // 11001 является 17

        // >>> Сдвиг вправо с заполнением нулями

        c = -42; // опять присваиваю c значение -42
        System.out.println(">>> Сдвиг вправо с заполнением");
        System.out.println(c>>>d); // результат 32767
        System.out.println(Integer.toBinaryString(c>>>d)); // 1111 1111 1111 111
        // сдвиг проиходит на 17 значений вправо, так как берется пять последних младших битов числа -15
        // 11001 является 17.

        // >>>= Сдвиг вправо с заполнением нулями с присваиванием

        System.out.println(">>>= Сдвиг вправо с заполнением и присваиванием");
        System.out.println(c>>>=d); // результат  32767, переменной c присвоилось значение 32767
        System.out.println(Integer.toBinaryString(c)); // 1111 1111 1111 111
        System.out.println(c);

        // << Сдвиг влево

        c = -42; // опять присваиваю c значение -42

        System.out.println("<< Сдвиг влево ");
        System.out.println(c<<d);// -5505024
        System.out.println(Integer.toBinaryString(c<<d)); // 11111111101011000000000000000000
        // сдвиг проиходит на 17 значений влево, так как берется пять последних младших битов числа -15
        // 11001 является 17

        // <<= Сдвиг влево с присваиванием

        System.out.println("<<= Сдвиг влево с присваиванием");
        System.out.println(c<<=d); // переменной c присваивается значение -5505024
        System.out.println(Integer.toBinaryString(c)); // 11111111101011000000000000000000
        // сдвиг проиходит на 17 значений влево, так как берется пять последних младших битов числа -15
        // 11001 является 17







    }
}
