package swing;


import dbs.DBConnectionManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;


//this class is for creat a btn panle that now is no active

public class BtnPanel extends Frameplay implements ActionListener
{

    public Connection connection;
    public Statement statement;

    public JButton btn_name = null;
    public JButton btn_family = null;
    public JButton btn_animal = null;
    public JButton btn_food = null;
    public JButton btn_color = null;
    public JButton btn_car = null;
    public JButton btn_country = null;
    public JButton btn_city = null;
    public JButton btn_fruit = null;
    public JButton btn_object = null;
    public JPanel panel_btn=null;


    public ArrayList name_data=null;
    public  ArrayList family_data=null;
    public  ArrayList animal_data=null;
    public  ArrayList food_data=null;
    public  ArrayList color_data=null;
    public  ArrayList car_data=null;
    public  ArrayList country_data=null;
    public  ArrayList city_data=null;
    public  ArrayList object_data=null;
    public  ArrayList fruit_data=null;


    public String NAnswer;
    public String FAnswer;
    public String AAnswer;
    public String FoodAnswer;
    public String ColorAnswer;
    public String CarAnswer;
    public String CountryAnswer;
    public String CityAnswer;
    public String FruitAnswer;
    public String ObjectAnswer;





    //=========================================================
    static {
        try {
            Class.forName(DBConnectionManager.CLASS_NAME);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
//===========================================================

  /*  public void setPanel_btn()
    {
        panel_btn=new JPanel();
        panel_btn.setBounds(10, 50, 100, 550);
        panel_btn.setVisible(true);
        panel_btn.setBackground(Color.white);
        panel_btn.setLayout(null);
        frameplay.add(panel_btn);


    }*/

    public void set_btn() {

        panel_btn=new JPanel();
        panel_btn.setBounds(10,50, 100, 550);
        panel_btn.setVisible(true);
        panel_btn.setBackground(Color.black);
        panel_btn.setLayout(null);
        //frameplay.add(panel_btn);

        btn_name = new JButton("insert");
        btn_name.setBounds(0, 30, 100, 30);
        btn_name.setName("btn_name");
        btn_name.addActionListener(this);
        panel_btn.add(btn_name);


        btn_family = new JButton("insert");
        btn_family.setBounds(0, 80, 100, 30);
        btn_family.setName("btn_family");
        btn_family.addActionListener(this);
        panel_btn.add(btn_family);


        btn_animal = new JButton("insert");
        btn_animal.setBounds(0, 130, 100, 30);
        btn_animal.setName("btn_animal");
        btn_animal.addActionListener(this);
        panel_btn.add(btn_animal);


        btn_food = new JButton("insert");
        btn_food.setBounds(0, 180, 100, 30);
        btn_food.setName("btn_food");
        btn_food.addActionListener(this);
        panel_btn.add(btn_food);


        btn_color = new JButton("insert");
        btn_color.setBounds(0, 230, 100, 30);
        btn_color.setName("btn_color");
        btn_color.addActionListener(this);
        panel_btn.add(btn_color);



        btn_car = new JButton("insert");
        btn_car.setBounds(0, 280, 100, 30);
        btn_car.setName("btn_car");
        btn_car.addActionListener(this);
        panel_btn.add(btn_car);


        btn_country = new JButton("insert");
        btn_country.setBounds(0, 330, 100, 30);
        btn_country.setName("btn_country");
        btn_country.addActionListener(this);
        panel_btn.add(btn_country);


        btn_city = new JButton("insert");
        btn_city.setBounds(0, 380, 100, 30);
        btn_city.setName("btn_city");
        btn_city.addActionListener(this);
        panel_btn.add(btn_city);


        btn_fruit = new JButton("insert");
        btn_fruit.setBounds(0, 430, 100, 30);
        btn_fruit.setName("btn_fruit");
        btn_fruit.addActionListener(this);
        panel_btn.add(btn_fruit);



        btn_object = new JButton("insert");
        btn_object.setBounds(0, 480, 100, 30);
        btn_object.setName("btn_object");
        btn_object.addActionListener(this);
        panel_btn.add(btn_object);


    }
//==================================================================
    public void create_open_connection() {
        try {
            connection = DriverManager.getConnection(DBConnectionManager.URL, DBConnectionManager.USER, DBConnectionManager.PASS);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    //===============================================================
    public void create_statement() {
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
//------------------------------------------------------------------------------

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    //-------------------------------------------------------------------------------
    public void close_statement() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    //------------------------------------------------------------------------------

    public int insert(String word,String tblN) {
        int return_val = 0;
        try {
            return_val = statement.executeUpdate("insert into " + tblN + "( inventory ) values('" + word + "')");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return return_val;
    }

//===============================================================
public ArrayList<String> select(String name_tbl,String fch)
{
    ArrayList<String> result=new ArrayList<>();
    try {
        create_open_connection();
        create_statement();

        ResultSet resultSet=statement.executeQuery("SELECT inventory from "+name_tbl+" where inventory like '"+fch+"%'");

        while (resultSet.next())
        {
            result.add(resultSet.getString("inventory"));

        }
        //System.out.println(result.get(1));
    }
    catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }

    return result;
}

    //==========================================================
    public void get_data_from_db(String startchar)
    {
        name_data=new ArrayList();
        family_data=new ArrayList();
        animal_data=new ArrayList();
        food_data=new ArrayList();
        color_data=new ArrayList();
        car_data=new ArrayList();
        country_data=new ArrayList();
        city_data=new ArrayList();
        fruit_data=new ArrayList();
        object_data=new ArrayList();


        //Name_family nf=new Name_family();
        Random random=new Random();
        FinishFrame finishframe=new FinishFrame();
        //Frameplay frameplay=new Frameplay();
// Frist_Char fchar=new Frist_Char();
// name_data=finishFrame.select();

        name_data=finishframe.select("name",startchar);
        family_data=finishframe.select("family",startchar);
        animal_data=finishframe.select("animals",startchar);
        food_data=finishframe.select("foods",startchar);
        color_data=finishframe.select("colors",startchar);
        car_data=finishframe.select("cars",startchar);
        country_data=finishframe.select("countrys",startchar);
        city_data=finishframe.select("citys",startchar);
        fruit_data=finishframe.select("fruits",startchar);
        object_data=finishframe.select("objects",startchar);



        try {
            { if( name_data.size()<1)
            {
                NAnswer="";
            }
            else {
                NAnswer=(name_data.get(random.nextInt(name_data.size()))+"");
                System.out.println("truuuuuuuuuuueee");}}


            {
                if (family_data.size()<1)
                {
                    FAnswer="";
                }
                else
                {FAnswer=(family_data.get(random.nextInt(family_data.size()))+"");
                }}


            { if (animal_data.size()<1)
            {
                AAnswer="";
            }
            else
            {AAnswer=(animal_data.get(random.nextInt(animal_data.size()))+"");
            }}


            { if (food_data.size()<1)
            {
              FoodAnswer="";
            }
            else
            {
                FoodAnswer=(food_data.get(random.nextInt(food_data.size()))+"");
            }}


            { if (color_data.size()<1)
            {
             ColorAnswer ="";
            }
            else
            {
                ColorAnswer=(color_data.get(random.nextInt(color_data.size()))+"");
            }}


            { if (car_data.size()<1)
            {
                CarAnswer="";
            }
            else
            {
                CarAnswer=(car_data.get(random.nextInt(car_data.size()))+"");
            }}

            { if (country_data.size()<1)
            {
                CountryAnswer="";
            }
            else
            {
                CountryAnswer=(country_data.get(random.nextInt(country_data.size()))+"");
            }}

            { if (city_data.size()<1)
            {
                CityAnswer="";
            }
            else
            {
                CityAnswer=(city_data.get(random.nextInt(city_data.size()))+"");
            }}

            { if (fruit_data.size()<1)
            {
                FruitAnswer="";
            }
            else
            {
                FruitAnswer=(fruit_data.get(random.nextInt(fruit_data.size()))+"");
            }}

            { if (object_data.size()<1)
            {
                ObjectAnswer="";
            }
            else
            {
                ObjectAnswer=(object_data.get(random.nextInt(object_data.size()))+"");
            }}




        }catch (Exception e){
            System.out.println("ooooofffffff");
        }

    }

    //===========================================================

    @Override
    public void actionPerformed(ActionEvent e) {

        Frameplay frameplay=new Frameplay();

        Object o = e.getSource();
        if (o instanceof JButton) ;
        {
            String jButton_name = ((JButton) o).getName();
            if (jButton_name.equals("btn_name")) {
                String words =frameplay.game_txtname.getText();
                String tblN="name";
                create_open_connection();
                create_statement();
                int return_val = insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }
            if (jButton_name.equals("btn_family"))
            {
                String words=frameplay.game_txtfamily.getText();
                String tblN="family";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }
            if (jButton_name.equals("btn_animal"))
            {
                String words=frameplay.game_txtanimal.getText();
                String tblN="animals";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_food"))
            {
                String words=frameplay.game_txtfood.getText();
                String tblN="foods";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_color"))
            {
                String words=frameplay.game_txtcolor.getText();
                String tblN="colors";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_car"))
            {
                String words= frameplay.game_txtcar.getText();
                String tblN="cars";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_country"))
            {
                String words=frameplay.game_txtcountry.getText();
                String tblN="countrys";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_city"))
            {
                String words=frameplay.game_txtcity.getText();
                String tblN="citys";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_fruit"))
            {
                String words=frameplay.game_txtfruit.getText();
                String tblN="fruits";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }

            if (jButton_name.equals("btn_object"))
            {
                String words=frameplay.game_txtobject.getText();
                String tblN="objects";
                create_open_connection();
                create_statement();
                int return_val=insert(words,tblN);
                close_statement();
                closeConnection();
                showMessageDialog(return_val + " Record insert.");
            }
        }
    }

    public void showMessageDialog(String msg) {

        Frameplay frameplay=new Frameplay();
        JOptionPane.showMessageDialog(frameplay.frameplay, msg);
    }

    public  void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BtnPanel btnPanel = new BtnPanel();
               // btnPanel.setPanel_btn();
                btnPanel.set_btn();
            }
        });
    }

    public String get_name(String name)
    {
        return name;
    }
    public String get_family(String family)
    {
        return family;
    } public String get_animal(String animal)
{
    return animal;
} public String get_food(String food)
{
    return food;
} public String get_color(String color)
{
    return color;
} public String get_car(String car)
{
    return car;
} public String get_country(String country)
{
    return country;
} public String get_city(String city)
{
    return city;
} public String get_fruit(String fruit)
{
    return fruit;
} public String get_object(String object)
{
    return object;
}

    }






























