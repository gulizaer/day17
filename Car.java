public class Car {
   public String make, model, color;
   public int year;
   public double price;


    public void setInfo(String make, String model, String color, int year, double price) {
        this.make = make;
        this.color=color;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement,
			it should display all the information of the car object
			start()
 */