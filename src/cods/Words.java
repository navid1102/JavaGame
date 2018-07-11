package cods;

import swing.Frameplay;
import swing.Name_family;

/**
 * Created by KarAmad-user on 2/28/2018.
 */
public class Words
{
    Frameplay frameplay=new Frameplay();
    Frist_Char fristChar=new Frist_Char();
    Name_family nf=new Name_family();
     private String name=frameplay.game_txtname.getText();
     private String family=frameplay.game_txtfamily.getText();
     private String animal=frameplay.game_txtanimal.getText();
     private String food=frameplay.game_txtfood.getText();
     private String color=frameplay.game_txtcolor.getText();
     private String car=frameplay.game_txtcar.getText();
     private String country=frameplay.game_txtcountry.getText();
     private String city=frameplay.game_txtcity.getText();
     private String fruit=frameplay.game_txtfruit.getText();
     private String object=frameplay.game_txtobject.getText();
    private char strFristChar=fristChar.ch(nf.LanLbl());
    private String jname =frameplay.java_txtname.getText();
    private String jfamily;
    private String janimal;
    private String jfood;
    private String jcolor;
    private String jcar;
    private String jcountry;
    private String jcity;
    private String jfruit;
    private String jobject;

    public String getName() {
       // name=frameplay.game_txtname.getText();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
       // family=frameplay.game_txtfamily.getText();
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAnimal() {
        //animal=frameplay.game_txtanimal.getText();
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getFood() {
        //food=frameplay.game_txtfood.getText();
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        //color=frameplay.game_txtcolor.getText();
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        //car=frameplay.game_txtcar.getText();
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCountry() {
      //  country=frameplay.game_txtcountry.getText();
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public char getStrFristChar() {
        return strFristChar;
    }

    public void setStrFristChar(char strFristChar) {
        this.strFristChar = strFristChar;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getJfamily() {
        return jfamily;
    }

    public void setJfamily(String jfamily) {
        this.jfamily = jfamily;
    }

    public String getJanimal() {
        return janimal;
    }

    public void setJanimal(String janimal) {
        this.janimal = janimal;
    }

    public String getJfood() {
        return jfood;
    }

    public void setJfood(String jfood) {
        this.jfood = jfood;
    }

    public String getJcolor() {
        return jcolor;
    }

    public void setJcolor(String jcolor) {
        this.jcolor = jcolor;
    }

    public String getJcar() {
        return jcar;
    }

    public void setJcar(String jcar) {
        this.jcar = jcar;
    }

    public String getJcountry() {
        return jcountry;
    }

    public void setJcountry(String jcountry) {
        this.jcountry = jcountry;
    }

    public String getJcity() {
        return jcity;
    }

    public void setJcity(String jcity) {
        this.jcity = jcity;
    }

    public String getJfruit() {
        return jfruit;
    }

    public void setJfruit(String jfruit) {
        this.jfruit = jfruit;
    }

    public String getJobject() {
        return jobject;
    }

    public void setJobject(String jobject) {
        this.jobject = jobject;
    }
}
