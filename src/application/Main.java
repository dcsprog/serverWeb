/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import messengSrserver.ServerManager;
import messengSrserver.ServerMonitor;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ServerManager serverManager=new ServerManager();
        ServerMonitor monitor=new ServerMonitor(serverManager);

        monitor.setVisible(true);
    }

}
