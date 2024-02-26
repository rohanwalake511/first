package Threads;

import java.io.*;

// The ThreadJoin class is the child class of the class Thread
class ThreadJoin extends Thread
{
    // overriding the run method
    public void run()
    {
        for (int j = 0; j < 3; j++)
        {
            try
            {
// sleeping the thread for 300 milli seconds
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            }
// catch block for catching the raised exception
            catch(Exception e)
            {
                System.out.println("The exception has been caught: " + e);
            }
            System.out.println( j );
        }
    }
}