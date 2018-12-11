import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num)
    {
        this.digitList = new ArrayList<Integer>();
        String tempStr = "";
        String str = String.valueOf(num);
        for(int i =0; i < str.length(); i++)
        {
            String temp = str.substring(i,i+1);
            digitList.add(Integer.valueOf(temp));

        }

    }
    public boolean isStrictlyIncreasing()
    {
        for(int i=0; i <digitList.size(); i++)
        {
            if(digitList.get(i).intValue() >= digitList.get(i+1).intValue())
            {
                return false;
            }


        }
        return true;

    }
    public ArrayList<Integer> getdigitList()
    {
        return digitList;


    }


}

