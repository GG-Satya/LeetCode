// 54. Spiral Matrix
// =================

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> res= new LinkedList<>();
	       int i=0,j=-1;
	       char direction ='r';
	       for(int n=0; n < (matrix.length*matrix[0].length); n++){
	           switch(direction){
	              case 'r':	res.add(matrix[i][++j]);
	              			matrix[i][j] = 101;
	              			if(j== matrix[0].length-1 || matrix[i][j+1] == 101) direction='d';
	              			break;
	              			
	              case 'd': res.add(matrix[++i][j]);
	            	  		matrix[i][j] = 101;
	            	  		if(i==matrix.length-1 || matrix[i+1][j] == 101) direction='l';
	            	  		break;
	            	  		
	              case 'l':	res.add(matrix[i][--j]);
		              		matrix[i][j] = 101;
		              		if(j==0 || matrix[i][j-1] == 101) direction='u';
		              		break;
		              		
	              case 'u': res.add(matrix[--i][j]);
	            	    	matrix[i][j] = 101;
	            	    	if(i==0 || matrix[i-1][j] == 101) direction='r';
	            	    	break;  
	           }
	        }return res;
    }
}