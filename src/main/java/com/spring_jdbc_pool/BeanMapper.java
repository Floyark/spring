package com.spring_jdbc_pool;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BeanMapper implements RowMapper<ItemBean>{

    @Override
    public ItemBean mapRow(ResultSet resultSet, int i) throws SQLException {
        ItemBean itemBean=new ItemBean();
        itemBean.setId(resultSet.getInt("Id"));
        itemBean.setName(resultSet.getString("Name"));
        itemBean.setDescription(resultSet.getString("description"));
        return itemBean;
    }
}
