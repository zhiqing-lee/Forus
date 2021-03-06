package info.zhiqing.forus.mappers;

import info.zhiqing.forus.models.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by zhiqing on 17-7-30.
 */
public interface UserMapper {

    @Insert("INSERT INTO users(username, nickname, password, email, join_time, avatar, bio)\n" +
            "VALUES (#{username}, #{nickname}, #{password}, #{email}, #{joinTime}, #{avatar}, #{bio})")
    int add(User user);

    @Update("UPDATE users SET nickname=#{nickname}, avatar=#{avatar}, bio=#{bio} WHERE id=#{id}")
    int update(User user);

    @Update("UPDATE users SET status=#{arg1} WHERE username=#{arg0}")
    int updateStatus(String username, int status);

    @Update("UPDATE users SET password=#{arg1} WHERE username=#{arg0}")
    int updatePassword(String username, String password);

    @Delete("DELETE FROM users WHERE id=#{id}")
    int delete(User user);

    @Select("SELECT * FROM users WHERE id=#{id}")
    User findById(long id);

    @Select("SELECT * FROM users WHERE username=#{username}")
    User findByUsername(String username);

    @Select("SELECT * FROM users WHERE email=#{arg0}")
    User findByEmail(String email);

}
