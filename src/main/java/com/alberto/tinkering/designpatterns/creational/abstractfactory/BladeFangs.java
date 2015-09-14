package com.alberto.tinkering.designpatterns.creational.abstractfactory;


/**
 * BladeFangs represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class BladeFangs implements Fangs
{

   /**
    * Overrides bite
    *
    * @since Jul 22, 2015
    * @see com.alberto.tinkering.designpatterns.creational.abstractfactory.Fangs#bite()
    */
   @Override
   public void bite ()
   {
      System.out.println ("small fangs, small bite");

   }

}
