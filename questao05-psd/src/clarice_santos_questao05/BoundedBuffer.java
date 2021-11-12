package clarice_santos_questao05;

import java.util.ArrayList;
import java.util.List;

public class BoundedBuffer {

	private List<Integer> list;
	private int tamanhoArray;

	public BoundedBuffer(int tamanhoArray) {
		this.tamanhoArray = tamanhoArray;
		this.list = new ArrayList<Integer>(tamanhoArray);
	}

	public void put(int v) {

		if (list.size() - 1 < tamanhoArray) {
			list.add(v);
		}
	}

	public int get() {
		if (list.size() > 0)
			return list.get(list.size() - 1);
		return -1;
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
