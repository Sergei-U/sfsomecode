package main.java.amodule7.work753;

/*
В вашем распоряжении классный принтер — класс CoolPrinter,в который можно загрузить строки при помощи статического метода:

public static void add(String line)


Он добавляет в память принтера переданную строку line и печатает весь текст красиво при помощи статического метода:

static void print (Formatter formatter)


Который принимает объект класса, реализующего интерфейс Formatter:


interface Formatter{
	String format(String line);
}

Единственная функция которого принимает строку и как-то изменяет ее. Система печати работает так: принтер передает каждую строку форматтеру, вызывая у него метод print(),
там строка преобразуется и возвращается. Полученную от форматтера строку принтер выводит на печать.

Таким образом, передавая в функцию print() разные "форматтеры", можно печатать ТЕКСТ КАПСЛОКОМ, обрамлять <tag>тегами</tag> и даже, например, зашифровывать шифром Цезаря.
Проблема в том, что CoolPrinter очень расстраивается, когда ему передают объект неанонимного класса, и выводит на печать информацию об этом...
Напечатайте текст, передав в метод печати объект класса, реализующего Formatter, в которомего метод format() должен возвращать переданную ему строку в обрамлении двух звездочек
 в виде объекта анонимного класса.

То есть программа:


CoolPrinter.add("One, two,");
CoolPrinter.add("I love you.");
CoolPrinter.add("Three, four,");
CoolPrinter.add("Touch the floor.");
CoolPrinter.print(/*Здесь надо передать Formatter*);


        Должна вывести:

        ** One, two, **
        ** I love you. **
        ** Three, four, **
        ** Touch the floor. **


        Обратите внимание на пробелы после начальных звездочек и до конечных, они важны.
 */

public class Main {
    public static void main(String[] args) {
/*
You have to pass to print() method anonymous Formatter
which add to the beginning of the line two astericks ("** ... **")
*/


        CoolPrinter.add("Own, two,");
        CoolPrinter.add("I love you.");
        CoolPrinter.add("Three, four,");
        CoolPrinter.add("Touch the floor.");
        //CoolPrinter.print(/*pass anonymous Formatter here*/);
        //TODO

        CoolPrinter.print(new Formatter(){
            public String format(String s){
                return "** " + s + " **";
            }
        });


        //
/*
This fragment of code has to output

** Own, two, **
** I love you. **
** Three, four, **
** Touch the floor. **

Spaces are important.

*/
    }
}