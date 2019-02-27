package com.tx02.service;

import com.tx02.dao.Dao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class ServiceImpl implements Service {

    //dao
    private Dao dao;
    public void setDao(Dao dao) {
        this.dao = dao;
    }


    @Override
    public void pay(final String out,final String in,final double money) {

                System.out.println("pay");
                dao.putMoney(out,money);
                dao.inMoney(in,money);

    }
}
