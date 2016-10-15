package com.dept.web.dao;

import com.dept.web.dao.model.Setting;
import com.dept.web.dao.model.SettingExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("settingDAO")
public class SettingDAOImpl extends SqlMapClientDaoSupport implements ISettingDAO {

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    public SettingDAOImpl() {
        super();
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据查询条件查询记录总数
	 * @param example 查询条件
	 * @return 记录总数
     */
    public int countByExample(SettingExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_setting.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据查询条件删除记录
	 * @param example 查询条件
	 * @return 被删除记录数
     */
    public int deleteByExample(SettingExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_setting.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据主键删除记录
	 * @param id 主键
	 * @return 被删除记录数
     */
    public int deleteByPrimaryKey(Integer id) {
        Setting key = new Setting();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_setting.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 新增记录
	 * @param record 新增记录对象
     */
    public void insert(Setting record) {
        getSqlMapClientTemplate().insert("tb_setting.ibatorgenerated_insert", record);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 选择性新增记录
	 * @param record 新增记录对象
     */
    public void insertSelective(Setting record) {
        getSqlMapClientTemplate().insert("tb_setting.ibatorgenerated_insertSelective", record);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Setting> selectByExampleWithBLOBs(SettingExample example) {
        List<Setting> list = getSqlMapClientTemplate().queryForList("tb_setting.ibatorgenerated_selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Setting> selectByExampleWithoutBLOBs(SettingExample example) {
        List<Setting> list = getSqlMapClientTemplate().queryForList("tb_setting.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据主键查询记录
	 * @param id 主键对象
	 * @return 查询结果对象
     */
    public Setting selectByPrimaryKey(Integer id) {
        Setting key = new Setting();
        key.setId(id);
        Setting record = (Setting) getSqlMapClientTemplate().queryForObject("tb_setting.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据查询条件选择性修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    public int updateByExampleSelective(Setting record, SettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_setting.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    public int updateByExampleWithBLOBs(Setting record, SettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_setting.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    public int updateByExampleWithoutBLOBs(Setting record, SettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_setting.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 根据主键选择性修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    public int updateByPrimaryKeySelective(Setting record) {
        int rows = getSqlMapClientTemplate().update("tb_setting.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    public int updateByPrimaryKeyWithBLOBs(Setting record) {
        int rows = getSqlMapClientTemplate().update("tb_setting.ibatorgenerated_updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_setting
     * 
     */
    public int updateByPrimaryKeyWithoutBLOBs(Setting record) {
        int rows = getSqlMapClientTemplate().update("tb_setting.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该类对应的数据库 tb_setting
     */
    private static class UpdateByExampleParms extends SettingExample {
        private Object record;

        public UpdateByExampleParms(Object record, SettingExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}