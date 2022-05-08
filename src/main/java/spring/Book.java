package spring;

import spring.dao.userDao;

/**
 * @author: baifengxiao
 * @date: 2022/3/24 15:50
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;
    private spring.dao.userDao userDao;

    public spring.dao.userDao getUserDao() {
        return userDao;
    }

    public void setUserDao(spring.dao.userDao userDao) {
        this.userDao = userDao;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBname() {
        return bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public Book(String bname, String bauthor) {
        this.bname = bname;
        this.bauthor = bauthor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                ", userDao='" + userDao + '\'' +
                '}';
    }
}
