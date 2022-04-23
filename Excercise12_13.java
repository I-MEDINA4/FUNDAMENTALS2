//Isaiah Medina
// 1337 COSC_II

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	public class Excercise12_13 {
	public static void main(String[] args) {

   String fileName="";
	     if(args.length>0)
{
	    //Read file name
	    fileName=args[0];
	 try {
		 Scanner fileReader=new Scanner(new File(fileName));
	  int wordCount=0;
	  int charCount=0;
	  int numLines=0;
	  while(fileReader.hasNext())
{
	    //Read a line
	   String line=fileReader.nextLine();
	    numLines++;
	    //Split words using space
	    String[] wordArray=line.split(" ");
	   for(String word:wordArray)
{
	         charCount+=word.length();
	       }
	     wordCount=wordCount+wordArray.length;
	                         }
	   //Displaying the output
	 System.out.println("Number of words: "+wordCount);
	 System.out.println("Number of characters: "+charCount);
	 System.out.println("Number  o f lines: "+numLines);
	                        } catch (FileNotFoundException e) {
	  System.out.println("File not found");
	                        }
	                }
 else
	  System.out.println("File not avalible! ");
	        }

	}

