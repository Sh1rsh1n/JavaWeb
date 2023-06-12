import java.util.*;

public class MainApp {
	
	/*
	* метод, принимает массив целых чисел
	* возвращет количество четных чисел
	* для вычисления используется Stream API
	*
	* Arrays.stream(array) преобразуем входящий массив в поток
	* filter(num -> num % 2 == 0) выполняем фильтрацию 
	* count() узнаем количество четных чисел
	*/
	public static long evenNumbersCounter(int[] array) {
		return Arrays.stream(array).filter(num -> num % 2 == 0).count();
	}
	
	/*
	* метод, вычисляет разницу между минимальным и максимальным элементом массива
	*
	* Arrays.stream(array) преобразуем входящий массив в поток
	* reduce(Integer::min) находим min/max элемент, 
	* так как на вход отдаем массив int, то на выходе получаем не Stream, а IntStream, 
	* его метод reduce возвращает OptionalInt, чтобы получить результат нужно вызвать метод getAsInt()
	*/
	public static int differanceMinMaxElement(int[] array) {
		
		int minElement = Arrays.stream(array).reduce(Integer::min).getAsInt();
		int maxElement = Arrays.stream(array).reduce(Integer::max).getAsInt();
		
		return maxElement - minElement;
	}
	
	/*
	* поиск двух соседних одинаковых чисел по значению переданному в аргументе
	* на вход принимает массив чисел и значение, по которому выполняется проверка 
	* проходим по массиву, при этом берем сразу два элемента и сравниваем их с входящем значением
	*/
	public static boolean twoZeroNumbers(int[] array, int value) {
		
		for (int i = 0, j = 1; j < array.length; i++, j++) {
			if (array[i] == value && array[j] == value) {
				return true;
			}
		}
		return false;
	}
	
	/*
	* метод, генерируем массив случайных чисел
	* в аргументе указываем размер массива
	*/
	public static int[] fillArray(int capacity, int maxNumber) {
		int[] array = new int[capacity];
	
		for (int i = 0; i < capacity; i++) {
			array[i] = new Random().nextInt(maxNumber);
		}
		return array;
	}


    public static void main(String args[]){
		
	int[] array = fillArray(20, 100); // заполняем массив числами
	
	long result = evenNumbersCounter(array); // подсчет четных чисел
	System.out.println(result);
	
	int resultDiff = differanceMinMaxElement(array); // находим разницу между максимальным и минимальным элементами
	System.out.println(resultDiff);
	
	boolean value = twoZeroNumbers(array, 4); // поиск двух соседних одинаковых значений
	System.out.println(value);
	
    }
}