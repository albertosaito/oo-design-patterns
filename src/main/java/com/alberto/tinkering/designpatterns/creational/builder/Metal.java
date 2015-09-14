package com.alberto.tinkering.designpatterns.creational.builder;


/**
 * Metal represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class Metal
{
   /** Metal for name */
   private final String name;


   /**
    * Constructs an instance of Metal object.
    *
    * @param string
    */
   public Metal (final String string)
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
