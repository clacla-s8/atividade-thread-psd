package clarice_santos_questao05;

public class PrincipalBoundedBuffer {

	public static BoundedBuffer buffer = new BoundedBuffer(10);
	public static int valor = 0;

	public static void main(String[] args) {

		new BoundedBufferThread(10, "");
		new BoundedBufferThread(10, "");
		new BoundedBufferThread(10, "");

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(buffer);

	}

}
