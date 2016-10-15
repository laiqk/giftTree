package com.dept.web.dao;

import com.dept.web.dao.model.User;
import com.dept.web.dao.model.UserExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl extends SqlMapClientDaoSupport implements IUserDAO {

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public UserDAOImpl() {
        super();
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件查询记录总数
	 * @param example 查询条件
	 * @return 记录总数
     */
    public int countByExample(UserExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_user.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件删除记录
	 * @param example 查询条件
	 * @return 被删除记录数
     */
    public int deleteByExample(UserExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_user.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键删除记录
	 * @param id 主键
	 * @return 被删除记录数
     */
    public int deleteByPrimaryKey(Integer id) {
        User key = new User();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_user.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 新增记录
	 * @param record 新增记录对象
     */
    public void insert(User record) {
        getSqlMapClientTemplate().insert("tb_user.ibatorgenerated_insert", record);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 选择性新增记录
	 * @param record 新增记录对象
     */
    public void insertSelective(User record) {
        getSqlMapClientTemplate().insert("tb_user.ibatorgenerated_insertSelective", record);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件查询记录
	 * @param example 查询条件
	 * @return 查询结果列表
     */
    @SuppressWarnings("unchecked")
    public List<User> selectByExample(UserExample example) {
        List<User> list = getSqlMapClientTemplate().queryForList("tb_user.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键查询记录
	 * @param id 主键对象
	 * @return 查询结果对象
     */
    public User selectByPrimaryKey(Integer id) {
        User key = new User();
        key.setId(id);
        User record = (User) getSqlMapClientTemplate().queryForObject("tb_user.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件选择性修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    public int updateByExampleSelective(User record, UserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    public int updateByExample(User record, UserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键选择性修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    public int updateByPrimaryKeySelective(User record) {
        int rows = getSqlMapClientTemplate().update("tb_user.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    public int updateByPrimaryKey(User record) {
        int rows = getSqlMapClientTemplate().update("tb_user.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该类对应的数据库 tb_user
     */
    private static class UpdateByExampleParms extends UserExample {
        private Object record;

        public UpdateByExampleParms(Object record, UserExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}