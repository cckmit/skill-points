package com.designpattern.factory.factorymethod;

import com.designpattern.factory.IPay;

public interface FactoryMethod {

    IPay createPay(String payType);

}
