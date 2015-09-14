package com.alberto.tinkering.designpatterns.creational.abstractfactory;


/**
 * BladeFactory represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class BladeFactory implements VampireFactory
{

   /**
    * Overrides createFang
    *
    * @return Fangs
    * @since Jul 22, 2015
    * @see com.alberto.tinkering.designpatterns.creational.abstractfactory.VampireFactory#createFangs()
    */
   @Override
   public Fangs createFangs ()
   {
      return new BladeFangs ();
   }

}
