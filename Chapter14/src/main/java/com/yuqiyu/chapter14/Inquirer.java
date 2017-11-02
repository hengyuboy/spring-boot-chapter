package com.yuqiyu.chapter14;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/15
 * Time：15:55
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class Inquirer {
    //查询条件集合
    private List<BooleanExpression> expressions;
    public Inquirer() {
        this.expressions = new ArrayList<>();
    }
    /**
     * 添加查询条件到Query内的查询集合内
     * @param expression 查询条件继承BooleanExpression抽象对象的具体实体对象,querydsl已经封装
     * @return
     */
    public Inquirer putExpression(BooleanExpression expression)
    {
        //添加到条件集合
        expressions.add(expression);
        return this;
    }
    /**
     * 构建出查询findAll函数使用的Predicate接口查询对象<br>
     * 调用buidleQuery()可直接作为findAll参数查询条件使用
     * @return
     */
    public Predicate buidleQuery()
    {
        //第一个查询条件对象
        BooleanExpression be = null;
        //遍历所有查询条件，以第一个开始and
        for (int i = 0 ; i < expressions.size() ; i++)
        {
            if(i == 0)
                be = expressions.get(i);
            else
                be = be.and(expressions.get(i));
        }
        return be;
    }

    /**
     * 将Iterable集合转换成ArrayList集合
     * @param iterable 源集合
     * @param <T> 类型
     * @return arrayList结果
     */
    public <T> List<T> iteratorToList(Iterable<T> iterable)
    {
        List<T> returnList = new ArrayList<T>();
        Iterator<T> iterator = iterable.iterator();
        while(iterator.hasNext())
        {
            returnList.add(iterator.next());
        }
        return returnList;
    }
}
