package TutorialWeek5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		Interview I = new Interview();
		String [] arr = new String[3];
		int i=0;
		for (int x=0; x<arr.length;x++) {
			arr[x].concat("element"+i);
			x++;
		}
		System.out.println(Arrays.toString(arr));
	
	}
}

 

