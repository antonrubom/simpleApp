package kotlin.system;

import kotlin.Metadata;

@Metadata(mo10496d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\b¨\u0006\u0004"}, mo10497d2 = {"exitProcess", "", "status", "", "kotlin-stdlib"}, mo10498k = 2, mo10499mv = {1, 7, 1}, mo10501xi = 48)
/* compiled from: Process.kt */
public final class ProcessKt {
    private static final Void exitProcess(int status) {
        System.exit(status);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
