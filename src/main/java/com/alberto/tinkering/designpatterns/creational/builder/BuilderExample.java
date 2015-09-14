package com.alberto.tinkering.designpatterns.creational.builder;


/**
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class BuilderExample
{
   /**
    * Represents main
    *
    * @param args
    * @since Jul 22, 2015
    *
    */
   public static void main (final String args[])
   {

      // Constructor is not Visible!! oh noes!
      // Ship myShip = new Ship(new Ship.Builder (null, null));

      final Ship barquito = new Ship.Builder (new Wood ("oak"), new Metal ("iron")).masts (9).flag ("cross-bones")
            .oars (true).build ();

      System.out.println (barquito.getFlag ());



   }
}
