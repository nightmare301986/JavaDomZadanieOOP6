package HW8v2;

public class Saver implements Savable<User> {
    @Override
    public void save(User user) {
        System.out.println("Сохранение пользователя: " + user.name());
    }
}
