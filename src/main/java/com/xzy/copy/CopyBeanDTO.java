package com.xzy.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Created by RuzzZZ on 2017/2/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CopyBeanDTO implements Serializable {
    private static final long serialVersionUID = 2977329629013865582L;
    private int        intValue;
    private boolean    boolValue;
    private float      floatValue;
    private double     doubleValue;
    private long       longValue;
    private char       charValue;
    private byte       byteValue;
    private short      shortValue;
    private Integer    integerValue;
    private Boolean    boolObjValue;
    private Float      floatObjValue;
    private Double     doubleObjValue;
    private Long       longObjValue;
    private Short      shortObjValue;
    private Byte       byteObjValue;
    private BigInteger bigIntegerValue;
    private BigDecimal bigDecimalValue;
    private String     stringValue;


    public boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
