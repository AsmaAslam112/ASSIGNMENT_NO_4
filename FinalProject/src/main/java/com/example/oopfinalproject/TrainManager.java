package com.example.oopfinalproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrainManager {


    private ObservableList<Train> list3 = FXCollections.observableArrayList();
    private ObservableList<Train> list4 = FXCollections.observableArrayList();

    public ObservableList<Train> readfromfile(File file) {
        list3.clear();
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bf.readLine()) != null) {

                String[] parts = line.trim().split("\\s+");
                if (parts.length == 9) {
                    try {
                        int part6 = Integer.parseInt(parts[5]);
                        int part7 = Integer.parseInt(parts[6]);
                        list3.add(new Train(parts[0], parts[1], parts[2], parts[3], parts[4], part6, part7, parts[7], parts[8]));
                    } catch (NumberFormatException e) {
                        System.err.println("Error: Invalid number format in line: " + line);
                    }
                } else {
                    System.err.println("Skipping line due to insufficient data: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list3;
    }


    public ObservableList<Train> getAllBuses() {

        return list3;
    }

    public static void updateFromField(String busId, String newFrom, File file) {
        boolean busFound = false;
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 9 && parts[0].equals(busId)) {
                    busFound = true;
                    parts[1] = newFrom;
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                System.out.println("Successfully updated 'From' field for bus with ID " + busId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }

    public static void updateToField(String busId, String newFrom, File file) {
        boolean busFound = false;
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");


                if (parts.length == 9 && parts[0].equals(busId)) {
                    busFound = true;
                    parts[2] = newFrom;
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                System.out.println("Successfully updated 'From' field for bus with ID " + busId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }

    public static void updateDateField(String busId, String newDate, File file) {
        boolean busFound = false;
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");


                if (parts.length ==9 && parts[0].equals(busId)) {
                    busFound = true;
                    parts[3] = newDate;
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                System.out.println("Successfully updated 'From' field for bus with ID " + busId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }
    //available seats updation
    public static void updateAvailseats(String busId, String newDate, File file) {
        boolean busFound = false;
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");


                if (parts.length == 9 && parts[0].equals(busId)) {
                    busFound = true;
                    parts[6] = newDate;
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                System.out.println("Successfully updated 'From' field for bus with ID " + busId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }
    public static void Availseats(String trainId, String newseat, File file) {
        boolean busFound = false;
        String up;
        List<String> updatedLines = new ArrayList<>();
        int newnumber = Integer.parseInt(newseat);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 9 && parts[0].equals(trainId)) {
                    busFound = true;

                    int availableSeats = Integer.parseInt(parts[6]);
                    if (availableSeats - newnumber >= 0) {
                        availableSeats -= newnumber;
                        parts[6] = String.valueOf(availableSeats);
                    } else {
                        System.out.println("No more seats can be updated");
                        return;
                    }
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + trainId + " not found in the list.");
        }
    }
    public static void Cancelseats(String busId, String newseat, File file) {
        boolean busFound = false;
        String up;
        List<String> updatedLines = new ArrayList<>();
        int newnumber = Integer.parseInt(newseat);


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 9 && parts[0].equals(busId)) {
                    busFound = true;

                    int availableSeats = Integer.parseInt(parts[6]);
                    if (availableSeats + newnumber >= 0) {
                        availableSeats += newnumber;
                        parts[6] = String.valueOf(availableSeats);
                    } else {
                        System.out.println("No more seats can be updated");
                        return;
                    }
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }

    //time field updation
    public static void updateTimefield(String busId, String newTime, File file) {
        boolean busFound = false;
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");


                if (parts.length == 9 && parts[0].equals(busId)) {
                    busFound = true;
                    parts[4] = newTime;
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                System.out.println("Successfully updated 'From' field for bus with ID " + busId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }
    public static void updateCancelField(String busId, String newstring, File file) {
        boolean busFound = false;
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");


                if (parts.length == 9 && parts[0].equals(busId)) {
                    busFound = true;
                    parts[7] = newstring;
                    line = String.join(" ", parts);
                }

                updatedLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (busFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                System.out.println("Successfully updated 'From' field for bus with ID " + busId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Bus with ID " + busId + " not found in the list.");
        }
    }


    public void updateBus(String busId) {
        boolean busFound = false;

        for (Train train : list3) {
            if (train.getBusId().equals(busId)) {
                busFound = true;
                System.out.println("Bus found! Current details: " );
                boolean istrue = true;
                while(istrue) {

                }
                if(!busFound) {
                    System.out.println("Bus with ID " + busId + " not found.");}
            }}
    }

    public ObservableList<Train> readfile(File file, String from, String to, String date) {
        list4.clear(); // Clear previous list data
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length == 9) {
                    try {
                        // Get the date in the correct format
                        String trainDate = parts[3]; // Assuming the date is at index 3 in the file
                        if (trainDate.equals(date) && parts[1].equals(from) && parts[2].equals(to)) {
                            int part6 = Integer.parseInt(parts[5]);
                            int part7 = Integer.parseInt(parts[6]);
                            list4.add(new Train(parts[0], parts[1], parts[2], parts[3], parts[4], part6, part7, parts[7], parts[8]));
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error: Invalid number format in line: " + line);
                    }
                } else {
                    System.err.println("Skipping line due to insufficient data: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list4; // Return the filtered list
    }


    public ObservableList<Train> getBuses() {

        return list4;
    }

}
