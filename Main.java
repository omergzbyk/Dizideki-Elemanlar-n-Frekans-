import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        int[] array = {10,15,25,10,58,25,10};
        int[] duplicate = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int say = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            System.out.println(array[i] + " sayisindan " + count + " tane var");
        }
         */
        int[] list = {10,15,25,10,58,25,10};
        int[] frequency = new int[list.length];
        int visited = -1;
        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    frequency[j] = visited;
                    count++;
                }
            }

            if (frequency[i] != visited) {
                frequency[i] = count;
            }
        }

        System.out.println("Tekrar sayilari :");
        for (int i = 0; i < list.length; i++) {
            if (frequency[i] != visited) {
                System.out.println(list[i] + " sayisi " + frequency[i] + " kere tekrar edildi.");
            }
        }
    }
}
