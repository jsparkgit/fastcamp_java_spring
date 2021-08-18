package ch03;

public class UserInfoOracleDao implements  UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("Insert into Oracle DB userID= " + userinfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID=" + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID= " + userInfo.getUserId());
    }
}
