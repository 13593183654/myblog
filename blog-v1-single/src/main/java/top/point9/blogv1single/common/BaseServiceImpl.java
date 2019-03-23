package top.point9.blogv1single.common;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Point9
 * Email: blog@point9.top
 * Date: 2019/3/23
 * Time: 11:03
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T>{

    public abstract IBaseMapper<T> getBaseDao();

    public int deleteByPrimaryKey(Long id) {
        return getBaseDao().deleteByPrimaryKey(id);
    }

    public int insert(T t) {
        return getBaseDao().insert(t);
    }

    public int insertSelective(T t) {
        return getBaseDao().insertSelective(t);
    }

    public T selectByPrimaryKey(Long id) {
        return getBaseDao().selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T t) {
        return getBaseDao().updateByPrimaryKeySelective(t);
    }

    public int updateByPrimaryKey(T t) {
        return getBaseDao().updateByPrimaryKey(t);
    }

    public List<T> list() {
        return getBaseDao().list();
    }
}

