package HW8;

public class DeliveryView {

        private DeliveryInterface delivery;

        public DeliveryView(DeliveryInterface delivery) {
            this.delivery = delivery;
        }

        public void display(float distance) {
            float cost = delivery.calculate(distance);
            float cost2 = delivery.calculate2(distance);
            // Отображаем стоимость доставки на экране
            System.out.println("Обычная доставка "+cost);
            System.out.println("Доставка по морю "+cost2);
        }
    }


