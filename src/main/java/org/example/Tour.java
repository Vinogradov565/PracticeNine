package org.example;

public class Tour {
    private AirTicket departureTicket;
    private AirTicket returnTicket;
    private Hotel hotel;

    public Tour() {
        generateTickets();
        generateHotel();
    }

    private void generateTickets() {
        departureTicket = new AirTicket(generateRandomFlight(), generateRandomTime());
        returnTicket = new AirTicket(generateRandomFlight(), generateRandomTime());
    }

    private void generateHotel() {
        String country = "Sample Country"; // Здесь можно использовать случайное значение
        String city = "Sample City"; // Здесь можно использовать случайное значение
        String hotelName = "Sample Hotel"; // Здесь можно использовать случайное значение
        int stars = generateRandomStars();
        String roomClass = generateRandomRoomClass();

        hotel = new Hotel(hotelName, country, city, stars, roomClass);
    }

    private String generateRandomFlight() {
        // Генерация случайного места и времени взлета/посадки
        return "Sample Flight"; // Здесь можно использовать случайное значение
    }

    private String generateRandomTime() {
        // Генерация случайного времени
        return "Sample Time"; // Здесь можно использовать случайное значение
    }

    private int generateRandomStars() {
        // Генерация случайного количества звезд для отеля
        return 5; // Здесь можно использовать случайное значение
    }

    private String generateRandomRoomClass() {
        // Генерация случайного класса номера
        return "Sample Room Class"; // Здесь можно использовать случайное значение
    }

    public void printTourInfo() {
        System.out.println("Departure Ticket: " + departureTicket);
        System.out.println("Return Ticket: " + returnTicket);
        System.out.println("Hotel: " + hotel);
    }
}
