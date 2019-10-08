package Assignments;

public class HTTP {
	public static void main(String[] args) {
		
		int StatusCode;
		
		StatusCode=200;
		
		if (StatusCode==200) {
			System.out.println("Status Code is "+StatusCode+". Output is: OK");
	}

		if (StatusCode==201) {
			System.out.println("Status Code is "+StatusCode+". Output is: Created");
	}
		if (StatusCode==202) {
			System.out.println("Status Code is "+StatusCode+". Output is: Accepted");
	}
		if (StatusCode==301) {
			System.out.println("Status Code is "+StatusCode+". Output is: Moved Permanently");
	}
		if (StatusCode==303) {
			System.out.println("Status Code is "+StatusCode+". Output is: See Other");
	}
		if (StatusCode==304) {
			System.out.println("Status Code is "+StatusCode+". Output is: Not Modified");
	}
		if (StatusCode==307) {
			System.out.println("Status Code is "+StatusCode+". Output is: Temporary Redirect");
	}
		if (StatusCode==400) {
			System.out.println("Status Code is "+StatusCode+". Output is: Bad Request");
	}
		if (StatusCode==401) {
			System.out.println("Status Code is "+StatusCode+". Output is: Unauthorized");
	}
		if (StatusCode==404) {
			System.out.println("Status Code is "+StatusCode+". Output is: Not Found");
	}
	
		if (StatusCode==410) {
			System.out.println("Status Code is "+StatusCode+". Output is: Gone");
	}
		if (StatusCode==500) {
			System.out.println("Status Code is "+StatusCode+". Output is: OK");
	}
		if (StatusCode==503) {
			System.out.println("Status Code is "+StatusCode+". Output is: Internal Server Error");
	}
		
		// Or we can create the code in other way. See below
		
		int statuscode;
		statuscode=201;
		String finalresult="";
		
		if(statuscode==200) {
			finalresult="Ok";
		}
		if(statuscode==201) {
			finalresult="Created";
		}
       // Suppose I wrote all code numbers and results to 503...
		
		System.out.println("Status Code is "+statuscode+". Output is: "+finalresult);
}
}
