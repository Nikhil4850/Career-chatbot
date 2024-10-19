import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CareerChatbot {
    private Map<String, String> responses;

    public CareerChatbot() {
        responses = new HashMap<>();
        initializeResponses();
    }

    private void initializeResponses() {
        responses.put("hi", "How can I help you with your career choices today?");
        responses.put("carreer", "Start by assessing your interests and strengths. Take career assessments and reflect on what you enjoy doing.");
        responses.put("salary or passion", "Aim for a balance between passion and salary. Consider job satisfaction alongside financial stability.");
        responses.put("education", "Education is important, especially for fields that require specific qualifications, but skills and experience also matter.");
        responses.put("change my mind", "It's normal to change your mind. Stay open to new experiences and adapt as needed.");
        responses.put("gain experience", "Look for internships, part-time jobs, or volunteer opportunities related to your field.");
        responses.put("networking and mentorship", "Networking can open doors to opportunities, while a mentor can provide guidance and industry insights.");
        responses.put("pressure to choose", "Take your time and explore your options. Discuss your feelings with trusted individuals.");
        responses.put("multiple interests", "Explore ways to combine your interests or consider roles in interdisciplinary fields.");
        responses.put("research career options", "Use resources like career websites, informational interviews, and networking to gather information.");
        responses.put("unsure about my skills", "Focus on building skills through education and experience, and seek feedback to improve.");
        responses.put("hello", "How can I help you with your career choices today?");
        responses.put("what are the best career option", "Engineering");
        responses.put("how do i choose career path", "identify your intrest");
        responses.put("can you talk in marathi", "हो");
    }

    public String getResponse(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Please ask a career-related question.";
        }

        for (String key : responses.keySet()) {
            if (input.toLowerCase().contains(key)) {
                return responses.get(key);
            }
        }
        return "I'm sorry, I don't have an answer for that. Try asking something else about careers.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CareerChatbot chatbot = new CareerChatbot();
        String userInput;

        System.out.println("Career Chatbot: Hi! How can I help you with your career choices today?");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Career Chatbot: Goodbye! Good luck with your career choices!");
                break;
            }

            String response = chatbot.getResponse(userInput);
            System.out.println("Career Chatbot: " + response);
        }

        scanner.close();
    }
}
