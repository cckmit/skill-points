package iilibxc.springrepeatsubmit.designpattern.factory.factorymethod;

import iilibxc.springrepeatsubmit.designpattern.factory.IPay;

public class AFactory implements FactoryMethod {

    @Override
    public IPay createPay(String payType) {
        return null;
    }

}
