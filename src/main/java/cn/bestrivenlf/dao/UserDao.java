package cn.bestrivenlf.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.bestrivenlf.entity.User;
@Repository
public interface UserDao {
	@Select("select * from vuser_tb where del_flag = 0 and username = #{username}")
	public User getUser(String username);
}
