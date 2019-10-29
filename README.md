# project2
For this Project I had to create a program that would take in a four letter string that repersented a station id, then it would find the stations position in a list of all the stations and return it. The Program would also find the average Ascii value of the four letter staion id and then it would get the letter that had the same Ascii value. Then the program would list out the staions that started with the average letter. The First thing I did to complete this project was create the PosAvg class, to do this I created a read method that would read the txt file into an ArrayList, then I created a method that would loop through the array to find the position of a give station id, and lastly I createed a method that would find two stations whose postions averaged to the postion of the given station. The next Thing I did was create the MesoInherit class which inherited from the MesoAbstract class, the MesoInherit class inherited two methods calAverage and letterAvgerage, calAverage would return a int array that had the ceiling, floor, and rounded average Ascii value of the station id. To get value I convert each char in the station id into an int and then got the average in a double. The other method that MesoInherit inherited from MesoAbstract was the letterAverage methos which would that the Ascii average and find the letter that in repersented, to do this I converted the average from an int into a char. The Last thing I had to do for this project was create the LetterAvg class and to do this I had to create a mehtod that would find the number of station that started with the average letter by looping through the array of stations, then I created a method that would get them names of the stations that started with the average letter and put them in an arraylist to be printed out in a toString method.

PosAvg Class
public void read()   
  This method would use a BufferedReader to read in the file Mesonet.txt and would store the station Id for every staion in a String array called stations.
  
public int indexOfStations() 
  This method would loop through the stations array to find the position of a given station id and return int in an int.
public String[] indexAvgOfStations()

  This method takes the index of the station and finds two stations whose postion average to the index of the given station.
  
MesoInherit Class : extends MesoAbstract Class

public int[] calAverage() 
  This method takes a String repersenting a station id and gets the Ascii vaule of each char in the string and stores them in an array of ints then it calculates the average of all the Ascii values. Then the mehtod gets the ceiling, floor, and rounded average and returns an int array of the averages.
  
public char LetterAverage() 
  This method calculates the average Ascii value of the station id like the method before but only uses the rounded version. Then the method converts the Ascii value into a letter stored in a char.
  
LetterAvg() Class : extends PosAvg Class

public int numberOfStationWithLetterAvg()
  This method loops through the stations arraty to find the number of stations that started with a given letter.
  
 public ArrayList<String> stationsWithLetterAvg() 
  This method loops through the stations array and puts every station that starts with a given letter into an arraylist and returns it.
  
public String toString() 
  This method prints out the array of station that start with a given letter.
