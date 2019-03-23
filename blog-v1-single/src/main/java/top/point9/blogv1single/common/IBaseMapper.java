package top.point9.blogv1single.common;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Point9
 * Email: blog@point9.top
 * Date: 2019/3/23
 * Time: 11:04
 */
public interface IBaseMapper<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

    List<T> list();
}
