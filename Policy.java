public class Policy {
   // initialize values
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   // no-arg constructor
   public Policy() {
      policyNumber = 0;
      providerName = "NA";
      firstName = "NA";
      lastName = "NA";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }
   
   // arg constructor
   public Policy(int pNumber, String pName, String fName, String lName, int pAge, String smokeStatus, double pHeight, double pWeight) {
         policyNumber = pNumber;
         providerName = pName;
         firstName = fName;
         lastName = lName;
         age = pAge;
         smokingStatus = smokeStatus;
         height = pHeight;
         weight = pWeight;
   
   }
   
   
   // setters
   public void setPolicyNumber(int pNumber) { policyNumber = pNumber; }
   public void setProviderName(String pName) { providerName = pName; }
   public void setFirstName(String fName) { firstName = fName; }
   public void setLastName(String lName) { lastName = lName; }
   public void setAge(int pAge) { age = pAge; }
   public void setSmokingStatus(String smokeStatus) { smokingStatus = smokeStatus; }
   public void setHeight(double pHeight) { height = pHeight; }
   public void setWeight(double pWeight) { weight = pWeight; }
   
   
   // getters
   public int getPolicyNumber() { return policyNumber; }
   public String getProviderName() { return providerName; }
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public int getAge() { return age; }
   public String getSmokingStatus() { return smokingStatus; }
   public double getHeight() { return height; }
   public double getWeight() { return weight; }
   
   // calculates policy holder BMI
   public double calculateBMI() {
      return (weight * 703) / (height * height);
   }
   
   // calculates the price of the insurance policy
   public double calculatePolicyPrice() {
      double price = 600;
      
      // calculates extra fees
      if (age > 50) {
         price += 75.0;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         price += 100.0;
      }
      
      double BMI = calculateBMI();
      if (BMI > 35) {
         price += (BMI - 35) * 20;
      }
      
      return price;
   }
}