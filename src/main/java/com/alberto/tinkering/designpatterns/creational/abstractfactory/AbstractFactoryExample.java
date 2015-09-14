package com.alberto.tinkering.designpatterns.creational.abstractfactory;


import org.joda.time.LocalTime;


/**
 *
 * @author <a href="mailto:nobuji.saito@gmail.com.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 *
 *        The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common
 *        theme without specifying their concrete classes. In normal usage, the client software creates a concrete
 *        implementation of the abstract factory and then uses the generic interface of the factory to create the
 *        concrete objects that are part of the theme. The client doesn't know (or care) which concrete objects it gets
 *        from each of these internal factories, since it uses only the generic interfaces of their products. This
 *        pattern separates the details of implementation of a set of objects from their general usage and relies on
 *        object composition, as object creation is implemented in methods exposed in the factory interface. (From
 *        Wikipedia)
 */
public class AbstractFactoryExample
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
      // Create new Vampire with a factory!
      // if before dusk I want Blade (he is a day walker)
      // else give me the prince of darkness (not Ozzy or Ganon)
      new Vampire (createNewVampireFactory ());
   }


   /**
    * Represents createNewVampireFactory
    *
    * @return VampireFactory
    * @since Jul 22, 2015
    *
    */
   public static VampireFactory createNewVampireFactory ()
   {
      final LocalTime time = new LocalTime ();
      // Dusk 7:50 PM
      final LocalTime dusk = new LocalTime (19, 50);
      // if after dusk return DraculaFactory
      if (time.isAfter (dusk))
      {
         return new DraculaFactory ();
      }
      // else return BladeFactory
      return new BladeFactory ();
   }
}
