package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(mo10496d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, mo10497d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo10498k = 1, mo10499mv = {1, 7, 1}, mo10501xi = 48)
/* compiled from: Sequences.kt */
public final class TransformingSequence$iterator$1 implements Iterator<R>, KMappedMarker {
    private final Iterator<T> iterator;
    final /* synthetic */ TransformingSequence<T, R> this$0;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    TransformingSequence$iterator$1(TransformingSequence<T, R> $receiver) {
        this.this$0 = $receiver;
        this.iterator = $receiver.sequence.iterator();
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public R next() {
        return this.this$0.transformer.invoke(this.iterator.next());
    }

    public boolean hasNext() {
        return this.iterator.hasNext();
    }
}
