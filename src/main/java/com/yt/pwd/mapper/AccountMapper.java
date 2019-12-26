package com.yt.pwd.mapper;


import com.yt.pwd.bean.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountMapper {



    @Insert("insert into account(account,pwd) values(#{account},#{pwd})")
    int insert(Account account);

    // 查询全部
    @Select("SELECT * FROM account")
    List<Account> selectAll();




    // 更新 value
    @Update("UPDATE pwd SET value=#{value} WHERE id=#{id}")
    int updateValue(Account model);

    // 根据 ID 删除
    @Delete("DELETE FROM pwd WHERE id=#{id}")
    int delete(Integer id);

}
