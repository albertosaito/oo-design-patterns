package com.alberto.tinkering.designpatterns.creational.builder;


/**
 * Wood represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class Wood
{

   private final String name;


   /**
    * Constructs an instance of Wood object.
    *
    * @param string
    */
   public Wood (final String string)
   {
      name = string;
   }


   /**
    * Represents getName
    *
    * @return String
    * @since Jul 22, 2015
    *
    */
   public String getName ()
   {
      return name;
   }


}
