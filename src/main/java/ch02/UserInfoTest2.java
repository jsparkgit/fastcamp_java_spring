package ch02;

public class UserInfoTest2 {

    public static void main(String[] args) {

        UserInfo userLee = new UserInfo();
        userLee.userId = "a123456";
        userLee.userPassWord = "abcdefg";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01012341234";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b12345", "0123kskf111xxxxxx", "Kim");

        System.out.println(userKim.showUserInfo());

    }
}
