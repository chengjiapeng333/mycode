package example.repo.impl;

import example.pojo.Spittle;
import example.repo.SpittleRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by chengjiapeng on 2018/5/11.
 */
@Service
public class SpittleRepositoryImpl implements SpittleRepository{
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittleList = new ArrayList<Spittle>();
        for(int i=0; i<count;i++) {
            spittleList.add(new Spittle((long)i,"Spittle "+i, new Date(), 123.456, 456.789));
        }
        return spittleList;
    }
}
