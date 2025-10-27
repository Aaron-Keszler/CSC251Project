public class Policy {
   // initializes values
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
   
   /*
   arg constructor
   @param pNumber Policy number
   @param pName Providers name
   @param fName Policy holders first name
   @param lName Policy holders last name
   @param pAge Policy holders age
   @param smokeStatus Does the policy holder smoke?
   @param pHeight Policy holders height
   @param pWeight Policy holders weight 
   */
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
   
   
   /*
   Setters
   @param pNumber Sets policy number
   @param pName Sets providers name
   @param fName Sets policy holders first name
   @param lName Sets policy holders last name
   @param pAge Sets policy holders age
   @param smokeStatus Sets policy holders smoking status
   @param pHeight Sets policy holders height
   @param pWeight Sets policy holders weight 
   */
   public void setPolicyNumber(int pNumber) { policyNumber = pNumber; }
   public void setProviderName(String pName) { providerName = pName; }
   public void setFirstName(String fName) { firstName = fName; }
   public void setLastName(String lName) { lastName = lName; }
   public void setAge(int pAge) { age = pAge; }
   public void setSmokingStatus(String smokeStatus) { smokingStatus = smokeStatus; }
   public void setHeight(double pHeight) { height = pHeight; }
   public void setWeight(double pWeight) { weight = pWeight; }
   
   
     /*
   Getters
   @param pNumber Gets policy number
   @param pName Gets providers name
   @param fName Gets policy holders first name
   @param lName Gets policy holders last name
   @param pAge Gets policy holders age
   @param smokeStatus Gets policy holders smoking status
   @param pHeight Gets policy holders height
   @param pWeight Gets policy holders weight 
   */
   public int getPolicyNumber() { return policyNumber; }
   public String getProviderName() { return providerName; }
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public int getAge() { return age; }
   public String getSmokingStatus() { return smokingStatus; }
   public double getHeight() { return height; }
   public double getWeight() { return weight; }
   
   /* 
   calculates policy holder BMI
   @return Returns the policy holders calculated BMI
   */
   public double calculateBMI() {
      return (weight * 703) / (height * height);
   }
   
   /*
   calculates the price of the insurance policy
   @return Returns the policy price after calculation
   */
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