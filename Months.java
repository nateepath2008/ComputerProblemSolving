void main() {
    IO.print(" Enter initial saving ");
    double InitialSaving = Double.parseDouble(IO.readln());

    IO.print(" Enter monthly saving ");
    double MonthlySaving = Double.parseDouble(IO.readln());

    IO.print(" Enter number of months ");
    double months = Double.parseDouble(IO.readln());

    IO.print(" Enter interest percent ");
    double percent = Double.parseDouble(IO.readln());

    double TotalSaving = InitialSaving + MonthlySaving * months;
    double Interest = TotalSaving * percent / 100;
    double FinalSaving = TotalSaving + Interest;

    IO.println(" Total saving before interest = %.2f ".formatted(TotalSaving) + " Baht ");
    IO.println(" Interest = %.2f " .formatted(Interest) + " Baht ");
    IO.println(" Final saving = %.2f " .formatted(FinalSaving) + " Baht ");
}