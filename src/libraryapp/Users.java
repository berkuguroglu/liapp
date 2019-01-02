/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.util.ArrayList;

/**
 *
 * @author berk
 */
public class Users 
{
    private static ArrayList<Users> user_list = new ArrayList<>();
    private int UserID;
    private String userName;
    private String userPass;
    public Users(int UserID, String userName, String userPass)
    {
        Users.user_list.add(this);
        this.userName = userName;
        this.userPass = userPass;
        
    }
}

