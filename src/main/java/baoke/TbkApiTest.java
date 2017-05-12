package baoke;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.response.TbkItemGetResponse;

public class TbkApiTest
{

    /**
     * @param args
     * @throws ApiException 
     */
    public static void main(String[] args) throws ApiException
    {
        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "23776032", "c5c051f57c7db5a198bb4d53294db097");
        TbkItemGetRequest req = new TbkItemGetRequest();
        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url,seller_id,volume,nick");
        req.setQ("女装");
        req.setCat("16,18");
        req.setSort("tk_rate_des");
        
        TbkItemGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }   

}
