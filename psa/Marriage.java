
package psa;

import java.util.Scanner;

public class Marriage extends Cenomar {
     private String wifeFirstName, wifeMiddleName, wifeLastName;
    private char wifeSex;
    private int wifeAge;
    private String wifeDateOfBirth;
    private String wifePlaceOfBirth;
    private String wifeCitizenship;
    private String wifeResProvince;
    private String wifeResCityMuni;
    private String wifeResBarangay;
    private String wifeResHouseNumStreet;
    private String wifeReligion;
    private String wifeCivilStatus;
    private String wifeFathersName;
    private String wifeFathersCitizenship;
    private String wifeMothersName;
    private String wifeMothersCitizenship;
    
    
    private String husbandFirstName, husbandMiddleName, husbandLastName;
    private char husbandSex;
    private int husbandAge;
    private String husbandPlaceOfBirth;
    private String husbandDateOfBirth;
    private String husbandCitizenship;
    private String husbandResProvince;
    private String husbandResCityMuni;
    private String husbandResBarangay;
    private String husbandResHouseNumStreet;
    private String husbandReligion;
    private String husbandCivilStatus;
    private String husbandFathersName;
    private String husbandFathersCitizenship;
    private String husbandMothersName;
    private String husbandMothersCitizenship;
    
    private String placeOfMarriage;
    private String dateOfMarriage;

    

