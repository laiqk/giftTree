package com.dept.web.dao;

import com.dept.web.dao.model.Product;
import com.dept.web.dao.model.ProductExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("productDAO")
public class ProductDAOImpl extends SqlMapClientDaoSupport implements IProductDAO {

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 
     */
    public ProductDAOImpl() {
        super();
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件查询记录总数
	 * @param example 查询条件
	 * @return 记录总数
     */
    public int countByExample(ProductExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_product.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件删除记录
	 * @param example 查询条件
	 * @return 被删除记录数
     */
    public int deleteByExample(ProductExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_product.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键删除记录
	 * @param id 主键
	 * @return 被删除记录数
     */
    public int deleteByPrimaryKey(Long id) {
        Product key = new Product();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_product.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 新增记录
	 * @param record 新增记录对象
     */
    public void insert(Product record) {
        getSqlMapClientTemplate().insert("tb_product.ibatorgenerated_insert", record);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 选择性新增记录
	 * @param record 新增记录对象
     */
    public void insertSelective(Product record) {
        getSqlMapClientTemplate().insert("tb_product.ibatorgenerated_insertSelective", record);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件查询记录
	 * @param example 查询条件
	 * @return 查询结果列表
     */
    @SuppressWarnings("unchecked")
    public List<Product> selectByExample(ProductExample example) {
        List<Product> list = getSqlMapClientTemplate().queryForList("tb_product.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键查询记录
	 * @param id 主键对象
	 * @return 查询结果对象
     */
    public Product selectByPrimaryKey(Long id) {
        Product key = new Product();
        key.setId(id);
        Product record = (Product) getSqlMapClientTemplate().queryForObject("tb_product.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件选择性修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    public int updateByExampleSelective(Product record, ProductExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_product.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    public int updateByExample(Product record, ProductExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_product.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键选择性修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    public int updateByPrimaryKeySelective(Product record) {
        int rows = getSqlMapClientTemplate().update("tb_product.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    public int updateByPrimaryKey(Product record) {
        int rows = getSqlMapClientTemplate().update("tb_product.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 自动生成的代码.
     * 该类对应的数据库 tb_product
     */
    private static class UpdateByExampleParms extends ProductExample {
        private Object record;

        public UpdateByExampleParms(Object record, ProductExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}