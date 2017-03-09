package goagomath;

import java.math.BigDecimal;

/**
 * 数据运算（+，-，*，/）
 * @author LiDY
 *
 */
public class MathUtils
{
    /**
     * 进行加法运算
     * @param d1
     * @param d2
     * @return
     */
    public static Double add(Double d1, Double d2)
    {
        BigDecimal b1 = new BigDecimal(String.valueOf(d1));
        BigDecimal b2 = new BigDecimal(String.valueOf(d2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 进行减法运算
     * @param d1
     * @param d2
     * @return
     */
    public static Double sub(Double d1, Double d2)
    {
        BigDecimal b1 = new BigDecimal(String.valueOf(d1));
        BigDecimal b2 = new BigDecimal(String.valueOf(d2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 进行乘法运算
     * @param d1
     * @param d2
     * @return
     */
    public static Double mul(Double d1, Double d2)
    {
        BigDecimal b1 = new BigDecimal(String.valueOf(d1));
        BigDecimal b2 = new BigDecimal(String.valueOf(d2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 进行除法运算
     * @param d1
     * @param d2
     * @param len
     * @return
     */
    public static Double div(Double d1, Double d2, int len)
    {
        BigDecimal b1 = new BigDecimal(String.valueOf(d1));
        BigDecimal b2 = new BigDecimal(String.valueOf(d2));
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 进行四舍五入    操作
     * @param d
     * @param len
     * @return
     */
    public static Double round(Double d, int len)
    {
        BigDecimal b1 = new BigDecimal(d);
        BigDecimal b2 = new BigDecimal(1);
        // 任何一个数字除以1都是原数字
        // ROUND_HALF_UP是BigDecimal的一个常量，    表示进行四舍五入的操作
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
