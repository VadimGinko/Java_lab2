package com.company;

import java.util.Objects;
/**
 * @autor Vadim Ginko
 * @version 1.5
 */
public class WrapperString {

    private String value = new String();
    private String count = new String();

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public WrapperString(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, count);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "value='" + value + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
    /**
     * @param old - старый символ
     * @param new7c - новый символ
     * @return возвращает название производителя
     */
    public void Replace (char old, char new7c) {
        this.setValue(this.getValue().replace(old, new7c));
    }
}
