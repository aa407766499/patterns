package com.study.patterns.template.abstracttemplate;

import com.study.patterns.template.Member;

import java.util.List;

/**
 * Created by ASUS on 2019/8/10.
 */
public class MemberDaoTest {

    public static void main(String[] args) throws Exception {
        MemberDao memberDao = new MemberDao(null);
        List<Member> members = memberDao.selectAll();
    }

}
