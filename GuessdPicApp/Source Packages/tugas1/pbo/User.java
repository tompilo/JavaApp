/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.pbo;

/**
 *
 * @author raray
 */
public final class User {
    static String name;
    
    private User() {
        User.name = "uwu";
    }
    
    public static void setName(String name) {
        User.name = name;
    }
    
    public static String getName() {
        return name;
    }
}
