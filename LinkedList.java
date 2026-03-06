public class LinkedList {
    
    Elemen head;

    public void append(String value){

        Elemen newElemen = new Elemen(value);

        if(head == null){
            head = newElemen;
            return;
        }

        Elemen current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newElemen;
        newElemen.prev = current;
    }

    public void printAll(){

        Elemen current = head;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int hitungElemen(){
        int jumlah = 0;
        Elemen current = head;
        while (current != null) {
            jumlah++;
            current = current.next;
        }
        return jumlah;
    }

    public void tampilkanElemen(int index) {
        Elemen current = head;
        int posisi = 0;
        while (current !=null) {
            if (posisi == index) {
                System.out.println("Elemen di index " + index + "adalah: " + current .value);
                return;
            }
            current = current.next;
            posisi++;
        }
        

        }

    public void prepend(String value) {
        Elemen newElemen = new Elemen(value);
        if(head != null) {
            newElemen.next =head;
            head.prev = newElemen;
        }
        head = newElemen;
    }

    public void insertAt(int index, String value) {
        if (index <= 0) {
            prepend(value);
            return;
        }
        Elemen newElemen = new Elemen(value);
        Elemen current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            append(value); }
        else {
            newElemen.next = current.next;
            newElemen.prev = current;
            current.next.prev =newElemen;
            current.next = newElemen;
        }
    }}

    