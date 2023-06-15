package HW8;

public class DeliveryCostCalculator implements DeliveryInterface {

        private float costPerKilometer;

        public DeliveryCostCalculator(float costPerKilometer) {
            this.costPerKilometer = costPerKilometer;
        }

        public float calculate(float distance) {
            float d =  distance * costPerKilometer;
            return d;

        }
       public float calculate2(float distance) {
        float v = (float) (distance * costPerKilometer* 2.1);
        return v;

    }

}

