package calculate;

import org.springframework.stereotype.Service;

@Service
public class VipUser implements ICalculate {
    @Override
    public String userType() {
        return "vip";
    }

    @Override
    public double discount(double fee) {
        return fee * 0.5;
    }
}
