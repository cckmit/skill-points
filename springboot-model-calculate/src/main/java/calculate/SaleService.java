package calculate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SaleService {
    /* @Autowired
     NormalUser normalUser;
     @Autowired
     VipUser vipUser;
     public double sale(String userType, double fee) {
         if ("normal".equals(userType)) {
             return normalUser.discount(fee);
         } else if ("vip".equals(userType)) {
             return vipUser.discount(fee);
         }
         return fee;
     }*/
    ConcurrentHashMap<String, ICalculate> concurrentMap = new ConcurrentHashMap<>();

    @Autowired
    //快速查看接口实现类ctrl+alt+B
    public SaleService(List<ICalculate> iCalculates) {
        for (ICalculate iCalculate : iCalculates) {
            concurrentMap.putIfAbsent(iCalculate.userType(), iCalculate);
        }

    }

    public double sale(double fee, String userType) {
        ICalculate iCalculate = concurrentMap.get(userType);

        return iCalculate.discount(fee);
    }

}

