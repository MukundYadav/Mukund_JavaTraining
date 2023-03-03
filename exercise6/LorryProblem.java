package exercise6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LorryProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the speed of the Lorry (in km/hr): ");
		double speed = scanner.nextDouble();

		System.out.print("Enter the distance to be travelled (in km): ");
		double distance = scanner.nextDouble();

		// System.out.print("Enter the starting date (in YYYY-MM-DD format): ");
		// String startDateInput = scanner.next();
		LocalDate startDate = LocalDate.now();

		// System.out.print("Enter the starting time (in HH:MM format): ");
		// String startTimeInput = scanner.next();
		LocalTime startTime = LocalTime.now();

		scanner.close();

		double totalTimeRequired = distance / speed;

		double totalNumberOfDays = Math.floor(totalTimeRequired / 8);

		int totalHolidays = 0;
		for (int i = 0; i < totalNumberOfDays; i++) {
			LocalDate currentDate = startDate.plusDays(i);

			if (currentDate.getDayOfWeek().getValue() != 7 && currentDate.getDayOfWeek().getValue() != 6) { 							// Saturday
				if (currentDate.getMonthValue() == 1 && currentDate.getDayOfMonth() == 1
						|| currentDate.getMonthValue() == 1 && currentDate.getDayOfMonth() == 26
						|| currentDate.getMonthValue() == 8 && currentDate.getDayOfMonth() == 15) {
					totalHolidays++;
				} else if (currentDate.getDayOfWeek().getValue() == 1) { 
					if (currentDate.plusDays(6).getMonthValue() == currentDate.getMonthValue()) { 
						totalHolidays++;
					}
				}
			}
		}

		double totalNumDays = totalNumberOfDays + totalHolidays;

		LocalDate destinationDate = startDate.plusDays((long) totalNumDays);
		LocalTime destinationTime = startTime.plus((long) Math.floorMod(Math.round(totalTimeRequired * 60), 480),
				ChronoUnit.MINUTES);

		System.out.println(
				"The vehicle will reach the destination on " + destinationDate + " at " + destinationTime + ".");
	}
}
