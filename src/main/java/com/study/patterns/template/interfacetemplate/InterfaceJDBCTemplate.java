package com.study.patterns.template.interfacetemplate;


import com.study.patterns.template.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by ASUS on 2019/8/10.
 */
public interface InterfaceJDBCTemplate {

    DataSource DATA_SOURCE = null;

    default <T> List<T> executeQuery(String sql, RowMapper<T> rowMapper, Object[] params) throws Exception {
        //获取链接
        Connection connection = this.getConnection();
        //创建语句集
        PreparedStatement prepareStatement = this.createPrepareStatement(connection, sql);
        //执行查询
        ResultSet resultSet = this.executeQuery(prepareStatement, params);
        //处理结果集
        List<T> result = parseResultSet(resultSet, rowMapper);
        //关闭结果集
        this.closedResultSet(resultSet);
        //关闭语句集
        this.closedStatement(prepareStatement);
        //关闭连接
        this.closedConnection(connection);
        return result;
    }

    default Connection getConnection() throws Exception {
        return DATA_SOURCE.getConnection();
    }

    default PreparedStatement createPrepareStatement(Connection connection, String sql) throws Exception {
        return connection.prepareStatement(sql);
    }

    default ResultSet executeQuery(PreparedStatement prepareStatement, Object[] params) throws Exception {
        for (int i = 0; i < params.length; i++) {
            prepareStatement.setObject(i, params[i]);
        }
        return prepareStatement.executeQuery();
    }

    default <T> List<T> parseResultSet(ResultSet resultSet, RowMapper<T> rowMapper) throws Exception {
        int rowNum = 0;
        List<T> result = new ArrayList<>();
        while (resultSet.next()) {
            T object = rowMapper.mapRow(resultSet, ++rowNum);
            result.add(object);
        }
        return result;
    }

    default void closedResultSet(ResultSet resultSet) throws Exception {
        resultSet.close();
    }

    default void closedStatement(PreparedStatement statement) throws Exception {
        statement.close();
    }

    default void closedConnection(Connection connection) throws Exception {
        connection.close();
    }

}
