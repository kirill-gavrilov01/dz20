public class Main {
    public static void main(String[] args) {
        try {
            // Создаем правильный продукт
            SimpleProduct correctProduct = new SimpleProduct("Яблоко", 10.0);
            System.out.println("Правильный продукт успешно создан!");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            // Неверная цена (менее или равно 0)
            SimpleProduct wrongPriceProduct = new SimpleProduct("Апельсин", 0.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            // Правильная покупка товара со скидкой
            DiscountedProduct correctDiscountedProduct = new DiscountedProduct("Компьютер", 1000.0, 10);
            System.out.println("Правильно созданная покупка со скидкой!");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            // Неверная базовая цена (меньше или равна 0)
            DiscountedProduct wrongBasePriceProduct = new DiscountedProduct("Телефон", 0.0, 10);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            // Неверный процент скидки (за пределами разрешенного диапазона)
            DiscountedProduct wrongDiscountPercentProduct = new DiscountedProduct("Ноутбук", 800.0, 150);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}