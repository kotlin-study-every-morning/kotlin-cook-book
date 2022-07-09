package chapter2;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class JavaMain {

    @JvmOverloads
    public static final void addProduct(@NotNull String name, double price, @NotNull String desc) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(price, "price");
        Intrinsics.checkParameterIsNotNull(desc, "desc");
    }

//    @JvmOverloads
//    public static final void addProduct(@NotNull String name, double price) {
//        return addProduct$default(name, price, (String)null, 4, (Object) null);
//    }

    Integer myInteger = 3;
    // Long a = myInteger;
    Long myWrappedLong = myInteger.longValue();
    Long b = Long.valueOf(myInteger);

}
