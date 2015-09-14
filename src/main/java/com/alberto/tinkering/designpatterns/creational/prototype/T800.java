package com.alberto.tinkering.designpatterns.creational.prototype;


/**
 * T1000 represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class T800 implements RobotPrototype
{


   private static T800 instance;


   /**
    * Overrides clone
    *
    * @return T1000
    * @throws CloneNotSupportedException
    * @since Jul 22, 2015
    * @see java.lang.Object#clone()
    */
   @Override
   public T800 clone () throws CloneNotSupportedException
   {
      System.out.println ("Creating T800 from template");
      return (T800) super.clone ();
   }


   /**
    * Represents beARobot
    *
    * @since Jul 22, 2015
    *
    */
   @Override
   public void beARobot ()
   {
      System.out.println ("Hasta la vista baby!");
   }


   /**
    * Constructs an instance of T800 object.
    */
   private T800 ()
   {
      System.out.println ("An instance of T800 has been created");
   }


   /**
    * Represents getInstance
    *
    * @return RobotPrototype
    * @since Jul 22, 2015
    *
    */
   public static RobotPrototype getInstance ()
   {
      if (instance == null)
      {
         instance = new T800 ();
      }
      return instance;
   }

}
