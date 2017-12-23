package transaction;

import com.sqm.transaction.dao.AccountDao;
import com.sqm.transaction.dao.StockDao;
import com.sqm.transaction.exception.StockException;
import com.sqm.transaction.pojo.Account;
import com.sqm.transaction.pojo.Stock;
import com.sqm.transaction.service.StockProcessService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
        service.openAccount("sqm" + Math.random(), 10000);
        service.openStock("sqmStock" + Math.random(), 100);
    }

    //查询账户
    @Test
    public void find() {
        Stock stock = service.findStock("sqmStock");
        System.out.println(stock);
    }

    //买股票,500元买100股
    @Test
    public void buyStock() throws StockException {
        service.buyStock("sqm4", "sqmStock4", 500, 100);
    }

    //测试foreach
    @Test
    public void foreachTest() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100; i++) {
            map.put(i, i);
        }
        map.forEach((k,v)-> System.out.println("key:" + k + "value" + v));
    }


}
