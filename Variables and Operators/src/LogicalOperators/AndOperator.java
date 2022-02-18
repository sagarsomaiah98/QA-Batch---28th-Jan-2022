package LogicalOperators;

public class AndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=300;int b=500 ;int c=100;
		
		if((a>b)& (a>c))// false & true-> false
			System.out.println("a is bigger");
		else
			System.out.println("a is not bigger");

	}

}
