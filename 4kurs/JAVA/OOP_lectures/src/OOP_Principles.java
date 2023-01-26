public class OOP_Principles {
    abstract class Aninmal {
        private String type;
        Aninmal(String type) {this.type = type;}
        abstract void speak();

        public String getType() {return type;}
        public void setType(String type) {this.type = type;}
    }
    class Wolf extends Aninmal{
        private String region, color;
        Wolf(String type, String region, String color) {
            super(type);
            this.region = region;
            this.color = color;
        }
        @Override
        void speak() {
            System.out.println("Wolf speak");
        }

        public String getRegion() { return region;}

        public void setRegion(String region) {this.region = region;}

        public String getColor() {return color;}

        public void setColor(String color) {this.color = color;}
    }
}
