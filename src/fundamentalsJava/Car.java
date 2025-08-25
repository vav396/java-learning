package fundamentalsJava;

public class Car {
    private String model;
    private int year;
    private String color;
    boolean isRunning;

    public Car(String model, int year, String color, boolean isRunning) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = isRunning;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null || !model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Модель не может быть пустой");
        }
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null || !color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Цвет не может быть пустым");
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    void startEngine(){
        if (isRunning){
            System.out.println("Машина уже заведена");
        }else {
            isRunning = true;
            System.out.println("Машина заведена");
        }
    }

    void stopEngine(){
        if (isRunning){
            isRunning = false;
            System.out.println("Машина остановлена");
        }else {
            System.out.println("Машина уже остановлена");
        }
    }

    void displayInfo(){
        if (isRunning){
            System.out.println("Модель: " + model + "\nГод выпуска: " + year + "\nЦвет: " + color + "\nСостояние: заведена");
        }else {
            System.out.println("Модель: " + model + "\nГод выпуска: " + year + "\nЦвет: " + color + "\nСостояние: остановлена");
        }
    }

}
