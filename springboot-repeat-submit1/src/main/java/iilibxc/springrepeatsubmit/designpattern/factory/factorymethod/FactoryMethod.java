package iilibxc.springrepeatsubmit.designpattern.factory.factorymethod;

import iilibxc.springrepeatsubmit.designpattern.factory.IPay;

public interface FactoryMethod {

    IPay createPay(String payType);

}
