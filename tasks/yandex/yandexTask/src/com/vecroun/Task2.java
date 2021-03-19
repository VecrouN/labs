package com.vecroun;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int rows = scanner.nextInt();

        Plane plane = new Plane(rows);

        String tmpString = "";


        int passengers = scanner.nextInt();

        ArrayList<Group> groups = new ArrayList<>();

        StringTokenizer st;
        Group tmpGroup;
        for (int i = 0; i < passengers; ++i) {
            tmpString = scanner.nextLine();
            st = new StringTokenizer(tmpString, " ");
            tmpGroup = new Group(Byte.parseByte(st.nextToken()), st.nextToken(), st.nextToken());
            groups.add(tmpGroup);
        }
        boolean isOk = false;
        for (int i = 0; i < passengers; ++i) {
            for (int j = 0; j < plane.getLength(); ++j) {
                if (groups.get(i).getSide().equals("left")) {
                    if (plane.getRow(j).getNumFreeSeats(0) >= groups.get(i).getNum()) {
                        if (groups.get(i).getPosition().equals("window")) {
                            switch (groups.get(i).getNum()) {
                                case (1) -> {
                                    if (plane.getRow(j).getSeat(0).isFree()) {
                                        System.out.println("Passengers can take seats: " + (j + 1) + "A");
                                        isOk = true;


                                    }
                                }
                                case (2) -> {
                                    if (plane.getRow(j).getSeat(0).isFree() && plane.getRow(j).getSeat(1).isFree()) {
                                        System.out.println("Passengers can take seats: " + (j + 1) + "A " + (j + 1) + "B");
                                        isOk = true;
                                    }
                                }
                                case (3) -> {
                                    if (plane.getRow(j).getSeat(0).isFree() && plane.getRow(j).getSeat(1).isFree() && plane.getRow(j).getSeat(2).isFree()) {
                                        System.out.println("Passengers can take seats: " + (j + 1) + "A " + (j + 1) + "B " + (j + 1) + "C");
                                        isOk = true;
                                    }
                                }
                            }
                            if (isOk) {

                                break;
                            }


                            if (plane.getRow(j).getSeat(0).isFree() && plane.getRow(j).getSeat(1).isFree()) {
                                System.out.print("Passengers can take seats: ");
                                for ()
                            }
                        } else {

                        }
                    }
                } else {
                    if (plane.getRow(j).getNumFreeSeats(1) >= groups.get(i).getNum()) {

                    }
                }
            }
        }
        for (int i = 0; i < passengers; ++i) {
            if (groups.get(i).side.equals("left")) {
                if (groups.get(i).position.equals("window")) {
                    for (int j = 0; j < rows; ++j) {
                        switch (groups.get(i).num) {
                            case (3): {
                                if (plane[j][0] == '.' && plane[j][0] == '.' && plane[j][0] == '.') {

                                } else {
                                    System.out.println("Cannot fulfill passengers requirements");
                                }
                            }
                            case (2): {
                                if () {

                                } else {
                                    System.out.println("Cannot fulfill passengers requirements");
                                }
                            }
                            case (1): {
                                if () {

                                } else {
                                    System.out.println("Cannot fulfill passengers requirements");
                                }
                            }

                        }
                    }

                }
            } else {

            }
        }


    }

    static class Group {
        private byte num;
        private String side; // left или right
        private String position; // строка aisle или window

        public Group(byte num, String side, String position) {
            this.num = num;
            this.side = side;
            this.position = position;
        }

        public byte getNum() {
            return num;
        }

        public String getPosition() {
            return position;
        }

        public String getSide() {
            return side;
        }
    }

    static class Seat {
        private boolean free;

        public Seat(boolean isFree) {
            this.free = isFree;
        }

        public boolean isFree() {
            return free;
        }

        public void setFree(boolean free) {
            this.free = free;
        }
    }

    static class Row {
        private Seat[] seats = new Seat[6];

        public Row(String rw) {
            for (int i = 0; i < 7; ++i) {
                if (i != 3) {
                    if (rw.charAt(i) == '.') {
                        this.seats[i].setFree(true);
                    } else {
                        this.seats[i].setFree(false);
                    }
                }
            }
        }

        public void setSeat(int num, boolean b) {
            seats[num].setFree(b);
        }

        public Seat getSeat(int i) {
            return seats[i];
        }

        public int getNumFreeSeats(int side) {
            int result = 0;
            if (side == 0) {
                for (int i = 0; i < 3; ++i) {
                    if (seats[i].isFree()) {
                        ++result;
                    }
                }
                return result;
            } else {
                for (int i = 4; i < 7; ++i) {
                    if (seats[i].isFree()) {
                        ++result;
                    }
                }
                return result;
            }
        }
    }

    static class Plane {
        private Row[] rows = new Row[100];
        private int length;

        public Plane(int length) {
            this.length = length;
            for (int i = 0; i < length; ++i) {
                rows[i] = new Row(scanner.nextLine());
            }
        }

        public Row getRow(int i) {
            return rows[i];
        }

        public int getLength() {
            return length;
        }

        public void updateRows(int line, int nums, int[] seats, int start) {
            for (int i = 0; i < length; ++i) {
                if (i == line) {

                    for (int j = 0; j < nums; ++j) {
                        rows[i].setSeat(seats[j], true);
                    }
                    for (int j = 0; j < 7; ++j) {
                        if (j == 3) {
                            System.out.print('_');
                        } else {
                            if ((j<3&&)||())
                            if (rows[i].getSeat(j).isFree()) {
                                System.out.print('.');
                            } else {
                                System.out.print('#');
                            }
                        }
                    }
                }
                for (int j = 0; j < 7; ++j) {
                    if (j == 3) {
                        System.out.print('_');
                    } else {
                        if (rows[i].getSeat(j).isFree()) {
                            System.out.print('.');
                        } else {
                            System.out.print('#');
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
