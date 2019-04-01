package cliente.cliente;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Client cliente = ClientBuilder.newClient();
    	Cliente f = cliente.target("http://localhost:8080/proyectoPalacios/api/cliente")
    	.request(MediaType.APPLICATION_XML).get(Cliente.class);
    	System.out.println("Este es el consumo: "+ f);
        System.out.println( "Hello World!" );
    }
}
