// Fernando Martell Final

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Final {
	public static void main(String[] args){
		new Final ();
	}
	public Final (){
		Scanner input = new Scanner(System.in);

        
        LinkedList<Plant> plantlist = new LinkedList<Plant>();
        
        int counter = 0;
        
        System.out.println("Welcome to my plant directory interface.");
        System.out.println("Please select a number from the options below");
        System.out.println("");
        
        while(true){
            // Give the user a list of their options
            System.out.println("1: Add a plant to the pack.");
            System.out.println("2: Remove a plant.");
            System.out.println("3: Display all the plants.");
            System.out.println("4: Search for a plant.");
            System.out.println("5: Only know part of the plant? Search by letters!");
            System.out.println("6: Save your plant linkedlist!");
            System.out.println("7: Load your plant linkedlist!");
            System.out.println("8: Analyze your plant linkedlist!");
            System.out.println("0: Exit the directory.");
            
            // Get the user input
            int userChoice = input.nextInt();
                
            switch(userChoice){
                case 1:
                    addFlower(plantlist, counter);
                    break;
                case 2:
                    removeFlower(plantlist);
                    break;
                case 3:
                    displayFlowers(plantlist);
                    break;
                case 4:
                	searchFlower(plantlist);
                	break;
                case 5:
                	filterFlower(plantlist);
                	break;
                case 6:
                	savePack(plantlist);
                	break;
                case 7:
                	loadPack(plantlist);
                	break;
                case 8:
                	analyzePack(plantlist);
                	break;
                case 0:
                    System.out.println("Thank you for using the plant pack!");
                    System.exit(0);
            }
        }
        
    }

	private void analyzePack(LinkedList<Plant> plantlist) {

		
		String analyze1 = "ar";
		String analyze2 = "ne";
		String analyze3 = "um";
		int lastIndex = 0;
		int count = 0;
		for(int i = 0; i < plantlist.size(); i++){
			
			while(lastIndex != -1){

			    lastIndex = plantlist.get(i).getName().indexOf(analyze1,lastIndex);

			    if(lastIndex != -1){
			        count ++;
			        lastIndex += analyze1.length();
			        System.out.println(analyze1 + " was found in " + plantlist.get(i).getName() + " " + count +
			        " times!");
			        
			    }
			    
			    if(count == 0){
		        	
		        	System.out.println(analyze1 + " was not found in " + plantlist.get(i).getName() + " !");
		        	
		        }
			}
			
		}
		
		 lastIndex = 0;
		 count = 0;
		
		for(int i = 0; i < plantlist.size(); i++){
			
			while(lastIndex != -1){

			    lastIndex = plantlist.get(i).getName().indexOf(analyze2,lastIndex);

			    if(lastIndex != -1){
			        count ++;
			        lastIndex += analyze2.length();
			        System.out.println(analyze2 + " was found in " + plantlist.get(i).getName() + " " + count +
			        " times!");
			        
			    }
			    
			    if(count == 0){
		        	
		        	System.out.println(analyze2 + " was not found in " + plantlist.get(i).getName() + " !");
		        	
		        }
			}
			
		}
		
		 lastIndex = 0;
		 count = 0;
		
		for(int i = 0; i < plantlist.size(); i++){
			
			while(lastIndex != -1){

			    lastIndex = plantlist.get(i).getName().indexOf(analyze3,lastIndex);

			    if(lastIndex != -1){
			        count ++;
			        lastIndex += analyze3.length();
			        System.out.println(analyze3 + " was found in " + plantlist.get(i).getName() + " " + count +
			        " times!");
			        
			    }
			    
			    if(count == 0){
		        	
		        	System.out.println(analyze3 + " was not found in " + plantlist.get(i).getName() + " !");
		        	
		        }
			}
			
		}
		
	
		}
		
		
	
	private void loadPack(LinkedList<Plant> plantlist) {
		// TODO Auto-generated method stub
		
try(FileInputStream fi = new FileInputStream("save.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			LinkedList <Plant> temp = (LinkedList<Plant>) os.readObject();
			
			plantlist.addAll(temp);
			
			/*
			for(int i = 0; i < temp.size(); i++){
				
				plantpack.add(temp.get(i));
				
			}
			*/
			//System.out.println(temp.get(0).getName());
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private void savePack(LinkedList<Plant> plantlist) {
		// TODO Auto-generated method stub
try(FileOutputStream fs = new FileOutputStream("save.bin")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(plantlist);
			
			os.close();
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void filterFlower(LinkedList<Plant> plantlist) {

    	System.out.println("Please enter a search query to find all flowers containing your search!");
	    Scanner input = new Scanner(System.in);
	    String PlantCheck = input.next();

	        int count = 0;

	        
	        for(int i = 0; i < plantlist.size(); i++){
	            
	            if(plantlist.get(i).getName().contains(PlantCheck)){
	                
	                System.out.println("A plant containing your term '" + PlantCheck +
	                "' was found at position " + i + " ! \n");
	                
	                count++;
	                
	            }
	            
	        }
	        
	        if(count == 0){
	            
	        	System.out.println("Your search term was not found!");
	            
	        }
	    
	    
	       }
		
	
	private void addFlower(LinkedList<Plant> plantlist, int counter) {
		int typecheck = 0;
		for (int i = 0; i < plantlist.size(); i++)
    	{
    	    if (plantlist.size() != 25)
    	    {
    	        counter++; 
    	    }
    	   
    	}
        if (counter == 25){
    		System.out.println("Sorry, the directory is full, please remove a plant.");
    		removeFlower(plantlist);
    	}
        else {
        System.out.println("If your plant is a Flower please enter 1");
        System.out.println("If your plant is a Fungus please enter 2");
        System.out.println("If your plant is a Weed please enter 3");
        Scanner input = new Scanner(System.in);
        typecheck = input.nextInt(); 
        if (typecheck == 1){
        		Flower tempflower = new Flower();
        		tempflower.setId(typecheck);
        		System.out.println("Please enter your Flower's name");
        		String Temp = input.next();
    	        tempflower.setName(Temp.toLowerCase());
    	        System.out.println("Please enter your flower's color");
    	        String Temp2 = input.next();
    	        tempflower.setColor(Temp2);
    	        System.out.println("Does your flower have thorns?");
    	        String Temp3 = input.next();
    	        tempflower.setThorns(Temp3);
    	        System.out.println("How does your flower smell?");
    	        String Temp4 = input.next();
    	        tempflower.setSmell(Temp4);
    	        plantlist.add(tempflower);
        	}
        if (typecheck ==2 ){
        	
        	Fungus tempflower = new Fungus();
    		tempflower.setId(typecheck);
    		System.out.println("Please enter your fungus' name");
    		String Temp = input.next();
	        tempflower.setName(Temp.toLowerCase());
	        System.out.println("Please enter your fungus' color");
	        String Temp2 = input.next();
	        tempflower.setColor(Temp2);
	        System.out.println("Is your fungus poisonous?");
	        String Temp3 = input.next();
	        tempflower.setPoisonous(Temp3);
	        plantlist.add(tempflower);

	        
        	}
        if (typecheck == 3 ){
        	
        	Weed tempflower = new Weed();
    		tempflower.setId(typecheck);
    		System.out.println("Please enter your weed's name");
    		String Temp = input.next();
	        tempflower.setName(Temp.toLowerCase());
	        System.out.println("Does your weed have medicanal properties?");
	        String Temp2 = input.next();
	        tempflower.setMedicinal(Temp2);
	        System.out.println("Is your weed edible?");
	        String Temp3 = input.next();
	        tempflower.setEdible(Temp3);
	        System.out.println("What is your weed's color?");
	        String Temp4 = input.next();
	        tempflower.setColor(Temp4);
	        System.out.println("Is your weed poisonous?");
	        String Temp5 = input.next();
	        tempflower.setPoisonous(Temp5);
	        plantlist.add(tempflower);

        	}
        }   
    }

    private void removeFlower(LinkedList<Plant> plantlist) 
    {
    	 System.out.println("Please enter a plant to remove: ");
         Scanner input = new Scanner(System.in);      
         String PlantCheck = input.next();
          
         
     	for (int i = 0; i < plantlist.size(); i++)
     	{
     		String test = plantlist.get(i).getName();
     	    if (test.equals(PlantCheck))
     	    {
     	        plantlist.remove(i);
     	        break;
     	    }
     	}
         
        
    }
    
    private void searchFlower(LinkedList<Plant> plantlist) 
    {
    	int found = -1;
    	System.out.println("Please enter a plant to look for!");
	    Scanner input = new Scanner(System.in);
	    String PlantCheck = input.next();
	    
	   for(int i = 0; i < plantlist.size(); i++)
	    { 
	    	String test = plantlist.get(i).getName();
	    	if (test.equals(PlantCheck))
	        {
	            System.out.println("Your plant was at position " + (i+1) + "!");
	             //The +1 is so if the number is in position 0, the user understands it's 
	           // the first number in the array and isn't confused by "Your flower was at position 0"
	            
	            found = 0;
	        }

	    }
	    if (found == -1)
	        { 
	            System.out.println("Your plant was not found.");
	        }
	  
	}
		

    	private void displayFlowers(LinkedList<Plant> plantlist) {
    		
    		LinkedList<String> compare = new LinkedList<String>();
    		for (int i = 0; i < plantlist.size(); i++){
    			
    				String temp1 = plantlist.get(i).getName();
    				temp1.toLowerCase();
    				compare.add(temp1);
    			
    			}
    		
    		LinkedList<String> test = new LinkedList<String>();
    		for (int i = 0; i < plantlist.size(); i++){
    			if (test.contains(plantlist.get(i).getName().toLowerCase())){
    				
    			}
    			else{
    				String temp = plantlist.get(i).getName();
    				temp.toLowerCase();
    				test.add(temp);
    			
    			}
    		}


    		for (int i = 0; i < test.size(); i++){
    			String temp = test.get(i);
    			int frequency = Collections.frequency(compare, temp);
    			System.out.println(temp + ": " + frequency);
    	}

    }
}	