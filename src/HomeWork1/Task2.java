package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
       int a = 8;
       int b =2;

       //2.1
       int p = 5 + b / a;
       System.out.println("Результат 2.1 = " + p); // деление приоритетнее сложения, поэтому сначала делим 2 на 8, получаем 0.25, дробная часть отпадает, 5+0=5

       //2.2

       int x = (5 + b )/ a;
       System.out.println("Результат 2.2 = " + x); // выражение  скобках вычисляется в первую очередь (5+2=7), 7/8=0.875, остается 0

       //2.3
       int z = (5 + b++) / a;
       System.out.println("Результат 2.3 = " + z); // инкремент вычисляется  первую очередь b остается равным 2, потом сложение в скобках (5+2=7), потом деление, результат аналогичен верхнему

       //2.4
       b = 2;
       a = 8;
       int y = (5 + b++) / --a;
       System.out.println("Результат 2.4 = " + y); // вычисляем инкремент и декремент (b остается 2, a равняется 7), значение в скобках 7, 7/7=1

       //2.5
       b = 2;
       a = 8;
       int v = (5 * 2 >> b++) / --a;
       System.out.println("Результат 2.5 = " + v);// сначала инкремент и декремент (b остается 2, a равняется 7), потом умножение в скобках (5*2=10), число 10 смещаем на 2 бита вправо, получаем 2, 2/7=0.285..., получаем 0



       //2.6
       b = 2;
       a = 8;
       int t = (5 + 7 > 20 ? 68 : 22 * b >> b++) / --a;

       System.out.println(Integer.toBinaryString (44));
       System.out.println(Integer.toBinaryString(44>>2));
       System.out.println(t); // сначала инкремент и декремент (b остается 2, a равняется 7), в выражении в скобках умножаем 22 на 2, получаем 44, складываем 5 и 7, получаем 12, сдвигаем 44 на 2 бита вправо, получаем 11; выражение в  скобках будет иметь вид (12>20?68:11)/7, результатом тернарной операции будет 11, поэтому 11/7=1.57.., остается 1

       //2.7
       b = 2;
       a = 8;
/*       int o = (5 + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --a;
       System.out.println(o); // Неверное выражение
*/

       //2.8
       boolean zx = 6 - 2 > 3 && 12 * 12 <= 119;
       System.out.println(zx); // сначала умножаю 12 на 12, получаю 144, потом 6-2=4, 4>3 && 144 <=119, значение слева true, справа - false, результат false

       //2.9

       boolean xy = true && false;
       System.out.println(xy); // результат false, так как слева true, а справа false, для результата true справа и слева должны быть true




    }
}
