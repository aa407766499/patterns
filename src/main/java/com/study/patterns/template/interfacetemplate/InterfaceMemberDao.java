package com.study.patterns.template.interfacetemplate;

import com.study.patterns.template.Member;

import java.util.List;

/**
 * Created by ASUS on 2019/8/10.
 */
public class InterfaceMemberDao implements InterfaceJDBCTemplate {

    public List<Member> selectAll() throws Exception {
        String sql = "select * from t_member";
        List<Member> memberList = executeQuery(sql, (rs, rowNum) -> {
            Member member = new Member();
            member.setUserName(rs.getString("userName"));
            member.setPassword(rs.getString("password"));
            member.setEmail(rs.getString("email"));
            return member;
        }, null);
        return memberList;
    }
}
