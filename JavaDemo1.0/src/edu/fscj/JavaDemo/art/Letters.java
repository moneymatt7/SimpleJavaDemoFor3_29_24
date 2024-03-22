package edu.fscj.JavaDemo.art;

import java.util.HashMap;
import java.util.Map;

public class Letters {

    public static final Map<Character, String[]> ASCII_CHAR_MAP =
            new HashMap<>();

    static {
        // initialize ASCII art chars
        ASCII_CHAR_MAP.put('A', new String[]{
                "   A   ",
                "  A A  ",
                " AAAAA ",
                "A     A",
                "A     A"
        });

        ASCII_CHAR_MAP.put('B', new String[]{
                "BBBBB  ",
                "B    B ",
                "BBBBB  ",
                "B    B ",
                "BBBBB  "
        });

        ASCII_CHAR_MAP.put('C', new String[]{
                " CCCCC ",
                "C      ",
                "C      ",
                "C      ",
                " CCCCC "
        });

        ASCII_CHAR_MAP.put('D', new String[]{
                "DDDDD  ",
                "D    D ",
                "D     D",
                "D    D ",
                "DDDDD  "
        });

        ASCII_CHAR_MAP.put('E', new String[]{
                "EEEEEEE",
                "E      ",
                "EEEE   ",
                "E      ",
                "EEEEEEE"
        });

        ASCII_CHAR_MAP.put('F', new String[]{
                "FFFFFFF",
                "F      ",
                "FFFF   ",
                "F      ",
                "F      "
        });

        ASCII_CHAR_MAP.put('G', new String[]{
                " GGGGG ",
                "G      ",
                "G  GGG ",
                "G    G ",
                " GGGG  "
        });

        ASCII_CHAR_MAP.put('H', new String[]{
                "H     H",
                "H     H",
                "HHHHHHH",
                "H     H",
                "H     H"
        });

        ASCII_CHAR_MAP.put('I', new String[]{
                " IIIII ",
                "   I   ",
                "   I   ",
                "   I   ",
                " IIIII "
        });

        ASCII_CHAR_MAP.put('J', new String[]{
                "     J ",
                "     J ",
                "     J ",
                "J    J ",
                " JJJJ  "
        });

        ASCII_CHAR_MAP.put('K', new String[]{
                "K    K ",
                "K   K  ",
                "KKK    ",
                "K   K  ",
                "K    K "
        });

        ASCII_CHAR_MAP.put('L', new String[]{
                "L      ",
                "L      ",
                "L      ",
                "L      ",
                "LLLLLLL"
        });

        ASCII_CHAR_MAP.put('M', new String[]{
                "M     M",
                "MM   MM",
                "M M M M",
                "M  M  M",
                "M     M"
        });

        ASCII_CHAR_MAP.put('N', new String[]{
                "N     N",
                "NN    N",
                "N N   N",
                "N  N  N",
                "N   NN",
                "       "
        });

        ASCII_CHAR_MAP.put('O', new String[]{
                " OOOO  ",
                "O    O ",
                "O    O ",
                "O    O ",
                " OOOO  "
        });

        ASCII_CHAR_MAP.put('P', new String[]{
                "PPPPP  ",
                "P    P ",
                "PPPPP  ",
                "P      ",
                "P      "
        });

        ASCII_CHAR_MAP.put('Q', new String[]{
                " QQQQ  ",
                "Q    Q ",
                "Q  Q Q ",
                "Q   QQ ",
                " QQQQ Q"
        });

        ASCII_CHAR_MAP.put('R', new String[]{
                "RRRRR  ",
                "R    R ",
                "RRRRR  ",
                "R   R  ",
                "R    R "
        });

        ASCII_CHAR_MAP.put('S', new String[]{
                " SSSSS ",
                "S      ",
                " SSSS  ",
                "     S ",
                " SSSS  "
        });

        ASCII_CHAR_MAP.put('T', new String[]{
                "TTTTTTT",
                "   T   ",
                "   T   ",
                "   T   ",
                "   T   "
        });

        ASCII_CHAR_MAP.put('U', new String[]{
                "U     U",
                "U     U",
                "U     U",
                "U     U",
                " UUUUU "
        });

        ASCII_CHAR_MAP.put('V', new String[]{
                "V     V",
                "V     V",
                " V   V ",
                "  V V  ",
                "   V   "
        });

        ASCII_CHAR_MAP.put('W', new String[]{
                "W     W",
                "W     W",
                "W  W  W",
                "W W W W",
                " W   W "
        });

        ASCII_CHAR_MAP.put('X', new String[]{
                "X     X",
                " X   X ",
                "  XXX  ",
                " X   X ",
                "X     X"
        });

        ASCII_CHAR_MAP.put('Y', new String[]{
                "Y     Y",
                " Y   Y ",
                "  YYY  ",
                "   Y   ",
                "   Y   "
        });

        ASCII_CHAR_MAP.put('Z', new String[]{
                "ZZZZZZZ",
                "     Z ",
                "   Z   ",
                " Z     ",
                "ZZZZZZZ"
        });

        // also added some numbers
        ASCII_CHAR_MAP.put('1', new String[]{
                "   1   ",
                "  11   ",
                "   1   ",
                "   1   ",
                " 11111 "
        });

        ASCII_CHAR_MAP.put('2', new String[]{
                " 2222  ",
                "    2  ",
                " 2222  ",
                " 2     ",
                " 22222 "
        });

        ASCII_CHAR_MAP.put('3', new String[]{
                " 3333  ",
                "    3  ",
                " 3333  ",
                "    3  ",
                " 3333  "
        });

        ASCII_CHAR_MAP.put('4', new String[]{
                " 4  4  ",
                " 4  4  ",
                " 44444 ",
                "    4  ",
                "    4  "
        });

        ASCII_CHAR_MAP.put('5', new String[]{
                " 55555 ",
                " 5     ",
                " 5555  ",
                "    5  ",
                " 5555  "
        });

        ASCII_CHAR_MAP.put('6', new String[]{
                "  666  ",
                " 6     ",
                " 6666  ",
                " 6   6 ",
                "  666  "
        });

        ASCII_CHAR_MAP.put('7', new String[]{
                " 77777 ",
                "    7  ",
                "   7   ",
                "  7    ",
                " 7     "
        });

        ASCII_CHAR_MAP.put('8', new String[]{
                "  888  ",
                " 8   8 ",
                "  888  ",
                " 8   8 ",
                "  888  "
        });

        ASCII_CHAR_MAP.put('9', new String[]{
                "  999  ",
                " 9   9 ",
                "  9999 ",
                "    9  ",
                "  99   "
        });

        // some puntuation

        ASCII_CHAR_MAP.put('.', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "   .   "
        });

        ASCII_CHAR_MAP.put(',', new String[]{
                "       ",
                "       ",
                "       ",
                "   ,   ",
                "  ,    "
        });

        ASCII_CHAR_MAP.put(';', new String[]{
                "   ;   ",
                "       ",
                "   ;   ",
                "   ;   ",
                "  ;    "
        });

        ASCII_CHAR_MAP.put(':', new String[]{
                "       ",
                "   :   ",
                "       ",
                "   :   ",
                "       "
        });

        ASCII_CHAR_MAP.put('\'', new String[]{
                "   '   ",
                "  '    ",
                "       ",
                "       ",
                "       "
        });

        ASCII_CHAR_MAP.put('"', new String[]{
                "  \" \"  ",
                "  \" \"  ",
                "       ",
                "       ",
                "       "
        });

        ASCII_CHAR_MAP.put('?', new String[]{
                " ????? ",
                "    ?  ",
                "  ???  ",
                "       ",
                "  ???  "
        });

        ASCII_CHAR_MAP.put('!', new String[]{
                "  !!!  ",
                "  !!!  ",
                "  !!!  ",
                "       ",
                "  !!!  "
        });
    }
}

