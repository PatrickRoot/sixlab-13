/**
 * @Copyright © Sixlab 2014
 * @author 六楼的雨/loki
 * @email <nianqinianyi@163.com>
 */
package cn.sixlab.sixrecords.base;

import cn.sixlab.sixrecords.base.util.D;
import org.nutz.dao.Dao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * //TODO
 *
 * @author 六楼的雨/loki
 * @date 2014/12/28 19:10
 */
@Service
public class BaseBusiness {
    public static Logger logger = LoggerFactory.getLogger(BaseController.class);
    public Dao dao = D.nutzDao();

}
