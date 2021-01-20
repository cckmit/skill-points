package iilibxc.future.mapper;

import iilibxc.future.entity.User;

public interface UserMapper {
    User selectID(User user);

    User selectName(User user);

    User selectCreateTime(User user);
}
