package demo.service;

import java.util.List;

import demo.domain.Users;

public interface UserService {

	public Users getUser(String id);

	public List<Users> getUsers();

	public void addUser(Users user);

	public void delete(String id);

}
