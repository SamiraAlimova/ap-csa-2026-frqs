public int moreHistoryThanMathAbsences() { 
    int count;
    for (int i = 0; i < historyList.size(); i++) {
        int numAbsencesH = historyList.get(i).getAbsences(); 
        String id = historyList.get(i).getStudentID(); 

        for(int j = 0; j < mathList.size(); j++) {
            int numAbsencesM = mathList.get(j).getAbsences(); 
            String idTwo = mathList.get(j).getStudentID();
            if ((idTwo.equals(id)) && (numAbsencesH > numAbsencesM)) {
                count++; 
            }

        }       
    }
    return count;
}
