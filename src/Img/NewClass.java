/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Img;

/**
 *
 * @author Jayashanka Deshan
 */
public class NewClass
{
    public static String model_name = "ee";
    
    public static void main(String[] args)
    {
        System.out.println(Validation_Model_Name());
    }
    
    public static Boolean Validation_Model_Name()
    {
        if(model_name.matches("^[0-9A-Z]*$"))
        {

            return true;
        }
        else
        {

            return false;
        }
    }
}