using System;
using System.Collections.Generic;
using System.Text;

class MainClass
{
    public static string intersperse(string result)
    {
        string challengeToken = "k5olhfwva1e";
        StringBuilder sb = new StringBuilder(challengeToken, 50);
        char[] ch = result.ToCharArray();
        for (int i = 0; i < result.Length; i++)
        {
            sb.Insert((2*i), ch[i].ToString());
        }
        return sb.ToString();
    }
    public static string SearchingChallenge(string str)
    {
        var substrings = new HashSet<string>();
        int k = str[0] - '0';
        string tempString = "";
        for (int m = 1; m <= ((str.Length - 1) - (k - 2)); m++)
        {
            int differenceCounter = 0, j = 0;
            str = str.Substring(1); tempString = "";
            while (j < k)
            {
                if (!(tempString.Contains(str[j]))) { differenceCounter++; }
                tempString += str[j];
                j++;
            }
            for (int i = 0; i < str.Length - k; i++)
            {
                char tempChar = str[k + i];
                if ((!tempString.Contains(tempChar))) { differenceCounter++; }
                if (differenceCounter != k + 1)
                {
                    tempString += tempChar;
                    if ((k + i) != str.Length) { substrings.Add(tempString); }
                }
                else
                {
                    substrings.Add(tempString);
                    break;
                }
            }
        }
        string result = "";
        foreach (var name in substrings)
        {
            if (name.Length > result.Length) { result = name; }
        }
        result = intersperse(result);
        return (string.IsNullOrEmpty(result)) ? "EMPTY" : result;
    }

    static void Main()
    {
        // keep this function call here
        Console.WriteLine(SearchingChallenge(Console.ReadLine()));
        Console.ReadKey();
    }
}
