package iilibxc.rmq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Info {
    private Integer id;
    private String info;
    private Date date;
    private boolean flag;
    private List<String> list;
    private Map<Integer, String> map;
}
