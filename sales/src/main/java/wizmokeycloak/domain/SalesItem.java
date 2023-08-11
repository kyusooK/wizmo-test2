package wizmokeycloak.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesItem {

    private String qty;

    private String price;

    @Embedded
    private ProductId productId;
}
//>>> DDD / Value Object
