import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syning.mybatis.mappers.EmpMapper;
import com.syning.mybatis.pojo.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageHelperTest {


    /**
     *  limit index pageSize
     *  index : 当前页的起始索引
     *  pageSize : 当前页显示的条数
     *  pageNum : 当前页的页码
     *  index = (pageNum - 1) * pageSize
     *
     *
     *  使用分页插件实现分页功能
     *  1、需要在查询功能之前开启分页
     *  PageHelper.startPage(int pageNum, int pageSize);
     */


    @Test
    public void testPage() {
        SqlSession sqlSession = MBG_Test.getSqlSession();

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);


        Page<Object> objects = PageHelper.startPage(1, 4);

        List<Emp> list = mapper.selectByExample(null);

        PageInfo<Emp> page = new PageInfo<>(list, 3);

        list.forEach(emp -> System.out.println(emp));

        System.out.println(page);


        //System.out.println(objects);


    }





    @Test
    public void testPageHelperTest() {

        SqlSession sqlSession = MBG_Test.getSqlSession();

        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        // 分页插件
        PageHelper.startPage(2, 4);

        List<Emp> lst = empMapper.selectByExample(null);

        for (Emp e : lst) {
            System.out.println(e);
        }


    }













}
