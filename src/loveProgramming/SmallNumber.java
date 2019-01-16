package loveProgramming;

public class SmallNumber {
    private int arr[];
    private int small;

    public SmallNumber(int a[]){
        this.arr = a;
        small = a[0];
        for (int i=0; i < a.length; i++)
        {
          if(small>=a[i])
          {
              small = a[i];
          }
        }
        System.out.println("Smallest number is "+small);

        }
    }

//SmallNumber a1 = new SmallNumber(new int []{24,34,44,54});


