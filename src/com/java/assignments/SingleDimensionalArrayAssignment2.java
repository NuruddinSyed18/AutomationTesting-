package com.java.assignments;

public class SingleDimensionalArrayAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Approach1:
		// Main Category1- Groceries
		// Sub category- Beverages, Snacks, Dairy Products, Produce
		// Declaring array
		String[] groceries = new String[20];

		// Intializing values into the array
		// Beverages
		groceries[0] = "1,beverages,cola";
		groceries[1] = "2,beverages,orange juice";
		groceries[2] = "3,beverages,lemonde";
		groceries[3] = "4,beverages,green Tea";
		groceries[4] = "5,beverages,black Tea";

		// Snacks
		groceries[5] = "1,snakcs,popcorn";
		groceries[6] = "2,snacks,trail Mix";
		groceries[7] = "3,snacks,beef Jerky";
		groceries[8] = "4,snacks,salted Nuts";
		groceries[9] = "5,snacks,rice Cakes";

		// Dairy Products
		groceries[10] = "1,dairy products,cottage Cheese";
		groceries[11] = "2,dairy products,heavy Cream";
		groceries[12] = "3,dairy products,ice Cream";
		groceries[13] = "4,dairy products,parmesan Chese";
		groceries[14] = "5,dairy products,eggnog";

		// Produce
		groceries[15] = "1,produce,apples";
		groceries[16] = "2,produce,bananas";
		groceries[17] = "3,produce,carrots";
		groceries[18] = "4,produce,potates";
		groceries[19] = "5,produce,onions";
		
		System.out.println(groceries[0]);
		
		
		// Main Category2- Electronics
		// Sub category2- Beverages, Snacks, Dairy Products, Produce
		// Declaring the Array
		String electronics[] = new String[20];
		
		// Intializing values into the array
		// Beverages
		electronics[0] = "1,beverages,cola";
		electronics[1] = "2,beverages,orange juice";
		electronics[2] = "3,beverages,lemonde";
		electronics[3] = "4,beverages,green Tea";
		electronics[4] = "5,beverages,black Tea";

		// Snacks
		electronics[5] = "1,snacks,popcorn";
		electronics[6] = "2,snacks,trail Mix";
		electronics[7] = "3,snacks,beef Jerky";
		electronics[8] = "4,snacks,salted Nuts";
		electronics[9] = "5,snacks,rice Cakes";

		// Dairy Products
		electronics[10] = "1,dairy products,cottage Cheese";
		electronics[11] = "2,dairy products,heavy Cream";
		electronics[12] = "3,dairy products,ice Cream";
		electronics[13] = "4,dairy products,parmesan Chese";
		electronics[14] = "5,dairy products,eggnog";

		// Produce
		electronics[15] = "1,produce,apples";
		electronics[16] = "2,produce,bananas";
		electronics[17] = "3,produce,carrots";
		electronics[18] = "4,produce,potates";
		electronics[19] = "5,produce,onions";

		System.out.println(electronics[7]);

		
		//Approach2:
		//Main Category1: Grocery
		//Sub Category: Beverages, Snacks, Dairy Products, Produce
		//Declaring the array and data initialization into the array
		String[] groceries0= {"1,beverages,cola","2,beverages,orange juice","3,beverages,lemonade","4,beverages,greentea","5,bevearges,black coffee",
				             "1,snacks,popcorn","2,snacks,trail mix","3,snacks,beef jerky,","4,snacks,salted nuts","5,snacks,rice cakes",
				             "1,dairy products,cottage cheese","2,dairy products,heavey cream","3,dairy products,ice cream","4,dairy products,parmesan cheese","5,dairy products,eggnog",
				             "1,produce,onions","2,produce,bananas","3,produce,carrots","4,produce,potatoes","5,produce,onions"};
		System.out.println(groceries0[13]);
		
		//Main Category2: Electronics
		//Sub Category: Beverages, Snacks, Dairy Products, Produce
		//Declaring the array and data initialization into the array
		String[] electronics1= {"1,beverages,cola","2,beverages,orange juice","3,beverages,lemonade","4,beverages,greentea","5,bevearges,black coffee",
	             "1,snacks,popcorn","2,snacks,trail mix","3,snacks,beef jerky,","4,snacks,salted nuts","5,snacks,rice cakes",
	             "1,dairy products,cottage cheese","2,dairy products,heavey cream","3,dairy products,ice cream","4,dairy products,parmesan cheese","5,dairy products,eggnog",
	             "1,produce,onions","2,produce,bananas","3,produce,carrots","4,produce,potatoes","5,produce,onions"};
		System.out.println(electronics1[19]);
	}

}
