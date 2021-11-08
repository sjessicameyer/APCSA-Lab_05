# Lab 5
### Sorting out Sorting

#### Objective:  to use four classic sorting algorithms, two recursive and two iterative, and analyze their performance on several generalized types of lists. 

Notice that you have 4 java files in your project.  

  1. *Main.java* just calls the SortsLab.java file.
      

  2. *ListSetup.java* is not something you will edit, you just use it to help create lists and display them.  Notice the methods are ```static``` which allows you to call them from SortsLab by writing ```ListSetup.print(list);``` for example.  You do not need to make an instance of the ListSetup class to do this since the methods are ```static```.
  

  3. *Sorts.java* is the other file you will do plenty of editing, as you add counters to the various sorts.


  4. *SortsLab.java* is the main driver program and one of the two files you will be editing.


  5. *SortsMove.java* will be used towards the end of the lab, and should be empty now.


- Compile and run the given program, it should display a random list of 20 numbers followed by the same random list being sorted by 4 different sorting algorithms. *Why do we need that block of code that copies the list so many times?*


- Read through the Sort code to understand what is happening in each sort.  These are the versions we will use as our point of reference for all sorting discussions.  We realize there are many variations of each sort that is why we are specifying the exact code we will be using.


- When you first run the program you get the insertion sort displaying “There were 0 comparisons”.  The goal here is to get a rough idea of the algorithm’s running time.  Modify the Insertion method in the Sorts.java file by declaring a variable icount that will keep track of how many times during that method execution **an array element is compared to another element** from the array.  Be sure to return your icount variable to determine its running time measure.


- Complete the same task for the Selection, Quicksort, and Merge sort methods by adding appropriate counters, and test them on the random-ordered array to verify that the lists are properly sorted. Calculate the scount, qcount, and mcount.  These represent the number of comparisons between **array elements** in the selection, quicksort, and merge sort algorithms.  
### Run the Unit Tests to check that you are on point before proceeding!!
#### *You will need to run them at least 5 times and make sure they succeed 4 out of 5 times. (Each test must pass 4 out of 5 times)* 

- Next, complete the additional coding sections in SortsLab.java required to run each sorting method on **ascending-ordered**, and **descending-ordered** list of numbers.  This means adding chunks of code in SorstsLab.java.

-Finally bump the size of the arrays to 1715 elements by changing the MAX value at the top of the SortsLab.java file.  Compare the running times of the four sorts again on these lists.  Be sure to comment out the print calls when you change the size of the arrays.  

#### Answer Sorting Question 1 Posted in Google Classroom

### Now we want to focus on the QuickSort for a bit

Comment out all *sorting calls* in SortsLab.java except the QuickSort portions of the program.  The quicksort algorithm you’ve been using selects the first value in the array as the pivot element.  You will now explore how the choice of quicksort’s pivot element affects the running time.  Complete the `QuickSortMid` code in Sorts.java to have the pivot be the **middle element** of the list.  Then complete the `QuickSortRandom` method in Sorts.java to pivot at a **randomly** chosen location in the list before proceeding with the splitting.  When you are sure this is running correctly you may uncomment your commented sort calls.

#### Answer Sorting Question 2 Posted in Google Classroom

### Finally adding in movement

Counting the number of comparisons disregards movements of elements.  For example, a swap requires three moves.  The merge sort uses a temporary array and moves elements to and from it.  

- Open your Sorts.java file and copy all of the code in it.  
- Now open your SortsMove.java file and paste all that code into it.  
- Change the class name from Sorts to SortsMove.
- Next modify SortsMove,java such that to your existing counter you add the number of moves as well as comparisons. This means your counter is the sum of both comparisons and moves.
- Finally complete the needed code additions and edits in SortsLab.java to run your "new" sorts that report the combined comparisons and movements. 

#### Answer Sorting Question 3 Posted in Google Classroom

**Notes:** 

Merge Sort requires 2 methods to complete it’s sort.

The variable ```MAX``` in SorstLab.java is a ```static final int```, once you set it at the beginning of the program, you cannot change it.  We list it in all caps to identify that.

***

### Scoring Guide

| Requirement | Possible Points |
| :---        |    :----:   | 
| On time submission | 4 | 
| Header filled in with name, block, etc. | 2 |
| Correctly uploaded zipped replit project to Google Classroom | 2 |
| Correct Insertion Sort Counting & Movements | 4 |
| Correct Selection Sort Counting & Movements| 4 |
| Correct QuickSort Counting & Movements| 4 |
| Correct Merge Sort Counting & Movements| 4 |
| Correct QuickSort Variations | 4 |
| Correctly Displays a match to the Sample Run | 4 |
| **Total:** | **32** |

***  

### Here is what a sample run of this program should look like with 20 elements: 

```
Sorting out Sorting: Random List

List before sorting:
6  6  3  16  18  6  10  11  18  6  14  10  0  10  11  3  13  10  8  14  

Here is the list after the Insertion Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Selection Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split first). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split middle). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split random). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Merge Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons


Sorting out Sorting: Ascending Order List

List before sorting:
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  

Here is the list after the Insertion Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Selection Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split first). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split middle). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split random). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Merge Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons


Sorting out Sorting: Descending Order List

List before sorting:
18  18  16  14  14  13  11  11  10  10  10  10  8  6  6  6  6  3  3  0  

Here is the list after the Insertion Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Selection Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split first). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split middle). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Quicksort (split random). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons

Here is the list after the Merge Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons


And now for something completely different, we shall add in movements:

Sorting out Sorting: Random List

List before sorting:
6  6  3  16  18  6  10  11  18  6  14  10  0  10  11  3  13  10  8  14  

Here is the list after the Insertion Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Selection Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split first). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split middle). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split random). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Merge Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements


Sorting out Sorting: Ascending Order List

List before sorting:
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  

Here is the list after the Insertion Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Selection Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split first). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split middle). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split random). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Merge Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements


Sorting out Sorting: Descending Order List

List before sorting:
18  18  16  14  14  13  11  11  10  10  10  10  8  6  6  6  6  3  3  0  

Here is the list after the Insertion Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Selection Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split first). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split middle). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Quicksort (split random). 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

Here is the list after the Merge Sort. 
0  3  3  6  6  6  6  8  10  10  10  10  11  11  13  14  14  16  18  18  
There were _ comparisons & movements

```