    public void displayInformation() {
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Wife's Information] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1a. First Name: " + wifeFirstName);
        System.out.println("1b. Middle Name: " + wifeMiddleName);
        System.out.println("1c. Last Name: " + wifeLastName);
        System.out.println("2. Date of Birth: " + wifeDateOfBirth);
        System.out.println("3. Age: " + wifeAge);
        System.out.println("4. Place of Birth(City, Province): " + wifePlaceOfBirth);
        System.out.println("5. Sex(f/m): " + wifeSex);
        System.out.println("6. Citizenship: " + wifeCitizenship);
        System.out.println("7a. Residence(Province): " + wifeResProvince);
        System.out.println("7b. Residence(City/Municipality): " + wifeResCityMuni);
        System.out.println("7c. Residence(Barangay): " + wifeResBarangay);
        System.out.println("7d. Residence(House Number/Street): " + wifeResHouseNumStreet);
        System.out.println("8. Religion: " + wifeReligion);
        System.out.println("9. Civil Status: " + wifeCivilStatus);
        System.out.println("10. Fathers Full Name: " + wifeFathersName);
        System.out.println("11. Citizenship of Father: " + wifeFathersCitizenship);
        System.out.println("12. Mothers Full Name: " + wifeMothersName);
        System.out.println("13. Citizenship of Mother: " + wifeMothersCitizenship);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Husband's Information] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("14a. Enter your First Name: " + husbandFirstName);
        System.out.println("14b. Enter your Middle Name: " + husbandMiddleName);
        System.out.println("14c. Enter your Last Name: " + husbandLastName);
        System.out.println("15. Enter your Date of Birth: " + husbandDateOfBirth);
        System.out.println("16. Enter your Age: " + husbandAge);
        System.out.println("17. Enter your Place of Birth(City, Province): " + husbandPlaceOfBirth);
        System.out.println("18. Enter your Sex(f/m): " + husbandSex);
        System.out.println("19. Enter your Citizenship: " + husbandCitizenship);
        System.out.println("20a. Enter your Residence(Province): " + husbandResProvince);
        System.out.println("20b. Enter your Residence(City/Municipality): " + husbandResCityMuni);
        System.out.println("20c. Enter your Residence(Barangay): " + husbandResBarangay);
        System.out.println("20d. Enter your Residence(House Number/Street): " + husbandResHouseNumStreet);
        System.out.println("21. Enter your Religion: " + husbandReligion);
        System.out.println("22. Enter your Civil Status: " + husbandCivilStatus);
        System.out.println("23. Enter your Full name of Father: " + husbandFathersName);
        System.out.println("24. Enter your Citizenship of Father: " + husbandFathersCitizenship);
        System.out.println("25. Enter your Full name of Mother: " + husbandMothersName);
        System.out.println("26. Enter your Citizenship of Mother: " + husbandMothersCitizenship);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("");
         System.out.println("27. Enter your Place of Marriage: " + placeOfMarriage);
         System.out.println("28. Enter your Date of Marriage: " + dateOfMarriage);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
   public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
            case "1a":
                System.out.print("1a. Enter your First Name: ");
                this.wifeFirstName = scanner.nextLine();
                break;
            case "1b":
                System.out.print("1b. Enter your Middle Name: ");
                this.wifeMiddleName = scanner.nextLine();
                break;
            case "1c":
                System.out.print("1c. Enter your Last Name: ");
                this.wifeLastName = scanner.nextLine();
                break;
            case "2":
                System.out.println("15. Enter your Date of Birth: ");
                this.wifeDateOfBirth = scanner.nextLine();
                break;
            case "3":
                System.out.print("3. Enter your Age: ");
                this.wifeAge = scanner.nextInt();
                scanner.nextLine();
                break;
            case "4":
                System.out.print("4a. Enter Place of Birth (City, Province): ");
                this.wifePlaceOfBirth = scanner.nextLine();
                break;
            case "5":
                System.out.print("5. Enter your Sex(f/m): ");
                this.wifeSex = scanner.nextLine().charAt(0);
                break;
            case "6":
                System.out.print("6. Enter your Citizenship: ");
                this.wifeCitizenship = scanner.nextLine();
                break;
            case "7a":
                System.out.println("7a. Enter your Residence(Province): ");
                this.wifeResProvince = scanner.nextLine();
                break;
            case "7b":
                System.out.println("7b. Enter your Residence(City/Municipality): ");
                this.wifeResCityMuni = scanner.nextLine();
                break;
            case "7c":
                System.out.println("7c. Enter your Residence(Barangay): ");
                this.wifeResBarangay = scanner.nextLine();
                break;
            case "7d":
                System.out.print("7d. Enter your Residence(House Number/Street): ");
                this.wifeResHouseNumStreet = scanner.nextLine();
                break;
            case "8":
                System.out.print("8. Enter your Religion: ");
                this.wifeReligion = scanner.nextLine();
                break;
            case "9":
                System.out.print("9. Enter your Civil Status: ");
                this.wifeCivilStatus = scanner.nextLine();
                break;
            case "10":
                System.out.print("10. Full Name of your Father: ");
                this.wifeFathersName = scanner.nextLine();
                break;
            case "11":
                System.out.print("11. Citizenship of your Father:  ");
                this.wifeFathersCitizenship = scanner.nextLine();
                break;
            case "12":
                System.out.print("12. Full Name of your Mother: ");
                this.wifeMothersName = scanner.nextLine();
                break;
            case "13":
                System.out.print("13. Citizenship of your Mother: ");
                this.wifeMothersCitizenship = scanner.nextLine();
                break;
                
            case "14a":
                System.out.print("14a. Enter your First Name: ");
                this.husbandFirstName = scanner.nextLine();
                break;
            case "14b":
                System.out.print("14b. Enter your Middle Name: ");
                this.husbandMiddleName = scanner.nextLine();
                break;
            case "14c":
                System.out.print("14c. Enter your Last Name: ");
                this.husbandLastName = scanner.nextLine();
                break;
            case "15":
                System.out.println("15. Enter your Date of Birth: ");
                this.husbandDateOfBirth = scanner.nextLine();
                break;
            case "16":
                System.out.print("16. Enter your Age: ");
                this.husbandAge = scanner.nextInt();
                scanner.nextLine();
                break;
            case "17":
                System.out.print("17. Enter Place of Birth (City, Province): ");
                this.husbandPlaceOfBirth = scanner.nextLine();
                break;
            case "18":
                System.out.print("18. Enter your Sex(f/m): ");
                this.husbandSex = scanner.nextLine().charAt(0);
                break;
            case "19":
                System.out.print("19. Enter your Citizenship: ");
                this.husbandCitizenship = scanner.nextLine();
                break;
            case "20a":
                System.out.println("20a. Enter your Residence(Province): ");
                this.husbandResProvince = scanner.nextLine();
                break;
            case "20b":
                System.out.println("20b. Enter your Residence(City/Municipality): ");
                this.husbandResCityMuni = scanner.nextLine();
                break;
            case "20c":
                System.out.println("20c. Enter your Residence(Barangay): ");
                this.husbandResBarangay = scanner.nextLine();
                break;
            case "20d":
                System.out.print("20d. Enter your Residence(House Number/Street): ");
                this.husbandResHouseNumStreet = scanner.nextLine();
                break;
            case "21":
                System.out.print("21. Enter your Religion: ");
                this.husbandReligion = scanner.nextLine();
                break;
            case "22":
                System.out.print("22. Enter your Civil Status: ");
                this.husbandCivilStatus = scanner.nextLine();
                break;
            case "23":
                System.out.print("23. Full Name of your Father: ");
                this.husbandFathersName = scanner.nextLine();
                break;
            case "24":
                System.out.print("24. Citizenship of your Father:  ");
                this.husbandFathersCitizenship = scanner.nextLine();
                break;
            case "25":
                System.out.print("25. Full Name of your Mother: ");
                this.husbandMothersName = scanner.nextLine();
                break;
            case "26":
                System.out.print("26. Citizenship of your Mother: ");
                this.husbandMothersCitizenship = scanner.nextLine();
                break;
            case "27":
                System.out.println("27. Enter your Place of Marriage");
                this.placeOfMarriage = scanner.nextLine();
                break;
            case "28":
                System.out.println("27. Enter your Date of Marriage");
                this.dateOfMarriage = scanner.nextLine();
                break;

            default:
                System.out.println("Invalid choice. No edits were made.");
        
        }
    }
 public void wifeInformation(Scanner scanner) {
        

                System.out.print("1a. Enter your First Name: ");
                this.wifeFirstName = scanner.nextLine();
                System.out.print("1b. Enter your Middle Name: ");
                this.wifeMiddleName = scanner.nextLine();
                System.out.print("1c. Enter your Last Name: ");
                this.wifeLastName = scanner.nextLine();

                System.out.print("15. Enter your Date of Birth: ");
                this.wifeDateOfBirth = scanner.nextLine();

                System.out.print("3. Enter your Age: ");
                this.wifeAge = scanner.nextInt();

                System.out.print("4a. Enter Place of Birth (City, Province): ");
                this.wifePlaceOfBirth = scanner.nextLine();
                 System.out.println("");
                 scanner.nextLine();
     
                System.out.print("5. Enter your Sex(f/m): ");
                this.wifeSex = scanner.nextLine().charAt(0);

                System.out.print("6. Enter your Citizenship: ");
                this.wifeCitizenship = scanner.nextLine();

                System.out.print("7a. Enter your Residence(Province): ");
                this.wifeResProvince = scanner.nextLine();
                System.out.print("7b. Enter your Residence(City/Municipality): ");
                this.wifeResCityMuni = scanner.nextLine();
                System.out.print("7c. Enter your Residence(Barangay): ");
                this.wifeResBarangay = scanner.nextLine();
                System.out.print("7d. Enter your Residence(House Number/Street): ");
                this.wifeResHouseNumStreet = scanner.nextLine();

                System.out.print("8. Enter your Religion: ");
                this.wifeReligion = scanner.nextLine();

                System.out.print("9. Enter your Civil Status: ");
                this.wifeCivilStatus = scanner.nextLine();

                System.out.print("10. Full Name of your Father: ");
                this.wifeFathersName = scanner.nextLine();

                System.out.print("11. Citizenship of your Father:  ");
                this.wifeFathersCitizenship = scanner.nextLine();

                System.out.print("12. Full Name of your Mother: ");
                this.wifeMothersName = scanner.nextLine();

                System.out.print("13. Citizenship of your Mother: ");
                this.wifeMothersCitizenship = scanner.nextLine();

    
}
    public void husbandInformation(Scanner scanner) {
                System.out.print("14a. Enter your First Name: ");
                this.wifeFirstName = scanner.nextLine().toUpperCase();
                System.out.print("14b. Enter your Middle Name: ");
                this.wifeMiddleName = scanner.nextLine().toUpperCase();
                System.out.print("14c. Enter your Last Name: ");
                this.wifeLastName = scanner.nextLine().toUpperCase();

                System.out.println("15. Enter your Date of Birth: ");
                this.wifeDateOfBirth = scanner.nextLine().toUpperCase();

                System.out.print("16. Enter your Age: ");
                this.wifeAge = scanner.nextInt();

                System.out.print("17. Enter Place of Birth (City, Province): ");
                this.wifePlaceOfBirth = scanner.nextLine().toUpperCase();

                System.out.print("18. Enter your Sex(f/m): ");
                this.wifeSex = scanner.nextLine().charAt(0);
                 System.out.println("");
                 scanner.nextLine();
                 
                System.out.print("19. Enter your Citizenship: ");
                this.wifeCitizenship = scanner.nextLine().toUpperCase();

                System.out.println("20a. Enter your Residence(Province): ");
                this.wifeResProvince = scanner.nextLine().toUpperCase();
                System.out.println("20b. Enter your Residence(City/Municipality): ");
                this.wifeResCityMuni = scanner.nextLine().toUpperCase();
                System.out.println("20c. Enter your Residence(Barangay): ");
                this.wifeResBarangay = scanner.nextLine().toUpperCase();
                System.out.print("20d. Enter your Residence(House Number/Street): ");
                this.wifeResHouseNumStreet = scanner.nextLine().toUpperCase();

                System.out.print("21. Enter your Religion: ");
                this.wifeReligion = scanner.nextLine().toUpperCase();

                System.out.print("22. Enter your Civil Status: ");
                this.wifeCivilStatus = scanner.nextLine().toUpperCase();

                System.out.print("23. Full Name of your Father: ");
                this.wifeFathersName = scanner.nextLine().toUpperCase();

                System.out.print("24. Citizenship of your Father:  ");
                this.wifeFathersCitizenship = scanner.nextLine().toUpperCase();

                System.out.print("25. Full Name of your Mother: ");
                this.wifeMothersName = scanner.nextLine().toUpperCase();

                System.out.print("26. Citizenship of your Mother: ");
                this.wifeMothersCitizenship = scanner.nextLine().toUpperCase();          
    
    }

   
    public void placeDateInformation(Scanner scanner) {
                System.out.println("27. Enter your Place of Marriage");
                this.placeOfMarriage = scanner.nextLine().toUpperCase();

                System.out.println("28. Enter your Date of Marriage");
                this.dateOfMarriage = scanner.nextLine().toUpperCase();
    }
