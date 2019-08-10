package com.study.patterns.template;

import java.sql.ResultSet;

/**
 * Created by ASUS on 2019/8/10.
 */
public interface RowMapper <T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;

}
