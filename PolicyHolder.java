public class PolicyHolder 
{
   //fields
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   // getters
   
   /**
   @return The Policyholder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   // setters
   
   /**
   @param fName The Policy Provider's first name
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
   @param lName The Policy Provider's last name
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
   @param a The Policy Provider's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param sStatus The Policy Provider's smoking status
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
   @param h The Policy Provider's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   @param w The Policy Provider's weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   // toString method
   public String toString()
   {
      return "Policyholder's First Name: " + firstName + 
      "\nPolicyholder's Last Name: " + lastName +
      "\nPolicyholder's Age: " + age +
      "\nPolicyholder's Smoking Status: " + smokingStatus +
      "\nPolicyholder's Height: " + height + 
      "\nPolicyholder's Weight: " + weight +
      String.format("\nPolicyholder's BMI: %.2f", getBMI());
   }
}