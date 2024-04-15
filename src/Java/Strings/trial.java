package Java.Strings;

public class trial {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string="aXb#123@6#A98P";//227
        String string1="a7X1b#12@6#A8P";
        String string2="a7X1b#12@6#A8P0@#10";
        String add ="";
        int sum=0;
        char[] str=string.toCharArray();
        for(int i=0;i<string.length();i++) {

            int a= str[i];
            if(a>=48 && a<=57) {
                add=add+str[i];
            }
            else {
                add=add+" ";
            }
        }
        String[] value =add.split(" ");

        for (int i=0;i<value.length;i++) {
            String a=value[i].trim();
            if(a!="")
                sum=sum+Integer.parseInt(a);
        }

        System.out.println(sum);

        string= string.concat(string1).concat(string2);
        //  string= string.concat(string2);

        System.out.println(string);
    }

}

