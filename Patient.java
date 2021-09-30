import java.lang.*;

class Patient{
         String name;
        double height,weight;

    public Patient(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    double computeBMI()
        {

            return (weight/(height*height));
        }
    }
    class Patients
    {
        public static void main (String[] args)
        {
            Patient obj=new Patient(154,60);
            System.out.println("The BMI:"+obj.computeBMI());

        }


    }
