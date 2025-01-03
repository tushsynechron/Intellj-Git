package org.example;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Main main = new Main();
        int card_num = 0;
        String cust_name="rutu";
        main.configure().addRoutesBuilder(new MyRouteBuilder());
        main.run(args);
        System.out.println();
    }

}

