package trash;

/*
* ���������� ������� fizbuzztest, ������� ���������� �������� �������� ������.
* ������ ����������� �� ��������� ��������:
* - ������� ��������� �������� � ���� ������ �����
* - ���� ����� ������ ���, �� � ������ ������� ����� Fizz
* - ���� ����� ������ � ���, � ����, �� � ������ ������� ����� FizzBuzz
* - ���� ����� �� ������ �� ������ �� ���� �����, �� ���������� ��������� IllegalArgumentException
*
*
* 1
*
*
* */
public class FizzBuzzInterview {

    public byte[] fizbuzztest(int value){
        if(value % 3 == 0){
            StringBuilder s = new StringBuilder().append("Fizz");
            if (value % 5 ==0){
                s.append("Buzz");
            }
            return s.toString().getBytes();
        }else {
            throw new IllegalArgumentException("error");
        }
    }
}
