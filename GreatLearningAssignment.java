import java.util.Scanner;
class GreatLearningAssignment{
public void checkPalindrome(int num,int res,int digit){
int n1=num;
while(num!=0){
digit=num%10;
res=res*10+digit;
num/=10;
}
if(n1==res){
System.out.println("It is a Palindrome ");
}
else{
System.out.println("It is not a Palindrome");
}
}
public void patternDecreasing(int num){
	for(int i=0;i<num;i++){
		for(int j=i;j<num;j++){
			System.out.print("*");
	}
	System.out.println();
}
}
public void checkPrimeNumber(int num){
	int count = 1;
	for(int i=2;i<num;i++){
		if(num%i==0){
			count++;
		}
	}
	if(count==1){
		System.out.println("The given number is Prime Number");
	}
	else{
		System.out.println("The given number is not a Prime Number");
	}
}
public void fibonacciSeries(int num){
	int first=0;
	int second=1;
	int third;
	int i=1;
	while(i<=num){
		System.out.print(first+",");
		third=first+second;
		first=second;
		second=third;
		i++;
	}
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int number=3;
GreatLearningAssignment g=new GreatLearningAssignment();
                int choice;
                Scanner sc = new Scanner(System.in);
do {
System.out.println("Enter your choice from below list." );
System.out.println("1. Find palindrome of number.");
System.out.println("2. Print Pattern for a given no.");
System.out.println("3. Check whether the no is a  prime number.");
System.out.println("4. Print Fibonacci series." );
System.out.println("--> Enter 0 to Exit.");
System.out.println(); 
choice = sc.nextInt();
switch (choice) {
case 0:
    choice = 0;
    break;
case 1:
System.out.println(" Enter a number.");
	int n1=scan.nextInt();
	g.checkPalindrome(n1,0,0);
System.out.println();
System.out.println("============================================================================");
System.out.println();
	break;
case 2:
System.out.println(" Enter a number.");
	int n2=scan.nextInt();
	g.patternDecreasing(n2);
System.out.println();
System.out.println("============================================================================");
System.out.println();
	break;
case 3:
System.out.println(" Enter a number.");
	int n3=scan.nextInt();
	g.checkPrimeNumber(n3);
System.out.println();
System.out.println("============================================================================");
System.out.println();
	break;
case 4:
System.out.println(" Enter a number.");
	int n4=scan.nextInt();
	g.fibonacciSeries(n4);
System.out.println();
System.out.println("============================================================================");
System.out.println();
	break;
default:System.out.println("Invalid choice. Enter a valid no.");  
    } }
     while (choice != 0);
     System.out.println("Exited Successfully!!!");
     sc.close(); 

}
}