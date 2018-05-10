package example.repo;

import example.pojo.Spittle;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by chengjiapeng on 2018/5/11.
 */
@Repository
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
