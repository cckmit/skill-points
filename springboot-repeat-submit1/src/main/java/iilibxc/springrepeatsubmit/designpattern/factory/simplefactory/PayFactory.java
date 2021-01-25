package iilibxc.springrepeatsubmit.designpattern.factory.simplefactory;

import iilibxc.springrepeatsubmit.designpattern.factory.*;

public class PayFactory {

    public static IPay createPay(String payType) {
        if (PayTypeEnum.ALI_PAY.getCode().equals(payType)) {
            return new ALiPay();
        }

        if (PayTypeEnum.WE_CHAT_PAY.getCode().equals(payType)) {
            return new WeChatPay();
        }

        if (PayTypeEnum.UNION_PAY.getCode().equals(payType)) {
            return new UnionPay();
        }

        return null;
    }

}
