




public class Queue {
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Очередь заполнена");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Добавлен элемент " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Очередь пуста");
      return (-1);
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } 
      else {
        front++;
      }
      System.out.println("Удален элемент -> " + element);
      return (element);
    }
  }

  void display() {
    
    int i;
    if (isEmpty()) {
      System.out.println("Пустая очередь");
    } else {
      System.out.println("\nИндекс FRONT-> " + front);
      System.out.println("Элементы -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      System.out.println("\nИндекс REAR-> " + rear);
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    // функцию deQueue нельзя применять к пустой очереди
    q.deQueue();

    
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // Шестой элемент добавить нельзя — очередь заполнена
    q.enQueue(6);

    q.display();

    // Функция deQueue удаляет первый элемент — 1
    q.deQueue();

    // Теперь внутри очереди 4 элемента
    q.display();

  }
}
