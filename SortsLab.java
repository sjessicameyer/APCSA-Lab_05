/** Heading  **********************************************/
/*	Your name: Sarah Meyer
		Class block: 	G			Date Started: 11/8/21
		Lab Number: Lab 5
		Title: Sorting out Sorting
		Purpose: to use four classic sorting algorithms, two recursive and two iterative, and analyze their performance on several generalized types of lists.
*/
public class SortsLab
{
    static final int MAX=1715;
    
    public SortsLab()
    {
    	int[] list=new int[MAX], list2=new int[MAX], list3=new int[MAX], list4=new int[MAX], list5=new int[MAX], list6=new int[MAX];
		  int qfirstcount=0, qmiddlecount=0, qrandomcount=0,icount=0, scount=0, mcount=0;
			
		  // Creates a Random Ordered List of integers and runs all sorts on that list
      // Uses a couple of methods from the ListSetup Class!

			ListSetup.MakeRandom (list);
			ListSetup.Copy (list,list2);
			ListSetup.Copy (list,list3);
			ListSetup.Copy (list,list4);
			ListSetup.Copy (list,list5);
			ListSetup.Copy (list,list6);

      System.out.println("\n\nSorting out Sorting: Random List\n");
			
      System.out.println("List before sorting:");
			//ListSetup.Print (list);
			System.out.println("\nHere is the list after the Insertion Sort. ");
			icount = Sorts.Insertion(list);
			//ListSetup.Print (list);
			System.out.println("There were " + icount + " comparisons\n");
			System.out.println("Here is the list after the Selection Sort. ");
			scount = Sorts.Selection(list2);

			//ListSetup.Print (list2);
      System.out.println("There were " + scount + " comparisons\n");
			System.out.println("Here is the list after the Quicksort (split first). ");
			qfirstcount = Sorts.QuickSort(list3, 0, list.length - 1);
			//ListSetup.Print (list3);
      System.out.println("There were " + qfirstcount + " comparisons\n");
      
      System.out.println("Here is the list after the Quicksort (split middle). ");
			qmiddlecount = Sorts.QuickSortMid(list5, 0, list.length - 1);
			//ListSetup.Print (list5);
      System.out.println("There were " + qmiddlecount + " comparisons\n");

      System.out.println("Here is the list after the Quicksort (split random). ");
			qrandomcount = Sorts.QuickSortRandom(list6, 0, list.length - 1);
			//ListSetup.Print (list6);
      System.out.println("There were " + qrandomcount + " comparisons\n");

			System.out.println("Here is the list after the Merge Sort. ");
			mcount = Sorts.mergeSort(list4, 0, list.length - 1);
			//ListSetup.Print (list4);
      System.out.println("There were " + mcount + " comparisons\n");
			System.out.println("\n");

      
		// Create an Ascending Order (small to large) List of Integers 
    // Use a couple methods from the ListSetup Class!
    // Then run the same sorting and counting procedures as done above on this list
    System.out.println("Sorting out Sorting: Ascending Order List\n");
			
		// You write code here, or copy and paste, hehe.	
			
    ListSetup.MakeInOrder (list);
		ListSetup.Copy (list,list2);
		ListSetup.Copy (list,list3);
		ListSetup.Copy (list,list4);
		ListSetup.Copy (list,list5);
    ListSetup.Copy (list,list6);
			
		System.out.println("List before sorting:");
		//ListSetup.Print (list);
		System.out.println("\nHere is the list after the Insertion Sort. ");
		icount = Sorts.Insertion(list);
		//ListSetup.Print (list);
		System.out.println("There were " + icount + " comparisons\n");
		System.out.println("Here is the list after the Selection Sort. ");
		scount = Sorts.Selection(list2);
		//ListSetup.Print (list2);
    System.out.println("There were " + scount + " comparisons\n");
    
		System.out.println("Here is the list after the Quicksort (split first). ");
		qfirstcount = Sorts.QuickSort(list3, 0, list.length - 1);
		//ListSetup.Print (list3);
    System.out.println("There were " + qfirstcount + " comparisons\n");

    System.out.println("Here is the list after the Quicksort (split middle). ");
		qmiddlecount = Sorts.QuickSortMid(list5, 0, list.length - 1);
		//ListSetup.Print (list5);
    System.out.println("There were " + qmiddlecount + " comparisons\n");

    System.out.println("Here is the list after the Quicksort (split random). ");
		qrandomcount = Sorts.QuickSortRandom(list6, 0, list.length - 1);
		//ListSetup.Print (list6);
    System.out.println("There were " + qrandomcount + " comparisons\n");

		System.out.println("Here is the list after the Merge Sort. ");
		mcount = Sorts.mergeSort(list4, 0, list.length - 1);
		//ListSetup.Print (list4);
    System.out.println("There were " + mcount + " comparisons\n");
		System.out.println("\n");
	
	
		// Create an Descending Order (large to small) List of Integers
    // Use a couple methods from the ListSetup Class!
    // Then run the same sorting and counting procedures as done above on this list
	  System.out.println("Sorting out Sorting: Descending Order List\n");
			
		// You write code here, or copy and paste, hehe.		
			
    ListSetup.MakeReverse (list);
		ListSetup.Copy (list,list2);
		ListSetup.Copy (list,list3);
		ListSetup.Copy (list,list4);
		ListSetup.Copy (list,list5);
    ListSetup.Copy (list,list6);
			
		System.out.println("List before sorting:");
		//ListSetup.Print (list);
		System.out.println("\nHere is the list after the Insertion Sort. ");
		icount = Sorts.Insertion(list);
		//ListSetup.Print (list);
		System.out.println("There were " + icount + " comparisons\n");
		System.out.println("Here is the list after the Selection Sort. ");
		scount = Sorts.Selection(list2);
		//ListSetup.Print (list2);
    System.out.println("There were " + scount + " comparisons\n");
    
		System.out.println("Here is the list after the Quicksort (split first). ");
		qfirstcount = Sorts.QuickSort(list3, 0, list.length - 1);
		//ListSetup.Print (list3);
    System.out.println("There were " + qfirstcount + " comparisons\n");

    System.out.println("Here is the list after the Quicksort (split middle). ");
		qmiddlecount = Sorts.QuickSortMid(list5, 0, list.length - 1);
		//ListSetup.Print (list5);
    System.out.println("There were " + qmiddlecount + " comparisons\n");

    System.out.println("Here is the list after the Quicksort (split random). ");
		qrandomcount = Sorts.QuickSortRandom(list6, 0, list.length - 1);
		//ListSetup.Print (list6);
    System.out.println("There were " + qrandomcount + " comparisons\n");

		System.out.println("Here is the list after the Merge Sort. ");
		mcount = Sorts.mergeSort(list4, 0, list.length - 1);
		//ListSetup.Print (list4);
    System.out.println("There were " + mcount + " comparisons\n");
		System.out.println("\n");

  ///// MOVEMENT code
  
  System.out.print("And now for something completely different, we shall add in movements:");

  ListSetup.MakeRandom (list);
			ListSetup.Copy (list,list2);
			ListSetup.Copy (list,list3);
			ListSetup.Copy (list,list4);
			ListSetup.Copy (list,list5);
			ListSetup.Copy (list,list6);

      System.out.println("\n\nSorting out Sorting: Random List\n");
			
      System.out.println("List before sorting:");
			//ListSetup.Print (list);
			System.out.println("\nHere is the list after the Insertion Sort. ");
			icount = SortsMove.Insertion(list);
			//ListSetup.Print (list);
			System.out.println("There were " + icount + " comparisons & movements\n");
			System.out.println("Here is the list after the Selection Sort. ");
			scount = SortsMove.Selection(list2);

			//ListSetup.Print (list2);
      System.out.println("There were " + scount + " comparisons & movements\n");
			System.out.println("Here is the list after the Quicksort (split first). ");
			qfirstcount = SortsMove.QuickSort(list3, 0, list.length - 1);
			//ListSetup.Print (list3);
      System.out.println("There were " + qfirstcount + " comparisons & movements\n");
      
      System.out.println("Here is the list after the Quicksort (split middle). ");
			qmiddlecount = SortsMove.QuickSortMid(list5, 0, list.length - 1);
			//ListSetup.Print (list5);
      System.out.println("There were " + qmiddlecount + " comparisons & movements\n");

      System.out.println("Here is the list after the Quicksort (split random). ");
			qrandomcount = SortsMove.QuickSortRandom(list6, 0, list.length - 1);
			//ListSetup.Print (list6);
      System.out.println("There were " + qrandomcount + " comparisons & movements\n");

			System.out.println("Here is the list after the Merge Sort. ");
			mcount = SortsMove.mergeSort(list4, 0, list.length - 1);
			//ListSetup.Print (list4);
      System.out.println("There were " + mcount + " comparisons & movements\n");
			System.out.println("\n");

      
		// Create an Ascending Order (small to large) List of Integers 
    // Use a couple methods from the ListSetup Class!
    // Then run the same sorting and counting procedures as done above on this list
    System.out.println("Sorting out Sorting: Ascending Order List\n");
			
		// You write code here, or copy and paste, hehe.	
			
    ListSetup.MakeInOrder (list);
		ListSetup.Copy (list,list2);
		ListSetup.Copy (list,list3);
		ListSetup.Copy (list,list4);
		ListSetup.Copy (list,list5);
    ListSetup.Copy (list,list6);
			
		System.out.println("List before sorting:");
		//ListSetup.Print (list);
		System.out.println("\nHere is the list after the Insertion Sort. ");
		icount = SortsMove.Insertion(list);
		//ListSetup.Print (list);
		System.out.println("There were " + icount + " comparisons & movements\n");
		System.out.println("Here is the list after the Selection Sort. ");
		scount = SortsMove.Selection(list2);
		//ListSetup.Print (list2);
    System.out.println("There were " + scount + " comparisons & movements\n");
    
		System.out.println("Here is the list after the Quicksort (split first). ");
		qfirstcount = SortsMove.QuickSort(list3, 0, list.length - 1);
		//ListSetup.Print (list3);
    System.out.println("There were " + qfirstcount + " comparisons & movements\n");

    System.out.println("Here is the list after the Quicksort (split middle). ");
		qmiddlecount = SortsMove.QuickSortMid(list5, 0, list.length - 1);
		//ListSetup.Print (list5);
    System.out.println("There were " + qmiddlecount + " comparisons & movements\n");

    System.out.println("Here is the list after the Quicksort (split random). ");
		qrandomcount = SortsMove.QuickSortRandom(list6, 0, list.length - 1);
		//ListSetup.Print (list6);
    System.out.println("There were " + qrandomcount + " comparisons & movements\n");

		System.out.println("Here is the list after the Merge Sort. ");
		mcount = SortsMove.mergeSort(list4, 0, list.length - 1);
		//ListSetup.Print (list4);
    System.out.println("There were " + mcount + " comparisons & movements\n");
		System.out.println("\n");
	
	
		// Create an Descending Order (large to small) List of Integers
    // Use a couple methods from the ListSetup Class!
    // Then run the same sorting and counting procedures as done above on this list
	  System.out.println("Sorting out Sorting: Descending Order List\n");
			
		// You write code here, or copy and paste, hehe.		
			
    ListSetup.MakeReverse (list);
		ListSetup.Copy (list,list2);
		ListSetup.Copy (list,list3);
		ListSetup.Copy (list,list4);
		ListSetup.Copy (list,list5);
    ListSetup.Copy (list,list6);
			
		System.out.println("List before sorting:");
		//ListSetup.Print (list);
		System.out.println("\nHere is the list after the Insertion Sort. ");
		icount = SortsMove.Insertion(list);
		//ListSetup.Print (list);
		System.out.println("There were " + icount + " comparisons & movements\n");
		System.out.println("Here is the list after the Selection Sort. ");
		scount = SortsMove.Selection(list2);
		//ListSetup.Print (list2);
    System.out.println("There were " + scount + " comparisons & movements\n");
    
		System.out.println("Here is the list after the Quicksort (split first). ");
		qfirstcount = SortsMove.QuickSort(list3, 0, list.length - 1);
		//ListSetup.Print (list3);
    System.out.println("There were " + qfirstcount + " comparisons & movements\n");

    System.out.println("Here is the list after the Quicksort (split middle). ");
		qmiddlecount = SortsMove.QuickSortMid(list5, 0, list.length - 1);
		//ListSetup.Print (list5);
    System.out.println("There were " + qmiddlecount + " comparisons & movements\n");

    System.out.println("Here is the list after the Quicksort (split random). ");
		qrandomcount = SortsMove.QuickSortRandom(list6, 0, list.length - 1);
		//ListSetup.Print (list6);
    System.out.println("There were " + qrandomcount + " comparisons & movements\n");

		System.out.println("Here is the list after the Merge Sort. ");
		mcount = SortsMove.mergeSort(list4, 0, list.length - 1);
		//ListSetup.Print (list4);
    System.out.println("There were " + mcount + " comparisons & movements\n");
		System.out.println("\n");

	}	
	

}
