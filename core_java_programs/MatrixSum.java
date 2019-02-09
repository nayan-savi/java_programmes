import java.io.*;
public class MatrixSum{
	public static void main(String args[]){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter row size for matrix1");
		int row1 = Integer.parseInt(br.readLine());
		System.out.println("Enter column size for matrix1");
		String str2 = br.readLine();
		int col1 = Integer.parseInt(str2);

		System.out.println("Enter row size for matrix2");
		String str3 = br.readLine();
		int row2 = Integer.parseInt(str3);
		System.out.println("Enter column size for matrix2");
		String str4 = br.readLine();
		int col2 = Integer.parseInt(str4);

		if(row1==row2&& col1==col2){
			System.out.println("Enter matrix1 values: ");
			int[][] mat1 = new int[row1][col1];
			for(int i=0;i<row1;i++){
				for(int j=0;j<col1;j++){
					mat1[i][j]=Integer.parseInt(br.readLine());
				}
			}

			System.out.println("Enter matrix2 values: ");
			int[][] mat2 = new int[row2][col2];
			for(int i=0;i<row2;i++){
				for(int j=0;j<col2;j++){
					mat2[i][j]=Integer.parseInt(br.readLine());
				}
			}

			System.out.println("The Result is");
			int[][] res = new int[row2][col2];
			for(int i=0;i<row2;i++){
				for(int j=0;j<col2;j++){
					res[i][j]=mat1[i][j]+mat2[i][j];
					System.out.print(res[i][j]+"  ");
				}
				System.out.println();
			}
			
		}else{
			System.out.println("Please Enter Matrix are of same size");
		}

		}catch(Exception  e){
			System.out.println("Please enter numbers only!!!");
		}

		
	}
}