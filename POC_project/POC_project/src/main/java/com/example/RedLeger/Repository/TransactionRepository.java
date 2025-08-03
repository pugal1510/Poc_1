package com.example.RedLeger.Repository;

import com.example.RedLeger.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // Define custom query methods if needed
    // For example:
    // List<Transaction> findByUserId(Long userId);
    // Optional<Transaction> findById(Long id);q
}
