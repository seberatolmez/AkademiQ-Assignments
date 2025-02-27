import java.util.*;

public class Main {
    public static void main(String[] args) {

            question1();
            question2();
            question3();
            question4();
            question5();
            question6();
            question7();
            question8();
            question9();
            question10();

        }
    public static void question1(){
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int number ;
        int length = 10;
        int[] numberList = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            numberList[i] = number;
        }
        for (int i = 0; i < length; i++) {
            average += numberList[i];
            if (numberList[i] > 50){
                System.out.println(numberList[i] + " is greater than 50");
            }
        }
        average = average / length;
        System.out.println("Average : " + average);
    }

    public static void question2(){
       int[] numberList = {1,4,5,6,7,6,5,5,3,2,3};
       int count = 0;

        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeats = new HashSet<>();

        for (int num : numberList) {
            if (!seen.add(num)) {
                repeats.add(num);
            }
        }
        if (repeats.isEmpty()){
            System.out.println("No repeats found");
        }else {
            System.out.println("Repeats : " + repeats);
        }
    }
    public static void question3(){
        int[] numberList = {1,4,5,6,7,6,-5,-3,-2,3};
        int negativeSum = 0;
        int positiveSum = 0;
        for (int num : numberList) {
            if (num<0){
                negativeSum += num;
            }else if (num>0){
                positiveSum += num;
            }
        }
        System.out.println("Negative Sum : " + negativeSum);
        System.out.println("Positive Sum : " + positiveSum);
    }

    public static void question4(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {
                if (numberList.get(i)>numberList.get(j)){
                    int temp = numberList.get(i);
                    numberList.set(i, numberList.get(j));
                    numberList.set(j, temp);
                }
            }
        }
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i)+" ");
        }
    }

    public static void question5(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter word: ");
            String word = scanner.next();
            wordList.add(word);
        }
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).compareTo(wordList.get(j))>0){
                    String temp = wordList.get(i);
                    wordList.set(i,wordList.get(j));
                    wordList.set(j,temp);
                }
            }
        }
        System.out.print("Here is the alphabetical order: ");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(wordList.get(i)+" ");

        }
        System.out.println();
    }

    public static void question6(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i)%2==0){
                evenNumberList.add(numberList.get(i));
            }
        }
        for (int evenNumber : evenNumberList) {
            System.out.print(evenNumber+" ");
        }

    }

    public static void question7(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Bingöl");
        wordList.add("İzmir");
        wordList.add("Antalya");
        wordList.add("Ankara");
        wordList.add("İstanbul");
        System.out.println("Enter the word you want to check: ");
        String word = scanner.next();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(word)){
                System.out.println(wordList.get(i)+" founded in the index of "+i);
            }
        }
    }

    public static void question8(){
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(12);
        numberList.add(23);
        numberList.add(34);
        numberList.add(21);
        numberList.add(65);

        int minNumber = numberList.get(0);
        int maxNumber = numberList.get(0);

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i)<minNumber){
                minNumber = numberList.get(i);
            }
            if (numberList.get(i)>maxNumber){
                maxNumber = numberList.get(i);
            }
        }
        System.out.println("Min number : " + minNumber);
        System.out.println("Max number : " + maxNumber);
    }

    public static void question9(){
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);

        for (int i = 0; i < numberList.size(); i++) { // size methodu ile listemizin index uzunluğunu alabiliriz
            if (numberList.get(i)%2==0){  // get methodu ile i indexindeki veriyi okuyabiliriz
                numberList.set(i,numberList.get(i)+1); // set methodu ile i indexine yeni değer atayabiliriz
            }
        }
        numberList.remove(numberList.size()-1); // remove methodu ile listemizdeki verileri silebiliriz

        numberList.clear(); // clear methodu ile bütün arrayi temizleyebiliriz .
        System.out.println(numberList);                // Output : []
    }

    public static void question10(){
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(7);
        numbers1.add(3);
        numbers1.add(9);
        numbers1.add(-33);
        numbers1.sort(Comparator.naturalOrder()); // sort methodu ile verileri belli bir sıraya göre sıralayabilirz.arama ve analiz gibi işlemleri kolaylaştırır.
        System.out.println("sorted ArrayList: " + numbers1);

        // binary search bir ikili arama yöntemidir. sıralı öğeleri analiz etmek için orta öğrenin bulmaya odaklanıldığı bir arama biçimidir.
        int a[] = {2,3,5,6,8};
        int x= 0;
        int y= a.length -1;
        int z = 10;

        while (x<=y){
            int m = (x+y)/2;

            if (a[m] == x){
                //return m;
            } else if (a[m] > x) {
                y = m-1;
            }
            else {
                x = m+1;
            }

            }
        // copyRange methodu ile bir arrayi istediğimiz index aralıklarında  kopyalayabiliriz
        int[] arr1 = {10, 20, 30, 40,};
        int[] arr2 = Arrays.copyOfRange(arr1, 1, 3);

        System.out.println("Copied Array: " + Arrays.toString(arr2));

        // equals methodu ile iki arrayi karşılaştırıp birbirine eşit olup olmadıklarını anlayabiliriz
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        if (numbers2.equals(numbers1)){
            System.out.println("Arrays are same");
        }else {
            System.out.println("Arrays are different");
        }

        // fill methodu ile bir arrayin içindeki verileri istediğimiz veri ile doldurabiliriz
        Collections.fill(numbers2, 12);


    }
}



