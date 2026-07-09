void main() {
    IO.print("Distance (km): ");
    double distance = Double.parseDouble(IO.readln());
    IO.print("Fuel efficiency: ");
    double fuelEfficiency = Double.parseDouble(IO.readln());
    IO.print("Fuel price per liter: ");
    double fuelPricePerLiter = Double.parseDouble(IO.readln());
    double fuelUsed = distance / fuelEfficiency;
    double totalCost = fuelUsed * fuelPricePerLiter;
    IO.println("Fuel used = %.2f,Total cost = %.2f".formatted(fuelUsed, totalCost));
}