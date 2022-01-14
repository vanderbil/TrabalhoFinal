package memento;

import java.util.ArrayList;

public class Historico {
   private ArrayList<Memento> mementoList = new ArrayList<Memento>();

   public void saveState(Memento state){
      mementoList.add(state);
   }

   public Memento getState(int index){
      return mementoList.get(index);
   }
}