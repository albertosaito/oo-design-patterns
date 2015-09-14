package com.alberto.tinkering.designpatterns.creational.prototype;


import java.util.HashMap;
import java.util.Map;


/**
 * RobotFactory represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class RobotFactory
{

   /**
    * ModelType represents ...
    *
    * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
    * @version $Id$
    * @since Jul 22, 2015
    *
    */
   public static class ModelType
   {
      /** ModelType for T1000 */
      public static final String T1000 = "t1000";
      /** ModelType for T800 */
      public static final String T800  = "t800";
   }

   private static Map <String, RobotPrototype> prototypes = new HashMap <String, RobotPrototype> ();

   static
   {
      prototypes.put (ModelType.T1000, T1000.getInstance ());
      prototypes.put (ModelType.T800, T800.getInstance ());
   }


   /**
    * Represents getInstance
    *
    * @param s
    * @return RobotPrototype
    * @throws CloneNotSupportedException
    * @since Jul 22, 2015
    *
    */
   public static RobotPrototype getInstance (final String s) throws CloneNotSupportedException
   {
      return prototypes.get (s).clone ();
   }
}
