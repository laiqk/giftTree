package com.dept.web.dao;

import com.dept.web.dao.model.User;
import com.dept.web.dao.model.UserExample;
import java.util.List;

public interface IUserDAO {
    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件查询记录总数
	 * @param example 查询条件
	 * @return 记录总数
     */
    int countByExample(UserExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件删除记录
	 * @param example 查询条件
	 * @return 被删除记录数
     */
    int deleteByExample(UserExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键删除记录
	 * @param id 主键
	 * @return 被删除记录数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 新增记录
	 * @param record 新增记录对象
     */
    void insert(User record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 选择性新增记录
	 * @param record 新增记录对象
     */
    void insertSelective(User record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件查询记录
	 * @param example 查询条件
	 * @return 查询结果列表
     */
    List<User> selectByExample(UserExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键查询记录
	 * @param id 主键对象
	 * @return 查询结果对象
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件选择性修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    int updateByExampleSelective(User record, UserExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据查询条件修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    int updateByExample(User record, UserExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键选择性修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 根据主键修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    int updateByPrimaryKey(User record);
}