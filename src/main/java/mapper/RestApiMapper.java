package mapper;

import com.example.postgrecrud.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestApiMapper {

    public List<UserVO> selectAllUser() throws Exception;

    public List<UserVO> selectUser(String user_id) throws Exception;

    public int insertUser(UserVO vo) throws Exception;

    public int updateUser(UserVO vo) throws Exception;

    public int deleteUser(String user_id) throws Exception;

}
