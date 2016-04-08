package lab12;

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // TODO Auto-generated constructor stub
        this.commissionRate = commissionRate;
        totalSales = 0;
    }
    
    public void addSales (double totalSales) {
        this.totalSales += totalSales;
    }
    
    public double pay() {
        double payment = totalSales * commissionRate + super.pay();
        totalSales = 0;
        return payment;
    }
    
    public String toString() {
        String result = super.toString();
        result+= "\nTotal sales: " + totalSales;
        return result;
    }

}
