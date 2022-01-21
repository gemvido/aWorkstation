package net;

import net.internal.access.Access;
import net.internal.c;
import net.version.enforceVersion;

public interface Main {

     static void main(String[] args) {


        System.out.println(c.wh + "DATABASE IS A PRIVATE SYSTEM THAT SHOULD NOT BE ACCESSED BY ANYONE THAT IS NOT AN OFFICIAL.");
        enforceVersion.fire();

         Access.main();

    }
}
