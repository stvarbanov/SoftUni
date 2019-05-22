import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern regexForDishes = Pattern.compile("<([\\da-z]+)>");
        Pattern regexForCleaning = Pattern.compile("\\[([\\dA-Z]+)\\]");
        Pattern regexForLaundry = Pattern.compile("\\{([\\W\\w\\d]+)}");

        Pattern numbers = Pattern.compile("[\\d]");

        int timeDishes = 0;
        int timeCleaning = 0;
        int timeLaundry = 0;

//        String text = "Andy: 123";
//        String pattern = "([A-Z][a-z]+): (?<number>\\d+)";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(text);

//        if (disheshMatch.Success)
//        {
//            var time = numbers.Matches(disheshMatch.Groups[0].Value);
//            foreach (var item in time)
//            {
//                dishesTime += int.Parse(item.ToString());
//            }


        String input = "";
        while (!"wife is happy".equals(input = scanner.nextLine())) {

            boolean DishesCase = regexForDishes.pattern().matches(input);
            boolean LaundryCase = regexForLaundry.pattern().matches(input);
            boolean CleaningCase = regexForCleaning.pattern().matches(input);

          if(DishesCase){



          } else if(LaundryCase){

          }else if (CleaningCase){


          }

//            var time = numbers.Matches(disheshMatch.Groups[0].Value);
//                foreach (var item in time)
                {
//                    dishesTime += int.Parse(item.ToString());
//                }



        }


    }
}






//    using System;
//    using System.Collections.Generic;
//        using System.Linq;
//        using System.Text;
//        using System.Text.RegularExpressions;
//        using System.Threading.Tasks;
//
//        namespace ConsoleApp178
//        {
//class Program
//{
//    static void Main(string[] args)
//    {
//        Regex dishes = new Regex(@"<([\da-z]+)>");
//        Regex house = new Regex(@"\[([\dA-Z]+)\]");
//        Regex laundry = new Regex(@"{([\W\w\d]+)}");
//
//        int dishesTime = 0;
//        int houseTime = 0;
//        int laundryTime = 0;
//
//        Regex numbers = new Regex(@"[\d]");
//
//        while (true)
//        {
//            string command = Console.ReadLine();
//            if (command == "wife is happy")
//            {
//                break;
//            }
//            var disheshMatch = dishes.Match(command);
//            var houseMatch = house.Match(command);
//            var laundryMatch = laundry.Match(command);
//            if (disheshMatch.Success)
//            {
//                var time = numbers.Matches(disheshMatch.Groups[0].Value);
//                foreach (var item in time)
//                {
//                    dishesTime += int.Parse(item.ToString());
//                }
//
//            }
//            if (houseMatch.Success)
//            {
//                var time = numbers.Matches(houseMatch.Groups[0].Value);
//                foreach (var item in time)
//                {
//                    houseTime += int.Parse(item.ToString());
//                }
//            }
//            if (laundryMatch.Success)
//            {
//                var time = numbers.Matches(laundryMatch.Groups[0].Value);
//                foreach (var item in time)
//                {
//                    laundryTime += int.Parse(item.ToString());
//                }
//            }
//        }
//        Console.WriteLine($"Doing the dishes - {dishesTime} min.");
//        Console.WriteLine($"Cleaning the house - {houseTime} min.");
//        Console.WriteLine($"Doing the laundry - {laundryTime} min.");
//        Console.WriteLine($"Total - {dishesTime + houseTime + laundryTime} min.");
//
//
//
//    }
//}
//}