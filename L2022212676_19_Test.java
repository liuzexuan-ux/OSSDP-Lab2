import org.junit.Test;
import com.javaweblzx.Solution19;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
    采用等价划分原则
    划分为
    有效等价类：gameOFLife([][] test)
    测试目的：测试方法能否正常运行并实现目的操作。
        int [][] test1 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int [][] test2 = {{1,1},{1,0}};
        预期结果：
        int [][] expected1 = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        int [][] expected2 = {{1,1},{1,1}};

     无效等价类：gameOFLife([][] test)
     测试目的：判断方法对错误输入的处理。
     int [][] test1 = {{0,2,3},{-1,0,5},{1,1,8},{-6,9,10}};
     预期结果：
     输入错误，数组内元素只能是0,1
 */
public class L2022212676_19_Test {
    @Test
    public void testgameOfLife() {
        int [][] test1 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int [][] test2 = {{1,1},{1,0}};

        Solution19 sol = new Solution19();
        int [][] expected1 = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        int [][] expected2 = {{1,1},{1,1}};

        int [][] reality1=sol.gameOfLife( test1);
        int [][] reality2=sol.gameOfLife( test2);

        assertArrayEquals(expected1,reality1);
        assertArrayEquals(expected2,reality2);
       // assertArrayEquals(result2,sol.gameOfLife( expected));
    }
    @Test
    public void testlisten(){
        int [][] test3 =  {{0,2,3},{-1,0,5},{1,1,8},{-6,9,10}};
        Solution19 soll = new Solution19();
        soll.gameOfLife(test3);
        assertEquals("输入错误，数组内元素只能是0,1",soll.Listen());
    }

}
