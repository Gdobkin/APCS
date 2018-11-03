package Ch7Arrays;

import junit.framework.TestCase;

public class GabrielleDobkinSumTest extends TestCase {
    public void testCreateArrays(){
        String[] input = {"1234", "3456"};
        int [][] expectedResult = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,4,5,6}
        };
        int [][] result  = new int[input.length][25];
        GabrielleDobkinSum.createArrays(input,result);

        for( int i=0;i<result.length;i++){
            assertEquals(25,result[i].length);
            for(int j=0;j<expectedResult[i].length;j++)
                assertEquals(expectedResult[i][j],result[i][j]);
        }
    }
   // public void testAdds
}

