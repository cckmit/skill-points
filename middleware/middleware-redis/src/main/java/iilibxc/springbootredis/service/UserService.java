package iilibxc.springbootredis.service;


import iilibxc.springbootredis.model.User;

public interface UserService {
	
    public User getUserById(long userId);
    public User updateUserNickname(long userId, String nickname);
}