package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestAppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//Read all keys
		Set <String> optionKeys=args.getOptionNames();
		System.out.println("Displaying All Keys=="+optionKeys);
		
		//Read only particular Key values
		
		List<String> list=args.getOptionValues("profile");
		System.out.println("Profile key values---"+list);
		
		//Ckeck for Particular key exist or not
		System.out.println("Cheking whether 'Profile' key exist or not=="+args.containsOption("profile"));
		System.out.println("Checking whether 'nature' key exist or not=="+args.containsOption("nature"));
		
		//Displaying non option arguments like install,clean etc
		
		List<String> nonOptionList=args.getNonOptionArgs();
		System.out.println("Displaying non option arguments==="+nonOptionList);
		
		//Displaying all Arguments including option and non option arguments
		String[] arr=args.getSourceArgs();
		System.out.println("All arguments by using String Array and here displaying array object="+arr);
		System.out.println("All arguments by using String Array"+Arrays.asList(arr));
		
		
	}

}
