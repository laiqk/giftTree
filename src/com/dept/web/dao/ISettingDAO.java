package com.dept.web.dao;

import com.dept.web.dao.model.Setting;
import com.dept.web.dao.model.SettingExample;
import java.util.List;

public interface ISettingDAO {
    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据查询条件查询记录总数
	 * @param example 查询条件
	 * @return 记录总数
     */
    int countByExample(SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据查询条件删除记录
	 * @param example 查询条件
	 * @return 被删除记录数
     */
    int deleteByExample(SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据主键删除记录
	 * @param id 主键
	 * @return 被删除记录数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 新增记录
	 * @param record 新增记录对象
     */
    void insert(Setting record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 选择性新增记录
	 * @param record 新增记录对象
     */
    void insertSelective(Setting record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    List<Setting> selectByExampleWithBLOBs(SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    List<Setting> selectByExampleWithoutBLOBs(SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据主键查询记录
	 * @param id 主键对象
	 * @return 查询结果对象
     */
    Setting selectByPrimaryKey(Integer id);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据查询条件选择性修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    int updateByExampleSelective(Setting record, SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    int updateByExampleWithBLOBs(Setting record, SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    int updateByExampleWithoutBLOBs(Setting record, SettingExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据主键选择性修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    int updateByPrimaryKeySelective(Setting record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    int updateByPrimaryKeyWithBLOBs(Setting record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    int updateByPrimaryKeyWithoutBLOBs(Setting record);
}