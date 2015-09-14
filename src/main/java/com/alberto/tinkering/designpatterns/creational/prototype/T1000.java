package com.alberto.tinkering.designpatterns.creational.prototype;


/**
 * T1000 represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class T1000 implements RobotPrototype
{


   private static T1000 instance;


   /**
    * Overrides clone
    *
    * @return T1000
    * @throws CloneNotSupportedException
    * @since Jul 22, 2015
    * @see java.lang.Object#clone()
    */
   @Override
   public T1000 clone () throws CloneNotSupportedException
   {
      System.out.println ("Creating T100 from template");
      return (T1000) super.clone ();
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
      System.out.println ("liquid metal FTW!");
   }


   /**
    * Constructs an instance of T1000 object.
    */
   private T1000 ()
   {
      System.out.println ("An instance of T1000 has been created");
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
         instance = new T1000 ();
      }
      return instance;
   }
}
