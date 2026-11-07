class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowstart=0, colstart=0, rowend=matrix.length-1, colend=matrix[0].length-1, p;
        List<Integer> ls=new ArrayList<>();
        while(rowstart<=rowend && colstart<=colend)
        {
            for(p=colstart; p<=colend; p++)
                ls.add(matrix[rowstart][p]);
            rowstart++;
            if(rowstart>rowend || colstart>colend)
                break;
            for(p=rowstart;p<=rowend;p++)
                ls.add(matrix[p][colend]);
            colend--;
            if(rowstart>rowend || colstart>colend)
                break;
            for(p=colend; p>=colstart; p--)
                ls.add(matrix[rowend][p]);
            rowend--;
            if(rowstart>rowend || colstart>colend)
                break;
            for(p=rowend; p>=rowstart; p--)
                ls.add(matrix[p][colstart]);
            colstart++;
            if(rowstart>rowend || colstart>colend)
                break;
        }
        return ls;
    }
}