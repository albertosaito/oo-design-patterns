package com.alberto.tinkering.designpatterns.creational.builder;


/**
 * Ship represents ...
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 */
public class Ship
{
   /** Ship for hullMaterial */
   Wood    hullMaterial;
   /** Ship for metalMaterial */
   Metal   metalMaterial;
   /** Ship for numberOfMasts */
   int     numberOfMasts;
   /** Ship for sailsType */
   String  sailsType;
   /** Ship for flag */
   String  flag;
   /** Ship for hasOars */
   boolean hasOars;


   /**
    * Constructs an instance of Ship object.
    *
    * @param builder
    */
   private Ship (final Builder builder)
   {
      hullMaterial = builder.hullMaterial;
      metalMaterial = builder.metalMaterial;
      numberOfMasts = builder.numberOfMasts;
      sailsType = builder.sailsType;
      flag = builder.flag;
      hasOars = builder.hasOars;
   }

   /**
    * Builder represents ...
    *
    * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
    * @version $Id$
    * @since Jul 22, 2015
    *
    */
   public static class Builder
   {
      /** Builder for hullMaterial */
      Wood    hullMaterial;
      /** Builder for metalMaterial */
      Metal   metalMaterial;
      /** Builder for numberOfMasts */
      int     numberOfMasts;
      /** Builder for sailsType */
      String  sailsType;
      /** Builder for flag */
      String  flag;
      /** Builder for hasOars */
      boolean hasOars;


      /**
       * Constructs an instance of Builder object.
       *
       * @param hull
       * @param metal
       */
      public Builder (final Wood hull, final Metal metal)
      {
         hullMaterial = hull;
         metalMaterial = metal;
      }


      /**
       * Represents flag
       *
       * @param value
       * @return Builder
       * @since Jul 22, 2015
       *
       */
      public Builder flag (final String value)
      {
         flag = value;
         return this;
      }


      /**
       * Represents masts
       *
       * @param value
       * @return Builder
       * @since Jul 22, 2015
       *
       */
      public Builder masts (final int value)
      {
         numberOfMasts = value;
         return this;
      }


      /**
       * Represents sails
       *
       * @param string
       * @return Builder
       * @since Jul 22, 2015
       *
       */
      public Builder sails (final String string)
      {
         sailsType = string;
         return this;
      }


      /**
       * Represents hasOars
       *
       * @param value
       * @return Builder
       * @since Jul 22, 2015
       *
       */
      public Builder oars (final boolean value)
      {
         hasOars = value;
         return this;
      }


      /**
       * Represents build
       *
       * @return Ship
       * @since Jul 22, 2015
       *
       */
      @SuppressWarnings ("synthetic-access")
      public Ship build ()
      {
         return new Ship (this);
      }
   }


   /**
    * @return the hullMaterial
    */
   public Wood getHullMaterial ()
   {
      return hullMaterial;
   }


   /**
    * @param value the hullMaterial to set
    */
   public void setHullMaterial (final Wood value)
   {
      this.hullMaterial = value;
   }


   /**
    * @return the metalMaterial
    */
   public Metal getMetalMaterial ()
   {
      return metalMaterial;
   }


   /**
    * @param value the metalMaterial to set
    */
   public void setMetalMaterial (final Metal value)
   {
      this.metalMaterial = value;
   }


   /**
    * @return the numberOfMasts
    */
   public int getNumberOfMasts ()
   {
      return numberOfMasts;
   }


   /**
    * @param value the numberOfMasts to set
    */
   public void setNumberOfMasts (final int value)
   {
      this.numberOfMasts = value;
   }


   /**
    * @return the sailsType
    */
   public String getSailsType ()
   {
      return sailsType;
   }


   /**
    * @param value the sailsType to set
    */
   public void setSailsType (final String value)
   {
      this.sailsType = value;
   }


   /**
    * @return the flag
    */
   public String getFlag ()
   {
      return flag;
   }


   /**
    * @param value the flag to set
    */
   public void setFlag (final String value)
   {
      this.flag = value;
   }


   /**
    * @return the hasOars
    */
   public boolean isHasOars ()
   {
      return hasOars;
   }


   /**
    * @param value the hasOars to set
    */
   public void setHasOars (final boolean value)
   {
      this.hasOars = value;
   }



}
