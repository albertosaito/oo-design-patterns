package com.alberto.tinkering.designpatterns.creational.prototype;


/**
 * Prototype represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public interface RobotPrototype extends Cloneable
{
   /**
    * Represents clone
    *
    * @return RobotPrototype
    * @throws CloneNotSupportedException
    * @since Jul 22, 2015
    *
    */
   RobotPrototype clone () throws CloneNotSupportedException;


   /**
    * Represents beARobot
    *
    * @since Jul 22, 2015
    *
    */
   void beARobot ();
}
