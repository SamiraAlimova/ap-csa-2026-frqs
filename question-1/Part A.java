public Account( String requestedName){
    int num =1;
    if(isAvailable(requestedName)){
        username = requestedName;
    }else{
      while(!isAvailable(requestedName+num)){
       
        num++;
      }
     username = requestedName+num;  
    } 
    
}
