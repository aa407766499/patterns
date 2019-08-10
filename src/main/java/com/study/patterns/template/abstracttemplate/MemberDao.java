package com.study.patterns.template.abstracttemplate;

import com.study.patterns.template.Member;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by ASUS on 2019/8/10.
 */
public class MemberDao extends AbstractJDBCTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<Member> selectAll() throws Exception {
        String sql = "select * from t_member";
        List<Member> memberList = super.executeQuery(sql, (rs, rowNum) -> {
            Member member = new Member();
            member.setUserName(rs.getString("userName"));
            member.setPassword(rs.getString("password"));
            member.setEmail(rs.getString("email"));
            return member;
        }, null);
        return memberList;
    }
}
