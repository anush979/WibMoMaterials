package repository;

import entity.Account;

public interface AccountRepository {
	public Account findAccountById(int accountId);
	public void update(Account account);

}
