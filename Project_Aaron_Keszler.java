import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Project_Aaron_Keszler {
   public static void main(String[] args) {
      ArrayList<Policy> policyArray = new ArrayList<>();
      
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);

      while (inputFile.hasNext()) {
         String line = inputFile.nextLine();
         if (line.equals("")) {
            continue;
         }
         
         int policyNumber = inputFile.nextInt();
         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = inputFile.nextInt();
         String smokingStatus = inputFile.nextLine();
         double height = inputFile.nextDouble();
         double weight = inputFile.nextDouble();
         
         Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         policyArray.add(policy);
      }
      inputFile.close();
      
      
//       outputs policy information
//       System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
//       System.out.println("Provider Name: " + policy.getProviderName());
//       System.out.println("Policyholder's First Name: " + policy.getFirstName());
//       System.out.println("Policyholder's Last Name: " + policy.getLastName());
//       System.out.println("Policyholder's Age: " + policy.getAge());
//       System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
//       System.out.printf("Policyholder's Height: %.1f inches \n", policy.getHeight());
//       System.out.printf("Policyholder's Weight: %.1f pounds \n", policy.getWeight());
//       System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
//       System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());

   }
}