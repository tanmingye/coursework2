int cardCompare(String card1, String card2) {
    char suit1 = card1.charAt(1);
    char suit2 = card2.charAt(1);
    int num1 = Integer.parseInt(card1.substring(0, 1));
    int num2 = Integer.parseInt(card2.substring(0, 1));
    if (suit1!= suit2) {
        if (suit1 == 'H') return -1;
        else if (suit2 == 'H') return 1;
        else if (suit1 == 'C') return -1;
        else if (suit2 == 'C') return 1;
        else if (suit1 == 'D') return -1;
        else if (suit2 == 'D') return 1;
        else return -1;
    } else {
        if (num1 < num2) return -1;
        else if (num1 > num2) return 1;
        else return 0;
    }
}

import java.util.ArrayList;
import java.util.List;
int cardCompare(String card1, String card2) {
    char suit1 = card1.charAt(1);
    char suit2 = card2.charAt(1);
    int num1 = Integer.parseInt(card1.substring(0, 1));
    int num2 = Integer.parseInt(card2.substring(0, 1));
    if (suit1!= suit2) {
        if (suit1 == 'H') return -1;
        else if (suit2 == 'H') return 1;
        else if (suit1 == 'C') return -1;
        else if (suit2 == 'C') return 1;
        else if (suit1 == 'D') return -1;
        else if (suit2 == 'D') return 1;
        else return -1;
    } else {
        if (num1 < num2) return -1;
        else if (num1 > num2) return 1;
        else return 0;
    }
}
ArrayList<String> bubbleSort(ArrayList<String> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        for (int j = 0; j < list.size() - 1 - i; j++) {
            String currentCard = list.get(j);
            String nextCard = list.get(j + 1);
            if (cardCompare(currentCard, nextCard) == 1) {
                list.set(j, nextCard);
                list.set(j + 1, currentCard);
            }
        }
    }
    return list;
}
import java.util.ArrayList;
import java.util.List;
int cardCompare(String card1, String card2) {
    char suit1 = card1.charAt(1);
    char suit2 = card2.charAt(1);
    int num1 = Integer.parseInt(card1.substring(0, 1));
    int num2 = Integer.parseInt(card2.substring(0, 1));
    if (suit1!= suit2) {
        if (suit1 == 'H') return -1;
        else if (suit2 == 'H') return 1;
        else if (suit1 == 'C') return -1;
        else if (suit2 == 'C') return 1;
        else if (suit1 == 'D') return -1;
        else if (suit2 == 'D') return 1;
        else return -1;
    } else {
        if (num1 < num2) return -1;
        else if (num1 > num2) return 1;
        else return 0;
    }
}


ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
    ArrayList<String> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < left.size() && j < right.size()) {
        if (cardCompare(left.get(i), right.get(j)) <= 0) {
            result.add(left.get(i));
            i++;
        } else {
            result.add(right.get(j));
            j++;
        }
    }
    while (i < left.size()) {
        result.add(left.get(i));
        i++;
    }
    while (j < right.size()) {
        result.add(right.get(j));
        j++;
    }
    return result;
}
ArrayList<String> mergeSort(ArrayList<String> list) {
    if (list.size() <= 1) {
        return list;
    }
    int mid = list.size() / 2;
    ArrayList<String> left = new ArrayList<>(list.subList(0, mid));
    ArrayList<String> right = new ArrayList<>(list.subList(mid, list.size()));

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
int cardCompare(String card1, String card2) {
    char suit1 = card1.charAt(1);
    char suit2 = card2.charAt(1);
    int num1 = Integer.parseInt(card1.substring(0, 1));
    int num2 = Integer.parseInt(card2.substring(0, 1));
    if (suit1!= suit2) {
        if (suit1 == 'H') return -1;
        else if (suit2 == 'H') return 1;
        else if (suit1 == 'C') return -1;
        else if (suit2 == 'C') return 1;
        else if (suit1 == 'D') return -1;
        else if (suit2 == 'D') return 1;
        else return -1;
    } else {
        if (num1 < num2) return -1;
        else if (num1 > num2) return 1;
        else return 0;
    }
}
ArrayList<String> bubbleSort(ArrayList<String> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        for (int j = 0; j < list.size() - 1 - i; j++) {
            String currentCard = list.get(j);
            String nextCard = list.get(j + 1);
            if (cardCompare(currentCard, nextCard) == 1) {
                list.set(j, nextCard);
                list.set(j + 1, currentCard);
            }
        }
    }
    return list;
}
long measureBubbleSort(String fileName) {
    ArrayList<String> cardList = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine())!= null) {
            cardList.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
        return -1;
    }
    long startTime = System.currentTimeMillis();
    bubbleSort(cardList);
    long endTime = System.currentTimeMillis();
    return endTime - startTime;
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
int cardCompare(String card1, String card2) {
    char suit1 = card1.charAt(1);
    char suit2 = card2.charAt(1);
    int num1 = Integer.parseInt(card1.substring(0, 1));
    int num2 = Integer.parseInt(card2.substring(0, 1));
    if (suit1!= suit2) {
        if (suit1 == 'H') return -1;
        else if (suit2 == 'H') return 1;
        else if (suit1 == 'C') return -1;
        else if (suit2 == 'C') return 1;
        else if (suit1 == 'D') return -1;
        else if (suit2 == 'D') return 1;
        else return -1;
    } else {
        if (num1 < num2) return -1;
        else if (num1 > num2) return 1;
        else return 0;
    }
}
ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
    ArrayList<String> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < left.size() && j < right.size()) {
        if (cardCompare(left.get(i), right.get(j)) <= 0) {
            result.add(left.get(i));
            i++;
        } else {
            result.add(right.get(j));
            j++;
        }
    }
    while (i < left.size()) {
        result.add(left.get(i));
        i++;
    }
    while (j < right.size()) {
        result.add(right.get(j));
        j++;
    }
    return result;
}
ArrayList<String> mergeSort(ArrayList<String> list) {
    if (list.size() <= 1) {
        return list;
    }
    int mid = list.size() / 2;
    ArrayList<String> left = new ArrayList<>(list.subList(0, mid));
    ArrayList<String> right = new ArrayList<>(list.subList(mid, list.size()));
    left = mergeSort(left);
    right = mergeSort(right);
    return merge(left, right);
}
long measureMergeSort(String fileName) {
    ArrayList<String> cardList = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine())!= null) {
            cardList.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
        return -1;
    }
    long startTime = System.currentTimeMillis();
    mergeSort(cardList);
    long endTime = System.currentTimeMillis();
    return endTime - startTime;
}

void sortComparison(String[] filenames) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("sortComparison.csv"));
        writer.write("         , " + filenames[0] + ", " + filenames[1] + ", " + filenames[2] + "\n");
        long bubbleSortTime1 = measureBubbleSort(filenames[0]);
        long bubbleSortTime2 = measureBubbleSort(filenames[1]);
        long bubbleSortTime3 = measureBubbleSort(filenames[2]);
        writer.write("bubbleSort, " + bubbleSortTime1 + ", " + bubbleSortTime2 + ", " + bubbleSortTime3 + "\n");
        long mergeSortTime1 = measureMergeSort(filenames[0]);
        long mergeSortTime2 = measureMergeSort(filenames[1]);
        long mergeSortTime3 = measureMergeSort(filenames[2]);
        writer.write("mergeSort, " + mergeSortTime1 + ", " + mergeSortTime2 + ", " + mergeSortTime3 + "\n");
        writer.close();
}