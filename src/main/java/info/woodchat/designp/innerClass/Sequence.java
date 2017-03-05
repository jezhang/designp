package info.woodchat.designp.innerClass;

import info.woodchat.designp.innerClass.interfaces.Selector;

/**
 * Created by jeanzhang on 17/3/5.
 */
public class Sequence {

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public void next() {
            if(i < items.length) i++;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public boolean end() {
            return i == items.length;
        }
    }

    public SequenceSelector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(100);
        for(int i = 0; i < 100; i++)
            s.add(Integer.toString(i));
        Selector selector = s.selector();
        while (! selector.end()) {
            System.out.println(selector.current() + "\n");
            selector.next();
        }
    }
}
