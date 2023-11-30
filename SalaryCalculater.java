public class SalaryCalculater {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate,int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate*weeklyHours*52;

    }
    public double stateTaxRate(){
       return salary() *stateTaxRate;
    }
    public double getFederalTaxRate(){
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary() - stateTaxRate() - federalTaxRate;
    }

    public String toString() {
        return "SalaryCalculater{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salaryAfterTax="+ salaryAfterTax();

    }
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */