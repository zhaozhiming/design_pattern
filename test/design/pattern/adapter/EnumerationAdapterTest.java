package design.pattern.adapter;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Hashtable;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EnumerationAdapterTest {

    @Test
    public void should_use_enumeration_adapter_correct() {
        Hashtable<String, String> table = new Hashtable<String, String>();
        table.put("a", "A");

        Enumeration<String> elements = table.elements();
        EnumerationAdapter adapter = new EnumerationAdapter(elements);

        if (adapter.hasNext()) {
            assertThat(adapter.next().toString(), is("A"));
        }
    }


}
