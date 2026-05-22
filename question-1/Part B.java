public String getShortenedName(){
    if(username.indexOf("-") == -1) return username;

    String result = username;
    for(int i = 0; i < result.length(); i++){
        if(result.substring(i, i+1).equals("-")){
            result = result.substring(0, i - 1) + result.substring(i + 1);
            i--;
        }
    }

  return result;
}
