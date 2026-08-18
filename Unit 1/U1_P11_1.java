//11.1 Write a java program of 2D array take manually values.
 
 public class U1_P11_1
 {
	 public static void main(String args[])
	 { 	 
		 int scores[][]= new int[3][3];
		 scores[0][0]=90;
		 scores[0][1]=70;
		 scores[0][2]=80;
		 scores[1][0]=95;
		 scores[1][1]=85;
		 scores[1][2]=35;
		 scores[2][0]=45;
		 scores[2][1]=20;
		 scores[2][2]=21;
		 
		 System.out.println("Manually assigned array elements:");
		 for(int i=0;i<scores.length;i++)
		{
		  for(int j=0;j<scores[i].length;j++)
		  {
			  System.out.print(scores[i][j]+" ");
		  }
		  System.out.println();
		}
	 }
 }	 
		 