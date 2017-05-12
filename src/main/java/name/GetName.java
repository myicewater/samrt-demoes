package name;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetName
{
    
    private static List<String> source = new ArrayList<String>();
    private static Random rand = new Random();
    
    static{
        String a = "阿安敖艾昂";
        String b = "八巴白百佰办邦包宝保备贝北倍杯本比边标表别冰并波博柏搏帛布";
        String c = "才彩参灿仓层曾茶柴长厂昌晨辰尘成程诚乘骋池赤驰冲崇初传川串创闯春纯词从翠";
        String d = "大哒达带待代袋 丹旦当到刀岛得德等登灯迪滴帝递蒂点典丁叮顶动东栋冬斗度堆对盾多朵";
        String e = "而二尔";
        String f = "发凡帆方非飞分纷风锋峰丰峰福富夫复傅阜";
        String g = "盖干高告皋个哥戈根更工弓共贡巩古估固瓜关冠光广贵过果";
        String h = "哈海汗航杭豪浩昊皓呵禾会合河贺黑恒衡红宏鸿弘虹候乎互化华欢黄惠辉汇慧火";
        String j = "几吉佳甲加家建坚简江匠杰皆金斤今锦京井竞久九玖居巨卷军骏";
        
        String k = "卡凯康可克科肯空口库快魁坤昆";
        String l = "啦来蓝兰览狼浪朗劳乐雷冷棱里立力俩连联炼良凉亮辽列林令六龙隆绿吕仑罗";
        String m = "马麻迈美魅门梦米觅面苗秒妙敏明铭莫某木";
        String n = "耐乃奈南闹内能尼年宁牛弄农努诺";
        String o = "欧";
        String p = "湃盘磐庞朋皮片便品拼平普";
        String q = "七其气千乾前强乔切秦勤青擎庆磬丘秋曲全泉";
        String r = "然饶热任人日荣容如软瑞睿润若";
        String s = "撒洒赛三色森沙山闪尚少设深沈甚生升圣时石史式十始适示世手首数树书术舒双水顺说思斯四松搜速所索";
        String t = "太台泰弹探淘特腾体田天铁廷同通头投透图土团托妥";
        String w = "瓦外万宛丸往望为伟卫位文五";
        String x = "西习下夏先显线相享乡向小效协欣星行兴幸雄秀须许旭轩玄旋选学寻讯迅";
        
        String y = "压雅涯研延炎阳央也耶叶业以一逸易亿亦益宜乙毅义因银引殷音应英赢影鹰永勇用优友右玉与鱼宇元源原远圆月云";
        String z = "在再赞早造则泽择责赠占战章涨丈照召找哲真振珍正争只之至直智致植中众舟州宙主专庄壮追准卓子紫宗总走钻最作座做左";
        
        
        source.add(a);
        source.add(b);
        source.add(c);
        source.add(d);
        source.add(e);
        source.add(f);
        source.add(g);
        source.add(h);
        source.add(j);
        source.add(k);
        source.add(l);
        source.add(m);
        source.add(n);
        source.add(o);
        source.add(p);
        source.add(q);
        source.add(r);
        source.add(s);
        source.add(t);
        source.add(w);
        source.add(x);
        source.add(y);
        source.add(z);
    }
    
    /**
     * 生成一个名字
     * @param length
     * @return
     */
    public static String generateName(int length){
        int m = source.size();
        String name = "";
        for(int i=0;i<length;i++){
            String wordGroup = source.get(rand.nextInt(m));
            int beginIndex  = rand.nextInt(wordGroup.length());
            int endIndex = beginIndex + 1;
            String word = wordGroup.substring(beginIndex, endIndex);
            name += word;
        }
        return name;
        
    }
    
    /**
     * 
     * @param length 名称长度
     * @param num 多少个名字
     */
    public static void generateNames(int length,int num){
        for(int i=0;i<num;i++){
            String name = generateName( length);
            System.out.println(name);
        }
    }
    
    
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        generateNames(2,100);
    }

}
