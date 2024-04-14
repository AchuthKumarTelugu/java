public class Arrays {
    public static void main(String[] args) {
        int[] arrs={1,2,3,4,4,5,4};//declaring arrays
        //arrays are fixed in size,it only accepts homogenous data
        System.out.println(arrs[0]);
        for(int i=0;i<arrs.length;i++) {
          System.out.print(arrs[i]+" "); 
        }
        System.out.println();
        //multi dimension array
        int[][] multiArr={{1,2},{3,4},{5,6}};
        for(int k=0;k<multiArr.length;k++) {
            for(int i=0;i <multiArr[k].length;i++) {
              System.out.print(multiArr[k][i]+" ");
            }
            System.out.println();
        }
    }
}
