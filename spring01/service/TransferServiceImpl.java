package service;

import repository.AccountRepository;
import entity.Account;

public class TransferServiceImpl implements TransferService{
	private AccountRepository accountRepository;
	public TransferServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	public void transfer(int fromAccNum, int toAccNum, int amount) {
		System.out.println("Transfereing.....");
		Account fromAccount = accountRepository.findAccountById(fromAccNum);
		Account toAccount = accountRepository.findAccountById(toAccNum);
		fromAccount.credit(amount);
		toAccount.debit(amount);
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);
		
	}

}
