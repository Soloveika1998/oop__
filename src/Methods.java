public interface Methods {
    //Задача №1 Создает обобщенный метод для вывода переменной любого типа в консоль
    static <T> void printElem(T elem) {
        System.out.println(elem);
    }

    //Задча №2 Создает обобщенный метод для печати массива, состоящего из любых типов данных (При создании
    // у меня возник вопрос, с которым я так до конца и не разобрался, почему в чем отличие static и без него
    // и почему у меня возникала ошибка Syntax error on token "(", Type expected after this token,
    // а исправилась она только после добавления обобщения после public <T>, если у меня метод ничего не возвращает)
    //При этом НЕ static методы работать в main не хотят._
    public static <E> void printArray(E [] array) {
        for (E item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();
    }
    
}  
