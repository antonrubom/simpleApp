package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.jvm.functions.Function1;

@Metadata(mo10496d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\b"}, mo10497d2 = {"kotlin/text/StringsKt___StringsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "keyOf", "element", "(C)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"}, mo10498k = 1, mo10499mv = {1, 7, 1}, mo10501xi = 176)
/* compiled from: _Strings.kt */
public final class StringsKt___StringsKt$groupingBy$1 implements Grouping<Character, K> {
    final /* synthetic */ Function1<Character, K> $keySelector;
    final /* synthetic */ CharSequence $this_groupingBy;

    public StringsKt___StringsKt$groupingBy$1(CharSequence $receiver, Function1<? super Character, ? extends K> $keySelector2) {
        this.$this_groupingBy = $receiver;
        this.$keySelector = $keySelector2;
    }

    public /* bridge */ /* synthetic */ Object keyOf(Object element) {
        return keyOf(((Character) element).charValue());
    }

    public Iterator<Character> sourceIterator() {
        return StringsKt.iterator(this.$this_groupingBy);
    }

    public K keyOf(char element) {
        return this.$keySelector.invoke(Character.valueOf(element));
    }
}
