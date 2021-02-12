package com.rab3tech.customer.service.impl;

import com.rab3tech.admin.dao.repository.MagicCustomerRepository;
import com.rab3tech.customer.dao.repository.CustomerAccountInfoRepository;
import com.rab3tech.customer.dao.repository.PayeeInfoRepository;
import com.rab3tech.dao.entity.PayeeInfo;
import com.rab3tech.vo.PayeeInfoVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class PayeeInfoServiceImpTest {

    @Mock
    private MagicCustomerRepository customerRepository;

    @Mock
    private PayeeInfoRepository payeeInfoRepository;

    @Mock
    private CustomerAccountInfoRepository customerAccountInfoRepository;

    @InjectMocks
    PayeeInfoServiceImp payeeInfoServiceImp;

    @Test
    public void savePayee() {


    }

    @Test
    public void getAllPayee() {
        PayeeInfoVO payeeInfoVO1 = new PayeeInfoVO(1234, "12345","Shanker","shank",
                "12345", "Remarks", "true", 12);

        PayeeInfoVO payeeInfoVO2 = new PayeeInfoVO(1234, "12345","Shanker","shank",
                "12345", "Remarks", "true", 12);


    }

    @Test
    public void deletePayee() {
    }

    @Test
    public void updatePayee() {
    }
}