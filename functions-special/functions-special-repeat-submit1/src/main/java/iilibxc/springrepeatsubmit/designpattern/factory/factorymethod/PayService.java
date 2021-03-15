package iilibxc.springrepeatsubmit.designpattern.factory.factorymethod;

import iilibxc.springrepeatsubmit.designpattern.factory.IPay;

public class PayService {

    public void pay(String payType) {
        FactoryMethod aFactory = new AFactory();
        IPay pay = aFactory.createPay(payType);

    }

}
