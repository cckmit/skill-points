package calculate;

import org.springframework.stereotype.Service;

@Service
public class NormalUser implements ICalculate {
    @Override
    public String userType() {
        return "normal";
    }

    @Override
    public double discount(double fee) {
        return fee * 1.0;
    }
}
