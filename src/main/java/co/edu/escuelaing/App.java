package co.edu.escuelaing;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        secure("keystores/ecikeystore.p12", "192837", null, null);
        port(getPort());
        get("/hello", (req,res) -> "Hello!");
    }

    private static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
