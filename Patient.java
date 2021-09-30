/* Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
*/
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
