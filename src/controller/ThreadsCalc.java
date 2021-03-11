package controller;

public class ThreadsCalc extends Thread {
	private int [] vetor;
	private int i;
	public ThreadsCalc (int i, int[]vetor) {
		this.i= i;
		this.vetor= vetor;
	}
	@Override 
	public void run() {
		Temp();
	}
	public void Temp() {
		if(i%2==0) {
			double Tstart= System.nanoTime();
			for(int c=0; c< vetor.length; c++) {
			}
			double Tend= System.nanoTime();
			double Ttotal= Tend- Tstart;
			Ttotal= Ttotal/ Math.pow(10, 9);
			System.out.println("Length = "+ Ttotal + " s");
		}
		else {
			double Tstart= System.nanoTime();
			for(int c: vetor) {
			}
			double Tend= System.nanoTime();
			double Ttotal= Tend- Tstart;
			Ttotal= Ttotal/ Math.pow(10, 9);
			System.out.println("ForEach = " + Ttotal + " s");
		}
	}
}
