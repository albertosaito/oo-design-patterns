package com.alberto.tinkering.designpatterns.creational.prototype;


/**
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Jul 22, 2015
 *
 *        There are two widely-used memory allocation techniques: automatic allocation and dynamic allocation. Commonly,
 *        there is a corresponding region of memory for each: the stack and the heap.
 *
 *        Stack
 *
 *        The stack always allocates memory in a sequential fashion. It can do so because it requires you to release the
 *        memory in the reverse order (First-In, Last-Out: FILO). This is the memory allocation technique for local
 *        variables in many programming languages. It is very, very fast because it requires minimal bookkeeping and the
 *        next address to allocate is implicit.
 *
 *        In C++, this is called automatic storage because the storage is claimed automatically at the end of scope. As
 *        soon as execution of current code block (delimited using {}) is completed, memory for all variables in that
 *        block is automatically collected. This is also the moment where destructors are invoked to clean up resources.
 *
 *        Heap
 *
 *        The heap allows for a more flexible memory allocation mode. Bookkeeping is more complex and allocation is
 *        slower. Because there is no implicit release point, you must release the memory manually, using delete or
 *        delete[] (free in C). However, the absence of an implicit release point is the key to the heap's flexibility.
 *
 *        Reasons to use dynamic allocation
 *
 *        Even if using the heap is slower and potentially leads to memory leaks or memory fragmentation, there are
 *        perfectly good use cases for dynamic allocation, as it's less limited.
 *
 *        Two key reasons to use dynamic allocation:
 *
 *        You don't know how much memory you need at compile time. For instance, when reading a text file into a string,
 *        you usually don't know what size the file has, so you can't decide how much memory to allocate until you run
 *        the program.
 *
 *        You want to allocate memory which will persist after leaving the current block. For instance, you may want to
 *        write a function string readfile(string path) that returns the contents of a file. In this case, even if the
 *        stack could hold the entire file contents, you could not return from a function and keep the allocated memory
 *        block.
 *
 *        Why dynamic allocation is often unnecessary
 *
 *        In C++ there's a neat construct called a destructor. This mechanism allows you to manage resources by aligning
 *        the lifetime of the resource with the lifetime of a variable. This technique is called RAII and is the
 *        distinguishing point of C++. It is "wraps" resources into objects. std::string is a perfect example. This
 *        snippet:
 *
 *        int main ( int argc, char* argv[] ) { std::string program(argv[0]); } actually allocates a variable amount of
 *        memory. The std::string object allocates memory using the heap and releases it in its destructor. In this
 *        case, you did not need to manually manage any resources and still get the benefits of the dynamic memory
 *        allocation.
 *
 *        In particular, it implies that in this snippet:
 *
 *        int main ( int argc, char* argv[] ) { std::string * program = new std::string(argv[0]); // Bad! delete
 *        program; } there is unneeded dynamic memory allocation. The program requires more typing (!) and introduces
 *        the risk of forgetting to deallocate the memory. It does this with no apparent benefit.
 *
 *        Why you should use automatic storage as often as possible
 *
 *        Basically, the last paragraph sums it up. Using automatic storage as often as possible makes your programs:
 *
 *        faster to type; faster when run; less prone to memory/resource leaks. From StackOverflow
 *        (http://stackoverflow.com/questions/6500313/why-should-c-programmers-minimize-use-of-new)
 *
 */
public class PrototypeExample
{

   /**
    * Represents main ]
    *
    * @param args
    * @throws CloneNotSupportedException
    * @since Jul 22, 2015
    *
    */
   public static void main (final String args[]) throws CloneNotSupportedException
   {
      final RobotPrototype t1000 = RobotFactory.getInstance (RobotFactory.ModelType.T1000);
      final RobotPrototype t800 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_2 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_3 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_4 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_5 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_6 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_7 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      final RobotPrototype t800_8 = RobotFactory.getInstance (RobotFactory.ModelType.T800);
      t1000.beARobot ();
      t800.beARobot ();
      System.out.printf ("the second T800 and third T800 are the same! %s\n", t800_2 == t800_3);
      System.out.printf ("the third T800 and fourth T800 are the same! %s\n", t800_3 == t800_4);
      System.out.printf ("the fourth T800 and fifth T800 are the same! %s\n", t800_4 == t800_5);
      System.out.printf ("the fifth T800 and sixth T800 are the same! %s\n", t800_5 == t800_6);
      System.out.printf ("the sixth T800 and seventh T800 are the same! %s\n", t800_6 == t800_7);
      System.out.printf ("the seventh T800 and eighth T800 are the same! %s\n", t800_7 == t800_8);
      System.out.printf ("the eighth T800 and second T800 are the same! %s\n", t800_8 == t800_2);

   }

}
