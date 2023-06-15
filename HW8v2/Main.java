package HW8v2;

/*
По Желанию *.
 (Model) Создайте класс User для представления учетной записи пользователя.
 Представление (View)
 Презентер (Presenter)
Создано:
Класс Report в котором прописан метод report() принимающий в качестве параметра некий экзмепляр типа User.
Интерфейс Savable с методом save().
Создан класс Saver и имплементирован ему интерфейс Savable.
Класс User с информацией, которая имеет отношение к данному классу.
В реализации данной задачи использован паттерн MVC.
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Saver());
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.run();
    }
}
