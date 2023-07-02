package trash;

/*
* Реализуйте функцию fizbuzztest, которая возвращает числовой байтовый массив.
* Массив формируется по следующим правилам:
* - Функция принимает аргумент в виде целого числа
* - Если число кратно трём, то в массив заносим слово Fizz
* - Если число кратно и трём, и пяти, то в массив заносим слово FizzBuzz
* - Если число не кратно ни одному из этих чисел, то необходимо выбросить IllegalArgumentException
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
