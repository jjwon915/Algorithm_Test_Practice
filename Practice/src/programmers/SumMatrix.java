package programmers;

public class SumMatrix {
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	
    	int n = arr1.length;
    	int m = arr1[0].length;
        int[][] answer = new int[n][m];
        
        for(int i = 0; i < arr1.length; i++){
        	for(int j = 0; j < arr1[0].length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		
		SumMatrix T = new SumMatrix();
		T.solution(arr1, arr2);
		
	}

}
