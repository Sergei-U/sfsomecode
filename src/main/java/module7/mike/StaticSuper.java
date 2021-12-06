package module7.mike;/*
Java-код на этой странице представляет собой полноценную программу. Ваша задача - притворится компилятором и определить,
скомпилируется ли этот код. Если компиляция не сможет пройти успешно, как вы это исправите? И каков будет результат работы в ином случае?
 */

public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }

    StaticSuper() {                                           //Ответ 1(Это конструктор, поэтому нужно добавить скобочки - StaticSuper() )
        System.out.println("Родительский конструктор");
    }
}

class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Статический блок " + rand);
    }

    StaticTests() {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Внутри main");
        StaticTests st  = new StaticTests();
    }
}

/*
Если код скомпилируется, что появится на экране?

1.  Родительский статический блок   - Правильный ответ
    Статический блок 4
    Внутри main
    Родительский конструктор
    Конструктор


2.  Статический блок 4
    Внутри main
    Родительский статический блок
    Родительский конструктор
    Конструктор
 */