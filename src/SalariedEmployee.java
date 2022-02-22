public class SalariedEmployee extends Employee {
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public void calculatePay() {
    averageMonthlySalary = fixedMonthlyPayment;
  }

  @Override
  public String toString() {
    return "SalariedEmployee{" +
        "employeeId='" + employeeId + '\'' +
        ", name='" + name + '\'' +
        ", averageMonthlySalary=" + averageMonthlySalary +
        ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
        ", fixedMonthlyPayment=" + String.format("%.2f", fixedMonthlyPayment) +
        '}';
  }
}
