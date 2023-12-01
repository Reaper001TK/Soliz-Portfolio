package Searching_Sorting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Soliz_Searching_Sorting extends JFrame {

    private LinkedHashSet<Integer> numbersSet = new LinkedHashSet<>(); // Set to store unique numbers
    private JTextArea displayArea;

    public Soliz_Searching_Sorting() {
        super("Number List Manipulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        displayArea = new JTextArea(15, 20);
        displayArea.setEditable(false);
        panel.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Number");
        JButton sortButton = new JButton("Sort");
        JButton shuffleButton = new JButton("Shuffle");
        JButton reverseButton = new JButton("Reverse");

        JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
        buttonPanel.add(addButton);
        buttonPanel.add(sortButton);
        buttonPanel.add(shuffleButton);
        buttonPanel.add(reverseButton);

        panel.add(buttonPanel, BorderLayout.EAST);

        add(panel);

        // Action listener for the "Add Number" button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter a number:");
                try {
                    int number = Integer.parseInt(input);
                    numbersSet.add(number); // Add the entered number to the LinkedHashSet
                    updateDisplay(); // Update the display with the updated numbers
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });

        // Action listener for the "Sort" button
        sortButton.addActionListener(e -> {
            List<Integer> sortedList = new ArrayList<>(numbersSet);
            Collections.sort(sortedList); // Sort the list
            numbersSet = new LinkedHashSet<>(sortedList); // Update the LinkedHashSet with the sorted list
            updateDisplay(); // Update the display with the sorted numbers
        });

        // Action listener for the "Shuffle" button
        shuffleButton.addActionListener(e -> {
            List<Integer> shuffledList = new ArrayList<>(numbersSet);
            Collections.shuffle(shuffledList); // Shuffle the list
            numbersSet = new LinkedHashSet<>(shuffledList); // Update the LinkedHashSet with the shuffled list
            updateDisplay(); // Update the display with the shuffled numbers
        });

        // Action listener for the "Reverse" button
        reverseButton.addActionListener(e -> {
            List<Integer> reversedList = new ArrayList<>(numbersSet);
            Collections.reverse(reversedList); // Reverse the list
            numbersSet = new LinkedHashSet<>(reversedList); // Update the LinkedHashSet with the reversed list
            updateDisplay(); // Update the display with the reversed numbers
        });

        pack();
        setVisible(true);
    }

    // Update the display area with the current set of numbers
    private void updateDisplay() {
        displayArea.setText("");
        for (int num : numbersSet) {
            displayArea.append(num + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Soliz_Searching_Sorting::new);
    }
}
