

public class Partition {
/** Count the number of ways to partition a set of size n into k nonempty subsets.
*
* @param n The size of the set
* @param k The size of the partitions
* @require 0 <= k and k <= n
* @ensure result equals the number of ways to partition a set of size n
*/
	public static int countPartitions(int n, int k) {
		// TODO
		if (n < k) {
			return 0;
		} 
		if(n == 0) {
			return 1;
		}
		if(n > 0 && k == 0) {
			return 0;
		}
		if(k == n) {
			return 1;
		}
		else {
			return countPartitions(n-1 , k) * k+ countPartitions(n-1,k-1);
		}
}

//test
	public static void main(String[] args) {
		
		//Partition cP = new Partition();
		int num = Partition.countPartitions(4, 3);
		System.out.println("the number of ways is: "+ num);
		
	}
}














