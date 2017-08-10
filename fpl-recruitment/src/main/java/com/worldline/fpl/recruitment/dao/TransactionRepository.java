package com.worldline.fpl.recruitment.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.worldline.fpl.recruitment.entity.Transaction;

/**
 * Transaction repository
 * 
 * @author A525125
 *
 */
public interface TransactionRepository {

	/**
	 * Get transaction by Id
	 *
	 * @param id
	 *            id of the transaction to get
	 * @return the transaction corresponding to the given id or null
	 */
	Transaction findById(String id);

	/**
	 * Get transactions by account
	 * 
	 * @param accountId
	 *            the account id
	 * @param p
	 *            the pageable information
	 * @return
	 */
	Page<Transaction> getTransactionsByAccount(String accountId, Pageable p);

	/**
	 * Check if an transaction exists
	 * 
	 * @param transactiontId
	 *            the transaction id
	 * @return true if the transaction exists
	 */
	boolean exists(String transactiontId);

	/**
	 * Remove transaction
	 * 
	 * @param transactionId
	 *            the transaction id
	 * @return
	 */
	void removeTransaction(String transactionId);
}
