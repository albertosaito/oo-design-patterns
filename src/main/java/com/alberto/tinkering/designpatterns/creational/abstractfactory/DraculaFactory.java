package com.alberto.tinkering.designpatterns.creational.abstractfactory;


/**
 * DraculaFactory represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class DraculaFactory implements VampireFactory
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
      return new DraculaFangs ();
   }

}
