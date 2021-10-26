import java.util.*;
public class lab1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice =0;
        int count=0;
        int charCount=0;
        int index = 0;
        int vowelCount=0;
        String[] array=new String[10];

        while(choice !=9){
            System.out.println("===============================================================");
        System.out.println(" choose an option");
        System.out.println("1. Enter a full sentence");
        System.out.println("2. Print out all sentences entered so far in the given order");
        System.out.println("3. Print out all sentences entered thus far in the reverse order");
        System.out.println("4. Print out the number of sentences that have been entered so far");
        System.out.println("5. Print out the number of characters in all sentences combined");
        System.out.println("6. Calculate the total number of vowels contained in all stored sentences.");
        System.out.println("7. Perform search for a given word using case sensitive comparisons");
        System.out.println("8. Perform search for a given word using case insensitive comparisons.");
        System.out.println("9. End program");


            choice = sc.nextInt();

            switch (choice){
                case 1:

                    System.out.println("Enter a full sentence: ");
                    Scanner first = new Scanner(System.in);
                    String str = first.nextLine();
                        array[index] = str;
                        index++;
                        count++;



                    for(int i = 0; i < str.length(); i++) {
                        if(str.charAt(i) != '\0')
                            charCount++;
                    }

                    for (int i = 0; i < str.length(); i++)
                    {
                        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                                || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                        {
                            vowelCount++;
                        }
                    }
                    if(index==11){
                        System.out.println("Exceeding max capacity!!");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("You have entered the following sentences so far: ");
                    for(index=0;index<count;index++){
                        System.out.println(array[index]);
                    }
                    break;
                case 3:
                    System.out.println("All sentences in reverse order: ");
                    for(index=count-1;index>=0;index--){
                        System.out.println(array[index]);
                    }
                    break;
                case 4:
                    System.out.println("The number of sentences entered so far= "+count);
                    break;

                case 5:
                    System.out.println("The number of characters in all sentences combined: "+charCount);
                    break;

                case 6:
                    System.out.println("The total number of vowels contained in all stored sentences: "+vowelCount);
                    break;

                case 7:
                    int x=0;
                    System.out.println("Enter the word you want to find: ");
                    Scanner case7= new Scanner(System.in);
                    String match=case7.nextLine();
                    for(index=0;index<count;index++){
                        if(array[index].contains(match)){
                            System.out.println("Match found for "+match+" in sentence "+index+": "+array[index]);
                            x++;
                        }
                    }
                    if(x==0){
                        System.out.println("Match not found!!");
                    }
                break;

                case 8:
                    int y=0;
                    System.out.println("Enter the word you want to find: ");
                    Scanner case8= new Scanner(System.in);
                    String match2=case8.nextLine();
                    for(index=0;index<count;index++){
                        if((array[index].toLowerCase()).contains(match2.toLowerCase())){
                            System.out.println("Match found for "+match2+" in sentence "+index+": "+array[index]);
                            y++;
                        }
                    }
                    if(y==0){
                        System.out.println("Match not found!!");
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID INPUT!!! Enter one of the options from the Menu.");
                    break;
            }
        }

    }
}
