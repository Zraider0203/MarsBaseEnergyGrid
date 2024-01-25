// Create the main class for the Mars Base Energy Grid for this assignmnt
public class MarsBaseEnergyGrid{
    // Create the starting point of the program which will always be the main method
    public static void main(string[] args){
        // Display a title to our user
        System.out.println("\n\n*** Welcome to the Mars Base Energy Grid ***\n\n");

        // Create our first array and then intialize it with values
        // Create our solar panal array in MegaWatts (MW)
        int[] solarPanels = {30, 45, 25, 35, 50};
        
        // Create our second array and then intialize it with values
        // Create our wind turbine array in MegaWatts (MW)
        int[] windTurbine = {20, 30, 25, 40, 35};

        // Create a variable to storey out total energy output we get from our solar panels
        int totalSolarEnergy = 0;

        // Create a loop to iterate through our solar panels to clculate the total energy output of our solar panels
        // This solarPanels.length; calculates the length of our array
        for(int i = 0; i < solarPanels.length; i++){
            // Add the current solar panel element to our total solar energy
            totalSolarEnergy = totalSolarEnergy + solarPanel[i];
            // Display the current solar panel element and calculation to our user
            
        }

        // Create a variable to store our total energy output we get from all of our wind turbines 
        // We are initializing this variable to 0 because we have not calculated the total energy output yet
        int totalWindEnergy = 0

        // Create a loop to iterate through our wind turbines to calculate the total energy output of all our wind turbines
        // 
        // 
        for(int i = 0; i < windTurbine.length; i++){
             // Add the3 current wind turbine element from our array to our total wind energy variable
             totalWindEnergy = totalWindEnergy + windTurbine[i];
        }

        // Create a variable to store our total energy output for our entire energy grid
        // We are intializing this variable to 0 because we have not calculates the total energy output yet
        int totalEnergyFromAllSources = 0;
        // Calculate our total energy output from all of our sources
        totalEnergyFromAllSources = totalSolarEnergy + totalWindEnergy;

        // Report the energy output for our user

        System.out.println("\n\nThe energy report for our Mars Base Alpha Energy Grid is as follows:\n\n");
        // Display the total energy output for our solar panels
        System.out.println("The total energy output for all our solar panels is:" + totalSolarEnergy + "MW\n");
        // Display the total energy output of our wind turbines
        System.out.prinln("The total energy output for all our wind turbines is:" + totalWindEnergy + "MW\n");
        // Display the toital energy ourput for our entire energy grid from all sources
        System.out.println("The total energy output of our energy grid from all collectionsources is:" + totalEnergyFromAllSources + "MW\n")
        

        // Display end of report
        System.out.println("\n\n>>> End of Energy Report for our Mars Base Alpha Energy Grid\n\n");
         // Say goodbye to our user
        System.out.println("\n\n*** Thank you for using the Mars Base Energy Grid *** \n\n");
    }
}