package function;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;
import connection.*;

public class FonctionTest{

    public String Maj (String carct)
    {
        return carct.substring(0, 1).toUpperCase()+ carct.substring(1);
    }

    public void insertObjet (Object obj) throws Exception
    {
        DatabaseConnection connect = new DatabaseConnection("jdbc:postgresql://localhost:5432/m" , "postgres" , "1776");
        Connection c = connect.getConnection();
        c.setAutoCommit(false);
        try {
            Field[] attributs = obj.getClass().getDeclaredFields();
            String sql = "INSERT INTO " + obj.getClass().getSimpleName() +"(";
            for (int i=1; i<attributs.length; i++)
            {
                if (i==attributs.length-1){
                    sql=sql+attributs[i].getName();
                }
                else{
                    sql=sql+attributs[i].getName()+",";
                }
            }
            sql+=") VALUES (";
            for (int i=1; i<attributs.length; i++)
            {
                Method m = obj.getClass().getMethod("get"+Maj(attributs[i].getName()), null);
                if (i==attributs.length-1){
                    sql=sql+"'"+m.invoke(obj, null)+"'";
                }
                else{
                    sql=sql+"'"+m.invoke(obj, null)+"',";
                }
            } 
            sql = sql +");";
            System.out.println(sql);
            Statement s = c.createStatement();
            s.executeUpdate(sql);
            c.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            c.rollback();
        }
        finally {
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Object[] getdonnees (Object obj) throws Exception
    {   
        DatabaseConnection connect = new DatabaseConnection("jdbc:postgresql://localhost:5432/m" , "postgres" , "1776");
        Connection c = connect.getConnection();
            String sql = "SELECT * FROM " + obj.getClass().getSimpleName();

            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultat = s.executeQuery(sql);
            resultat.last();
            int nbr=resultat.getRow();
            resultat.beforeFirst();
            Object[] listeObjets = new Object[nbr];

            Field[] attributs = obj.getClass().getDeclaredFields();

            Class[] ss = new Class[attributs.length];
            for (int i = 0; i < ss.length; i++) {
                ss[i]= String.class;
            }

            Constructor cons = obj.getClass().getDeclaredConstructor(ss);
            int indice = 0;
            String[] valeurs = new String[attributs.length];
            
            while (resultat.next()) {
                for(int i=0 ; i<attributs.length ; i++)
                {
                    valeurs[i] = (String)resultat.getString(attributs[i].getName());
                }
                listeObjets[indice] = cons.newInstance(valeurs);
                indice = indice+1;
            }
        c.close();
        return listeObjets; 
    }
}