public void MarriageCombinedInformation(){
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("                              ===================================================================================================================================================================================                                       ");
         System.out.println("                                                                                                    Republic Of The Philippines                                                                                                                                   ");
         System.out.println("                                                                                               OFFICE OF THE CIVIL REGISTRAR GENERAL                                                                                                                              ");
         System.out.println("                                                                                                   CERTIFICATE OF LIVE BIRTH");
         System.out.println("");
         System.out.println("                              ===================================================================================================================================================================================                                       ");
         System.out.println("                                                                   |                         Wife's Information                            |               Husband's Information                                                       ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Name of Contracting Parties | " + wifeFirstName + " " + wifeMiddleName + " " + wifeLastName + "     | " + husbandFirstName + " " + husbandMiddleName + " " + husbandLastName);
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Date of Birth/Age           | " + wifeDateOfBirth + " " + wifeAge + "                               | " + husbandDateOfBirth + " " + husbandAge + "                                    ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Place of Birth              | " + wifePlaceOfBirth + "                                              | " + husbandPlaceOfBirth + "                                                                " );
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Sex (Male/Female)           | " + wifeSex + "                                                       | " + husbandSex + "                                                                             ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Citizenship                 | " + wifeCitizenship + "                                               | " + husbandCitizenship + "                                                         ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Residence                   | " + wifeResProvince + " " + wifeResCityMuni + "                       | " + husbandResProvince + " " + husbandResCityMuni + "                                       ");
         System.out.println("                                                              | " + wifeResBarangay + " " + wifeResHouseNumStreet + "                 | " + husbandResBarangay + " " + husbandResHouseNumStreet +"                               ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Religion                    | " + wifeReligion + "                                                  | " + husbandReligion + "                                                                ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Civil Status                | " + wifeCivilStatus + "                                               | " + husbandCivilStatus + "                                                                        ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Name of Father              | " + wifeFathersName + "                                               | " + husbandFathersName + "                                                          ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Citizenship                 | " + wifeFathersCitizenship + "                                        | " + husbandFathersCitizenship +  "                                                     ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Name of Mother              | " + wifeMothersName + "                                               | " + husbandMothersName + "                                                              ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("                                  Citizenship                 | " + wifeMothersCitizenship + "                                        | " + husbandMothersCitizenship + "                                                         ");
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         System.out.println("");
         System.out.println("                                  Place of Marriage: " + placeOfMarriage );
         System.out.println("                                  Date of Marriage: " + dateOfMarriage);
         System.out.println("");
         System.out.println("                                                          This is to certify that I " +wifeFirstName +" "+ wifeMiddleName+" "+ wifeLastName + " and I ");
         System.out.println("                                                          " + husbandFirstName + " " + husbandMiddleName + " " + husbandLastName + ", both of legal age,");    
         System.out.println("                                                        of our own free will and Accord, and in the presence of the person solemnizing this marriage ");
         System.out.println("                                                        and of the witnesses named below, take each other as husband and wife.");
         System.out.println("                              ===================================================================================================================================================================================                                       ");

    }
    
}


