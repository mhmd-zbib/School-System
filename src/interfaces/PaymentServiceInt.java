package interfaces;

import model.Student;

public interface PaymentServiceInt {


    void payFees(Student student, int amount);

    boolean checkPaymentStatus(Student student);


}
