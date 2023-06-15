package HW8;
/*
Взять реализованный код в рамках семинара 4 и 5 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.

Задача про калькулятор с использованием принципов SOLID.
Принцип единственной ответственности (Single Responsibility Principle) гласит, что каждый класс должен иметь только одну ответственность.
В нашем случае, это означает, что класс должен отвечать только за одну операцию - расчет стоимости доставки.
Принцип открытости/закрытости (Open/Closed Principle) гласит, что классы должны быть открыты для расширения, но закрыты для модификации.
Это означает, что мы должны иметь возможность добавлять новые способы доставки, не изменяя уже существующий код.
Принцип подстановки Барбары Лисков (Liskov Substitution Principle) гласит, что объекты в программе должны быть заменяемыми на экземпляры
их подтипов без изменения корректности выполнения программы. В нашем случае, это означает, что любой класс,
реализующий интерфейс DeliveryInterface, должен быть в состоянии заменить другой класс, реализующий тот же интерфейс.
Принцип разделения интерфейса (Interface Segregation Principle) гласит, что клиенты не должны зависеть от методов, которые они не используют.
В нашем случае, это означает, что интерфейс DeliveryInterface должен содержать только те методы, которые используются
в классе DeliveryCostCalculator.
Принцип инверсии зависимостей (Dependency Inversion Principle) гласит, что модули верхнего уровня не должны зависеть от модулей
нижнего уровня. Оба типа модулей должны зависеть от абстракций. В нашем случае, это означает, что класс DeliveryCostCalculator
должен зависеть от абстракции DeliveryInterface, а не от конкретной реализации этого интерфейса.
Единый класс View.java не соблюдает принцип единственной ответственности (Single Responsibility Principle),
так как он отвечает как за отображение данных, так и за расчет стоимости доставки.
Для решения этой проблемы можно создать два новых класса: DeliveryCostCalculator.java и DeliveryView.java,
а также интерфейс DeliveryInterface.java.
 */
public class Main {
    public static void main(String[] args) {
        float costPerKilometer; // Задаем стоимость доставки за километр
        costPerKilometer = 10.5F;
        DeliveryInterface delivery =  new DeliveryCostCalculator(costPerKilometer); // Создаем экземпляр класса DeliveryCostCalculator
        DeliveryView view = new DeliveryView(delivery); // Создаем экземпляр класса DeliveryView, передавая ему объект delivery
        float distance; // Задаем расстояние для расчета стоимости доставки
        distance = 25.0F;
        view.display(distance); // Отображаем стоимость доставки на экране
    }
}