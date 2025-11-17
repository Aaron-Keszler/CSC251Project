public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount;

   /**
   No-arg constructor that explicitly initializes all fields
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public Policy(String pNumber, String pName, PolicyHolder pHolder)
   {
      policyNumber = pNumber;
      providerName = pName;
      policyHolder = pHolder;

      policyCount++;
   }
   
   //getters//
   /**
   @return The Policy Number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   @return The Policy Provider's Name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   @return The Policy Holder
   */
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }
   
   /**
   @return The Policy Count
   */
   public static int getPolicyCount()
   {
      return policyCount;
   }
   
      
   //setters//
   
   /**
   @param pNumber The Policy Number
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
   @param pName The Policy Provider's name
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public void setPolicyHolder(PolicyHolder pHolder)
   {
      policyHolder = pHolder;
   }
   
  
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(policyHolder.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(policyHolder.getBMI() > BMI_THRESHOLD)
         price += ((policyHolder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }

   //Not included in the instructions but can be added...
   /*Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
   */
   
   // toString method
   
   public String toString()
   {
      return "Policy Number: " + policyNumber +
      "\nProvider Name: " + providerName +
      "\n" + policyHolder +
      String.format("\nPolicy Price: $%.2f", getPrice());
   }
}