/**
 * <h3>java FramPlay class in swing package</h3>
 * <subject>this class is for build a frame for insert a true data in data base</subject>
 * @author Navid Farhadi
 * @since 1396/9/16
 * @version 1
 */

package swing;

import cods.Frist_Char;
import dbs.DBConnectionManager;

import javax.lang.model.element.Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class FinishFrame  implements ActionListener {

 public Connection connection;
 public Statement statement;

 public JFrame finish_fram = null;
 public JPanel panel1 = null;
 public JLabel insert_data=null;
 public JTextField name_field = null;
 public JTextField family_field = null;
 public JTextField animal_field = null;
 public JTextField food_field = null;
 public JTextField color_field = null;
 public JTextField car_field = null;
 public JTextField country_field = null;
 public JTextField city_field = null;
 public JTextField object_field = null;
 public JTextField fruit_field = null;

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

 public JTextField name_field2 = null;
 public JTextField family_field2 = null;
 public JTextField animal_field2 = null;
 public JTextField food_field2 = null;
 public JTextField color_field2 = null;
 public JTextField car_field2 = null;
 public JTextField country_field2 = null;
 public JTextField city_field2 = null;
 public JTextField object_field2 = null;
 public JTextField fruit_field2 = null;

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

 public String NameAnswer;
 public String FamilyAnswer;
 public String AnimalAnswer;
 public String FoodAnswer;
 public String ColorAnswer;
 public String CarAnswer;
 public String CountryAnswer;
 public String CityAnswer;
 public String FruitAnswer;
 public String ObjectAnswer;


 //--------------------------------------------------------------------------------


 //------------------------------------------------------------------------------
 static {
  try {
   Class.forName(DBConnectionManager.CLASS_NAME);
  } catch (ClassNotFoundException e) {
   System.err.println(e.getMessage());
  }
 }
 //---------------------------------------------------------------------------------


 public void creat_view(String name,String family,String animal,String food,String color,String car,String country,String city,String fruit,String object) {
  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
  int sw = dimension.width / 2-120;
  int sh = dimension.height / 2 + 150;
  finish_fram = new JFrame("the end frame");
  finish_fram.setLayout(null);
  finish_fram.setBounds(sw / 2, sh / 2 - 70, sw, sh);
  finish_fram.setResizable(false);
 // finish_fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  panel1 = new JPanel();
  panel1.setBounds(0, 0, sw, sh);
  panel1.setBackground(Color.cyan);
  panel1.setLayout(null);


  insert_data=new JLabel();
  insert_data.setBounds(160, 10, 500, 30);
  insert_data.setText("داده های صحیح را داخل حافظه ذخیره کنید !");
  insert_data.setFont(new Font("Areya",Font.BOLD,18));



  name_field = new JTextField(name);
  name_field.setBounds(10, 50, 200, 30);


  family_field = new JTextField(family);
  family_field.setBounds(10, 90, 200, 30);

  animal_field = new JTextField(animal);
  animal_field.setBounds(10, 130, 200, 30);


  food_field = new JTextField(food);
  food_field.setBounds(10, 170, 200, 30);


  color_field = new JTextField(color);
  color_field.setBounds(10, 210, 200, 30);


  car_field = new JTextField(car);
  car_field.setBounds(10, 250, 200, 30);


  country_field = new JTextField(country);
  country_field.setBounds(10, 290, 200, 30);


  city_field = new JTextField(city);
  city_field.setBounds(10, 330, 200, 30);


  fruit_field = new JTextField(fruit);
  fruit_field.setBounds(10, 370, 200, 30);


  object_field = new JTextField(object);
  object_field.setBounds(10, 410, 200, 30);


  btn_name = new JButton("insert");
  if(name.equals(""))
  {
   btn_name.setVisible(false);
  }
  btn_name.setBounds(230, 50, 100, 30);
  btn_name.setName("btn_name");
  btn_name.addActionListener(this);


  btn_family = new JButton("insert");
  if(family.equals(""))
  {
   btn_family.setVisible(false);
  }
  btn_family.setBounds(230, 90, 100, 30);
  btn_family.setName("btn_family");
  btn_family.addActionListener(this);


  btn_animal = new JButton("insert");
  if(animal.equals(""))
  {
   btn_animal.setVisible(false);
  }
  btn_animal.setBounds(230, 130, 100, 30);
  btn_animal.setName("btn_animal");
  btn_animal.addActionListener(this);


  btn_food = new JButton("insert");
  if(food.equals(""))
  {
   btn_food.setVisible(false);
  }
  btn_food.setBounds(230, 170, 100, 30);
  btn_food.setName("btn_food");
  btn_food.addActionListener(this);


  btn_color = new JButton("insert");
  if(color.equals(""))
  {
   btn_color.setVisible(false);
  }
  btn_color.setBounds(230, 210, 100, 30);
  btn_color.setName("btn_color");
  btn_color.addActionListener(this);


  btn_car = new JButton("insert");
  if(car.equals(""))
  {
   btn_car.setVisible(false);
  }
  btn_car.setBounds(230, 250, 100, 30);
  btn_car.setName("btn_car");
  btn_car.addActionListener(this);


  btn_country = new JButton("insert");
  if(country.equals(""))
  {
   btn_country.setVisible(false);
  }
  btn_country.setBounds(230, 290, 100, 30);
  btn_country.setName("btn_country");
  btn_country.addActionListener(this);


  btn_city = new JButton("insert");
  if(city.equals(""))
  {
   btn_city.setVisible(false);
  }
  btn_city.setBounds(230, 330, 100, 30);
  btn_city.setName("btn_city");
  btn_city.addActionListener(this);


  btn_fruit = new JButton("insert");
  if(fruit.equals(""))
  {
   btn_fruit.setVisible(false);
  }
  btn_fruit.setBounds(230, 370, 100, 30);
  btn_fruit.setName("btn_fruit");
  btn_fruit.addActionListener(this);


  btn_object=new JButton("insert");
  btn_object.setBounds(230, 410, 100, 30);
  if(object.equals(""))
  {
   btn_object.setVisible(false);
  }
  btn_object.setName("btn_object");
  btn_object.addActionListener(this);

  //--------------------------------fields 2-------------------------------------

  name_field2 = new JTextField();
  name_field2.setBounds(350, 50, 200, 30);


  family_field2 = new JTextField();
  family_field2.setBounds(350, 90, 200, 30);

  animal_field2 = new JTextField();
  animal_field2.setBounds(350, 130, 200, 30);


  food_field2 = new JTextField();
  food_field2.setBounds(350, 170, 200, 30);


  color_field2 = new JTextField();
  color_field2.setBounds(350, 210, 200, 30);


  car_field2 = new JTextField();
  car_field2.setBounds(350, 250, 200, 30);


  country_field2 = new JTextField();
  country_field2.setBounds(350, 290, 200, 30);


  city_field2 = new JTextField();
  city_field2.setBounds(350, 330, 200, 30);


  fruit_field2 = new JTextField();
  fruit_field2.setBounds(350, 370, 200, 30);


  object_field2 = new JTextField();
  object_field2.setBounds(350, 410, 200, 30);


  finish_fram.add(panel1);
  panel1.add(insert_data);

  panel1.add(name_field);
  panel1.add(family_field);
  panel1.add(animal_field);
  panel1.add(food_field);
  panel1.add(color_field);
  panel1.add(car_field);
  panel1.add(country_field);
  panel1.add(city_field);
  panel1.add(fruit_field);
  panel1.add(object_field);

  panel1.add(btn_name);
  panel1.add(btn_family);
  panel1.add(btn_animal);
  panel1.add(btn_food);
  panel1.add(btn_color);
  panel1.add(btn_car);
  panel1.add(btn_country);
  panel1.add(btn_city);
  panel1.add(btn_fruit);
  panel1.add(btn_object);

  panel1.add(name_field2);
  panel1.add(family_field2);
  panel1.add(animal_field2);
  panel1.add(food_field2);
  panel1.add(color_field2);
  panel1.add(car_field2);
  panel1.add(country_field2);
  panel1.add(city_field2);
  panel1.add(fruit_field2);
  panel1.add(object_field2);


  finish_fram.setVisible(true);
  panel1.setVisible(true);

 }

 //-------------------------------------------------------------------------------
 public void create_open_connection() {
  try {
   connection = DriverManager.getConnection(DBConnectionManager.URL, DBConnectionManager.USER, DBConnectionManager.PASS);
  } catch (SQLException ex) {
   System.err.println(ex.getMessage());
  }
 }

 //--------------------------------------------------------------------------
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
 //------------------------------------------------------
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

 name_data=select("name",startchar);
 family_data=select("family",startchar);
 animal_data=select("animals",startchar);
 food_data=select("foods",startchar);
 color_data=select("colors",startchar);
 car_data=select("cars",startchar);
 country_data=select("countrys",startchar);
 city_data=select("citys",startchar);
 fruit_data=select("fruits",startchar);
 object_data=select("objects",startchar);



 try {
  { if( name_data.size()<1)
  {NameAnswer="";
   name_field2.setText(NameAnswer);
  }
  else {
   NameAnswer=(name_data.get(random.nextInt(name_data.size()))+"");
   name_field2.setText(NameAnswer);
   System.out.println("truuuuuuuuuuueee");}}


  {
   if (family_data.size()<1)
  {
   FamilyAnswer="";
   family_field2.setText(FamilyAnswer);
  }
  else
  {FamilyAnswer=(family_data.get(random.nextInt(family_data.size()))+"");
   family_field2.setText(FamilyAnswer);
  }}


  { if (animal_data.size()<1)
  {
   AnimalAnswer="";
   animal_field2.setText(AnimalAnswer);
  }
  else
  {
   AnimalAnswer=(animal_data.get(random.nextInt(animal_data.size()))+"");
   animal_field2.setText(AnimalAnswer);
  }}


  { if (food_data.size()<1)
  {
   FoodAnswer="";
   food_field2.setText(FoodAnswer);
  }
  else
  {FoodAnswer=(food_data.get(random.nextInt(food_data.size()))+"");
   food_field2.setText(FoodAnswer);
  }}


  { if (color_data.size()<1)
  {ColorAnswer="";
   color_field2.setText(ColorAnswer);
  }
  else
  {ColorAnswer=(color_data.get(random.nextInt(color_data.size()))+"");
   color_field2.setText(ColorAnswer);
  }}


  { if (car_data.size()<1)
  {CarAnswer="";
   car_field2.setText(CarAnswer);
  }
  else
  {CarAnswer=(car_data.get(random.nextInt(car_data.size()))+"");
   car_field2.setText(CarAnswer);
  }}

  { if (country_data.size()<1)
  {CountryAnswer="";
   country_field2.setText(CountryAnswer);
  }
  else
  {CountryAnswer=(country_data.get(random.nextInt(country_data.size()))+"");
   country_field2.setText(CountryAnswer);
  }}

  { if (city_data.size()<1)
  {CityAnswer="";
   city_field2.setText(CityAnswer);
  }
  else
  {CityAnswer=(city_data.get(random.nextInt(city_data.size()))+"");
   city_field2.setText(CityAnswer);
  }}

  { if (fruit_data.size()<1)
  {FruitAnswer="";
   fruit_field2.setText(FruitAnswer);
  }
  else
  {FruitAnswer=(fruit_data.get(random.nextInt(fruit_data.size()))+"");
   fruit_field2.setText(FruitAnswer);
  }}

  { if (object_data.size()<1)
  {ObjectAnswer="";
   object_field2.setText(ObjectAnswer);
  }
  else
  {ObjectAnswer=(object_data.get(random.nextInt(object_data.size()))+"");
   object_field2.setText(ObjectAnswer);
  }}




 }catch (Exception e){
  System.out.println("ooooofffffff");
 }

}
 //------------------------------------------------------

 //-----------------------------------------------------------------------------
 public int insert(String word,String tblN) {
   int return_val = 0;
  try {
   return_val = statement.executeUpdate("insert into " + tblN + "( inventory ) values('" + word + "')");
  } catch (SQLException ex) {
   System.err.println(ex.getMessage());
  }
  return return_val;
 }

 @Override
 public void actionPerformed(ActionEvent e) {

  Object o = e.getSource();
  if (o instanceof JButton) ;
  {
   String jButton_name = ((JButton) o).getName();
   if (jButton_name.equals("btn_name")) {
    String words = name_field.getText();
    String tblN="name";
    create_open_connection();
    create_statement();
    int return_val = insert(words,tblN);
    close_statement();
    closeConnection();
    if (return_val==1){btn_name.setBackground(Color.green);}
    else {btn_name.setBackground(Color.red);}
    showMessageDialog(return_val + " Record insert.");
   }

    if (jButton_name.equals("btn_family"))
   {
    String words=family_field.getText();
    String tblN="family";
    create_open_connection();
    create_statement();
    int return_val=insert(words,tblN);
    close_statement();
    closeConnection();
    if (return_val==1){btn_family.setBackground(Color.green);}
    else {btn_family.setBackground(Color.red);}
    showMessageDialog(return_val + " Record insert.");
   }

    if (jButton_name.equals("btn_animal"))
    {
     String words=animal_field.getText();
     String tblN="animals";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_animal.setBackground(Color.green);}
     else {btn_animal.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

    if (jButton_name.equals("btn_food"))
    {
     String words=food_field.getText();
     String tblN="foods";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_food.setBackground(Color.green);}
     else {btn_food.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

     if (jButton_name.equals("btn_color"))
    {
     String words=color_field.getText();
     String tblN="colors";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_color.setBackground(Color.green);}
     else {btn_color.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

     if (jButton_name.equals("btn_car"))
    {
     String words=car_field.getText();
     String tblN="cars";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_car.setBackground(Color.green);}
     else {btn_car.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

     if (jButton_name.equals("btn_country"))
    {
     String words=country_field.getText();
     String tblN="countrys";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_country.setBackground(Color.green);}
     else {btn_country.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

     if (jButton_name.equals("btn_city"))
    {
     String words=city_field.getText();
     String tblN="citys";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_city.setBackground(Color.green);}
     else {btn_city.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

     if (jButton_name.equals("btn_fruit"))
    {
     String words=fruit_field.getText();
     String tblN="fruits";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_fruit.setBackground(Color.green);}
     else {btn_fruit.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }

     if (jButton_name.equals("btn_object"))
    {
     String words=object_field.getText();
     String tblN="objects";
     create_open_connection();
     create_statement();
     int return_val=insert(words,tblN);
     close_statement();
     closeConnection();
     if (return_val==1){btn_object.setBackground(Color.green);}
     else {btn_object.setBackground(Color.red);}
     showMessageDialog(return_val + " Record insert.");
    }
  }
 }

 public void showMessageDialog(String msg) {

  JOptionPane.showMessageDialog(finish_fram, msg);
 }



 public static void main(String[] args)throws  Exception{

 }
}

