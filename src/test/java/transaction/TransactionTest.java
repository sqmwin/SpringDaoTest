package transaction;

import com.sqm.transaction.dao.AccountDao;
import com.sqm.transaction.dao.StockDao;
import com.sqm.transaction.exception.StockException;
import com.sqm.transaction.service.StockProcessService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class TransactionTest {
    private ApplicationContext context;
    private StockProcessService service;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("context/spring-transaction-context.xml");
        service = (StockProcessService) context.getBean("stockProcessService");
    }

    //开账户与股票账户
    @Test
    public void init() {
        service.openAccount("sqm", 10000);
        service.openStock("sqmStock", 100);
    }

    //买股票,500元买100股
    @Test
    public void buyStock() throws StockException {
        service.buyStock("sqm", "sqmStock", 500, 100);
    }
}
