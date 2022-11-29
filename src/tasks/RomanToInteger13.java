package tasks;

public class RomanToInteger13 {
    private String cache = "";

    public int submit(final String numerals) {
        int result = 0;
        String[] symbols = numerals.split("");
        for (String s : symbols) {
            if (s.equals("M")) {
                if (cache.isEmpty()) {
                    result += 1000;
                } else { //C
                    result += 900;
                    cache = "";
                }
                continue;
            }

            if (s.equals("D")) {
                if (cache.isEmpty()) {
                    result += 500;
                } else { //C
                    result += 400;
                    cache = "";
                }
                continue;
            }

            if (s.equals("C")) {
                if (cache.isEmpty()) {
                    cache = "C";
                } else {
                    if (cache.equals("C")) {
                        result += 200;
                    } else { //X
                        result += 90;
                    }
                    cache = "";
                }
                continue;
            }

            if (s.equals("L")) {
                if (cache.isEmpty()) {
                    result += 50;
                } else {
                    if (cache.equals("C")) {
                        result += 150;
                    } else { //X
                        result += 40;
                    }
                    cache = "";
                }
                continue;
            }

            if (s.equals("X")) {
                if (cache.isEmpty()) {
                    cache = "X";
                } else {
                    if (cache.equals("C")) {
                        result += 100;
                        cache = "X";
                    } else if (cache.equals("X")) {
                        result += 20;
                        cache = "";
                    } else { //I
                        result += 9;
                        cache = "";
                    }
                }
                continue;
            }

            if (s.equals("V")) {
                if (cache.isEmpty()) {
                    result += 5;
                } else {
                    if (cache.equals("C")) {
                        result += 105;
                    } else if (cache.equals("X")) {
                        result += 15;
                    } else { //I
                        result += 4;
                    }
                    cache = "";
                }
            }

            if (s.equals("I")) {
                if (cache.isEmpty()) {
                    cache = "I";
                } else {
                    if (cache.equals("C")) {
                        result += 100;
                        cache = "I";
                    } else if (cache.equals("X")) {
                        result += 10;
                        cache = "I";
                    } else {
                        result += 2;
                        cache = "";
                    }
                }
            }
        }

        if (!cache.isEmpty()) {
            if (cache.equals("C")) {
                result += 100;
            } else if (cache.equals("X")) {
                result += 10;
            } else { //I
                result += 1;
            }
        }
        return result;
    }
}
