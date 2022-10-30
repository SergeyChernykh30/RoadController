package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }

    public String getNumber()
    {
        return number;
    }

    public String setNumber(String setNumber)
    {
        return this.number = setNumber;
    }


    public int getHeight()
    {
        return height;
    }

    public int setHeight(int setHeight)
    {
        return this.height  = setHeight;
    }


    public double getWeight()
    {
        return weight;
    }

    public double setWeight(double setWeight)
    {
        return this.weight = setWeight;
    }


    public boolean getHasVehicle()
    {
        return hasVehicle;
    }

    public boolean setVehicle(boolean setVehicle)
    {
        return this.hasVehicle = setVehicle;
    }


    public boolean getIsSpecial()
    {
        return isSpecial;
    }

    public boolean setSpecial(boolean setSpecial)
    {
        return this.isSpecial = setSpecial;
    }
}