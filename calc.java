class calc{
    public static void main(String[] args){
       //System.out.println("Hello World");
        int a = Integer.parseInt(args[0]);
        String operand = args[1];
        int b = Integer.parseInt(args[2]);
        int result = 0;

        //addition
       if (operand.equals("+")){
        result = a + b;
       }

       System.out.println(result);
    }
}  
