package org.gitor.kettledemo.common;/** * @author : liuwenlong * @date : 2018/12/14 18:28 */public class Constant {    /**     * 资源库类型     */    public enum repoType{        DATA_BASE(1),        FILE(2);        private int value;        repoType(int i){            this.value = i;        }        public int value(){            return this.value;        }    }}