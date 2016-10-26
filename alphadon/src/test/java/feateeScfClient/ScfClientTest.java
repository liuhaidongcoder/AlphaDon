package feateeScfClient;

import com.alphadon.conf.ConfigurePath;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Liu Haidong
 * @date 16/7/25
 */

public class ScfClientTest {
    @Test
    public void testScfClient(){
      /*  //加载配置文件
        SCFInit.init(ConfigurePath.SCFCONFIG_PATH);
        final String url = "tcp://feaservice/CtrFeaService";
        ICtrFeaService CtrFeaService  = ProxyFactory.create(ICtrFeaService.class,url);

        List<String> list = new ArrayList<String>();

        String[] strings = new String[]{"26519945568682","26741823829187"};
        list.addAll(Arrays.asList(strings));

        List<CtrFeaEntity> ctrFeaEntityList = new ArrayList<CtrFeaEntity>();
        try {
            ctrFeaEntityList =  CtrFeaService.getCtrFeaByAdsIDs("JzCtrAgg",list);
            for (CtrFeaEntity ctrFeaEntity: ctrFeaEntityList) {
                System.out.println("最近五分钟 广告:"+ ctrFeaEntity.getAdId()  + " 点击量:" + ctrFeaEntity.getClickAmounts() + " 展现量:" + ctrFeaEntity.getShowAmounts() + " 点击率:" +
                        ctrFeaEntity.getCtr());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
