package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(mo10496d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H@"}, mo10497d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;"}, mo10498k = 3, mo10499mv = {1, 7, 1}, mo10501xi = 48)
@DebugMetadata(mo11219c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", mo11220f = "Sequences.kt", mo11221i = {0, 0}, mo11222l = {332}, mo11223m = "invokeSuspend", mo11224n = {"$this$sequence", "index"}, mo11225s = {"L$0", "I$0"})
/* compiled from: Sequences.kt */
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<C, Iterator<R>> $iterator;
    final /* synthetic */ Sequence<T> $source;
    final /* synthetic */ Function2<Integer, T, C> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$flatMapIndexed$1(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends C> function2, Function1<? super C, ? extends Iterator<? extends R>> function1, Continuation<? super SequencesKt__SequencesKt$flatMapIndexed$1> continuation) {
        super(2, continuation);
        this.$source = sequence;
        this.$transform = function2;
        this.$iterator = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    public final Object invoke(SequenceScope<? super R> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        SequenceScope $this$sequence;
        Iterator<T> it;
        int index;
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                sequencesKt__SequencesKt$flatMapIndexed$1 = this;
                Iterator<T> it2 = sequencesKt__SequencesKt$flatMapIndexed$1.$source.iterator();
                $this$sequence = (SequenceScope) sequencesKt__SequencesKt$flatMapIndexed$1.L$0;
                index = 0;
                it = it2;
                break;
            case 1:
                sequencesKt__SequencesKt$flatMapIndexed$1 = this;
                index = sequencesKt__SequencesKt$flatMapIndexed$1.I$0;
                it = (Iterator) sequencesKt__SequencesKt$flatMapIndexed$1.L$1;
                $this$sequence = (SequenceScope) sequencesKt__SequencesKt$flatMapIndexed$1.L$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object element = it.next();
            Function2<Integer, T, C> function2 = sequencesKt__SequencesKt$flatMapIndexed$1.$transform;
            int index2 = index + 1;
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object result = function2.invoke(Boxing.boxInt(index), element);
            sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = $this$sequence;
            sequencesKt__SequencesKt$flatMapIndexed$1.L$1 = it;
            sequencesKt__SequencesKt$flatMapIndexed$1.I$0 = index2;
            sequencesKt__SequencesKt$flatMapIndexed$1.label = 1;
            if ($this$sequence.yieldAll(sequencesKt__SequencesKt$flatMapIndexed$1.$iterator.invoke(result), (Continuation<? super Unit>) sequencesKt__SequencesKt$flatMapIndexed$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            index = index2;
        }
        return Unit.INSTANCE;
    }
}
