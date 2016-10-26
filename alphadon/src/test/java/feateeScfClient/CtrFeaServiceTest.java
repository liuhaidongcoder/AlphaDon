package feateeScfClient;

import org.junit.Test;

/**
 * @author Liu Haidong
 * @date 16/7/22
 */

public class CtrFeaServiceTest {
    private static final int TEST_TABLE = 7;
    @Test
    public void testWtable(){
        /*try {
            // 根据配置文件初始化WTable客户端
            WtableClient client = WtableUtil.getInstance();

            DumpReply dr= null;
            while(dr == null || !dr.isEnd()){
                if (dr == null){
                    dr = client.dumpTable(TEST_TABLE);
                }else{
                    dr = client.dumpMore(dr);
                }

                for(int i = 0; i < dr.getKvs().size(); i++) {
                    DumpKV kv = dr.getKvs().get(i);

                    byte[] rowKey = kv.getRowKey();
                    try {
                        ScanReply sr = null;
                        while(sr == null || !sr.isEnd()) {
                            if(sr == null) {
                                // 按照colKey升序拉取，一次拉取100条记录
                                sr = client.scan(TEST_TABLE, rowKey, true, 100);
                            } else {
                                // 如果还没拉取完毕，继续拉取
                                sr = client.scanMore(sr);
                            }

                            RatioOperand<Number,Number> totalatioOperand = new RatioOperand<Number, Number>(0,0);
                            for(int  j = 0; j < sr.getKvs().size(); j++) {
                                ScanKV sv = sr.getKvs().get(j);

                                ByteArrayInputStream bais = new ByteArrayInputStream(sv.getValue());
                                ObjectInputStream in = new ObjectInputStream(bais);
                                RatioOperand value = (RatioOperand)in.readObject();

                                totalatioOperand.setNumerator(totalatioOperand.getNumerator().intValue() + value.getNumerator().intValue());
                                totalatioOperand.setDenominator(totalatioOperand.getDenominator().intValue() + value.getDenominator().intValue());
								*//*System.out.printf("scanExample: colKey=%s, value=%s, score=%d,ttl=%d,点击量=%d,展现量=%d\n",
										new String(sv.getColKey()), new String(sv.getValue()), sv.getScore(),sv.getTtl(),value.getNumerator(),value.getDenominator()); *//*
                            }
                            if(sr.isEnd()){
                                System.out.printf("rowKey=%s  colkey=%d个数"+"  "+"五分钟的点击量=%d, 五分钟的展现量=%d\n",
                                        new String(rowKey),sr.getKvs().size(),totalatioOperand.getNumerator(),totalatioOperand.getDenominator());
                            }

                        }
                    } catch (WtableException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

        } catch (WtableException e) {
            e.printStackTrace();
            return;
        }*/
    }
    @Test
    public void testGetCtrFeaByAdsIDs() throws Exception {

      /*  CtrFeaService ctrFeaService = new CtrFeaService();
        Operator operator = new JzCtrAgg();
        List<String> list = new ArrayList<String>();

        String[] strings = new String[]{"26519945568682","26741823829187"};
        list.addAll(Arrays.asList(strings));

        List<CtrFeaEntity> ctrFeaEntityList = new ArrayList<CtrFeaEntity>();
        ctrFeaEntityList = ctrFeaService.getCtrFeaByAdsIDs(operator,list);
        for (CtrFeaEntity ctrFeaEntity: ctrFeaEntityList) {
            System.out.println("最近五分钟 广告:"+ ctrFeaEntity.getAdId()  + " 点击量:" + ctrFeaEntity.getClickAmounts() + " 展现量:" + ctrFeaEntity.getShowAmounts() + " 点击率:" +
            ctrFeaEntity.getCtr());
        }*/
    }
}
