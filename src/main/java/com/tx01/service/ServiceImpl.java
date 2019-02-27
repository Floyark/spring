package com.tx01.service;

import com.tx01.dao.Dao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class ServiceImpl implements Service {

    //事务管理
    private TransactionTemplate transactionTemplate;
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    //dao
    private Dao dao;
    public void setDao(Dao dao) {
        this.dao = dao;
    }


    @Override
    public void pay(final String out,final String in,final double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                System.out.println("pay");
                dao.putMoney(out,money);
                dao.inMoney(in,money);
                System.out.println("-------------"+transactionStatus.isNewTransaction()+"-------------");
            }
        });

    }
}
