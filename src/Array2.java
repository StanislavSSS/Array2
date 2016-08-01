public class Array2 {
	public static void main (String args[]){
		
		int[][] m = {{1,2,3,4,5}
					,{2,2,2,2,2}
					,{6,7,8,9,0}
					,{7,7,7,7,7}
					,{8,8,8,8,8}};
		
		for(int i = 0; i<5; i++){
			for (int j = 0; j<5; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
/*
 1,2,3,4,5
 2,2,2,2,2
 6,7,8,9,0
  
 
 */