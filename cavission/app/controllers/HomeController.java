package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.index;
import views.html.about;
import views.html.products;
import views.html.mycart;
import views.html.login;
import views.html.harsh;



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {



    

    
    /**
     * Create an Action to render an HTML page.
     *
     * The configuration in the `routes` file means that this method
     * will be called when the application receives a `GET` request with
     * a path of `/`.
     */
    public Result index() {
        return ok(index.render());
    }

    /**
     * Create an Action to render an About HTML page.
     *
     * The configuration in the `routes` file means that this method
     * will be called when the application receives a `GET` request with
     * a path of `/about`.
     */
    public Result about(){
        return ok(about.render());
    
    
    }

    public Result products(){
        return ok(products.render());
    
    
    }

     public Result mycart(){
        return ok(mycart.render());
    
    
    }

     public Result login(){
        return ok(login.render());
    
    
    }


     public Result harsh(){
        return ok(harsh.render());
    
    
    }
  
    
 
}  

