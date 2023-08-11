package wizmokeycloak.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import wizmokeycloak.domain.*;
import wizmokeycloak.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Produced extends AbstractEvent {

    private String salesOrderNumber;
    private String salesPerson;
    private SalesType salesType;
    private CompanyId companyId;
    private List<SalesItem> salesItems;
    private String status;

    public Produced(SalesOrder aggregate) {
        super(aggregate);
    }

    public Produced() {
        super();
    }
}
//>>> DDD / Domain Event
