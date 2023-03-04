package exercise6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LorryProblem {
	public static void main(String[] args) {

		int driveTimePerDay = 8;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the speed of the Lorry (in km/hr): ");
		double speed = scanner.nextDouble();

		System.out.print("Enter the distance to be travelled (in km): ");
		double distance = scanner.nextDouble();

		System.out.print("Enter the starting date (in YYYY-MM-DD format): ");
		String startDateInput = scanner.next();
		LocalDate startDate = LocalDate.parse(startDateInput);

		System.out.print("Enter the starting time (in HH:MM format): ");
		String startTimeInput = scanner.next();
		LocalTime startTime = LocalTime.parse(startTimeInput);

		scanner.close();

		double totalTimeRequired = distance / speed;

		double totalNumberOfDays = Math.ceil(totalTimeRequired / driveTimePerDay);

		List<String> holydays = new ArrayList<>();

		for (int i = 0; i <= totalNumberOfDays; i++) {

			LocalDate currentDate = startDate.plusDays(i);
			if (currentDate.getMonthValue() == 1 && currentDate.getDayOfMonth() == 1) {
				holydays.add("New Year Day");
			} else if (currentDate.getMonthValue() == 1 && currentDate.getDayOfMonth() == 26) {
				holydays.add("Republic Day");
			} else if (currentDate.getMonthValue() == 8 && currentDate.getDayOfMonth() == 15) {
				holydays.add("Independence Day");
			} else if (currentDate.getDayOfWeek().getValue() == 6 && currentDate.getDayOfMonth() >= 8
					&& currentDate.getDayOfMonth() <= 14) {
				holydays.add("Second Saturday");
			} else if (currentDate.getDayOfWeek().getValue() == 7) {
				holydays.add("Sunday");
			}
		}

		double totalNumDays = totalNumberOfDays + holydays.size();

		LocalDate destinationDate = startDate.plusDays((long) totalNumDays);
		LocalTime destinationTime = startTime.plus((long) Math.floorMod(Math.round(totalTimeRequired * 60), 480),
				ChronoUnit.MINUTES);

		System.out.println(
				"The vehicle will reach the destination on " + destinationDate + " at " + destinationTime + ".");
	}
}
