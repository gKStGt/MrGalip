package reader;

//import java.util.logging.Logger;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.ScheduledFuture;
//import java.util.concurrent.TimeUnit;
//import java.util.*;
//import java.util.Timer;
import java.util.TimerTask;

public class Daemon extends TimerTask {
//	public class Daemon implements Runnable {
//	ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//	ScheduledFuture<?> watcher = executor.scheduleAtFixedRate(new Daemon(), 0, 4, TimeUnit.SECONDS);

	@Override
	public void run() {
		try{
			Screenbot.solveCode(true);
		} catch (Exception e) {e.printStackTrace();}
	} 
/*	stop() {
		watcher.cancel(true);
		executor.shutdown();
	}
	}

	public void run() {
		System.out.print(java.time.LocalTime.now()+": ");
		Screenbot.solveCode(false);
	}
/*	

	/*
	private boolean status = false;
	Logger logger = Logger.getLogger("Timer");
	Screenbot bot = new Screenbot();

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Galip(){}
	
	public void watch() {
				
		final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		final ScheduledFuture<?> watcher = executor.scheduleAtFixedRate(new StaticGalip(), 0, 4, TimeUnit.SECONDS);
		
		if(!status) {
			executor.schedule(new Runnable() {
				@Override
				public void run() {
					watcher.cancel(true);
					executor.shutdown();
				}
			},0, TimeUnit.NANOSECONDS);
		}
	}
	public void run() {
		bot.solveCode(false);
	}
	
	class StaticGalip implements Runnable {
		public void run() {
			bot.solveCode(true);
		}
�		*/		
		/*		
		for (int i = 0; i < 10000; i++) {
			try {
				System.out.print(java.time.LocalTime.now()+": ");
				solveCode(true);
				Timer timer = new Timer(true);
				TimerTask pingcheck = new MyTimerTask();
				timer.scheduleAtFixedRate(pingcheck,0,5000);
//				ScheduleFixedRateDelay
//				Thread.sleep(1000);
			} catch (Exception e) {e.printStackTrace();}
		}
	}
		*/
	
	
}
