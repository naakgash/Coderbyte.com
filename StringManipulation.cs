using System;

class MainClass {

  public static string StringChallenge(string str1) {
    char[] str = str1.ToCharArray();

    for(int i = 0 ; i < str.Length; i++){
      
      if(char.IsLetter(str[i])){
        if(char.IsUpper(str[i])){
          str[i] = char.ToLower(str[i]);
        }else{
          str[i] = char.ToUpper(str[i]);
        }
      }

      if(char.IsDigit(str[i])){
        for(int k = i+1; k<str.Length; k++){
          if(char.IsSeparator(str[k])){
            break;
          }else if (char.IsDigit(str[k])){
            char temp = str[k];
            str[k] = str[i];
            str[i] = temp;
          }
        }
      }
    }
    string s = new string(str);
    return s;
  }

  static void Main() {  
    Console.WriteLine(StringChallenge(Console.ReadLine()));
  } 
}
