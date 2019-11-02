/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Herdian
 */
public final class idbuku {
    
    static String id;
    private idbuku() {
        idbuku.id = "1";
    }
    
    public static void setId(String id) {
        idbuku.id = id;
    }
    
    public static String getId() {
        return id;
    }
}
