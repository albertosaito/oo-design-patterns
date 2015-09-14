package com.alberto.tinkering.designpatterns.creational.abstractfactory;


/**
 * Vampire represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class Vampire
{
   /**
    * Constructs an instance of Vampire object.
    *
    * @param factory
    */
   public Vampire (final VampireFactory factory)
   {
      final Fangs fangs = factory.createFangs ();
      fangs.bite ();
   }

}
