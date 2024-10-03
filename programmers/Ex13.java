package programmers;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Ex13 {

    public static void main(String[] args) {
//        System.out.println(solution("34:33", "13:00", "00:55", "02:55", new String[] {"next", "prev"}));
//        System.out.println(solution("10:55", "00:05", "00:15", "06:55", new String[] {"prev", "next", "next"}));
//        System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[] {"next"}));
//        System.out.println(solution("30:35", "30:30", "01:00", "02:00", new String[] {"next"}));
//        System.out.println(solution("10:00", "10:00", "08:00", "09:00", new String[] {"next", "next", "next", "next"}));
//        System.out.println(solution( "30:00", "00:11", "05:00", "06:00", new String[] {"prev"}));
//        System.out.println(solution(  "59:59", "59:55", "00:00", "01:00", new String[] {"next"}));
        System.out.println(solution("30:00", "00:08", "00:00", "00:05", new String[] {"prev"}));
    }

    //    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
//        LocalTime vd_len = LocalTime.parse("00:" + video_len);
//        LocalTime p = LocalTime.parse("00:" + pos);
//        LocalTime op_s = LocalTime.parse("00:" + op_start);
//        LocalTime op_e = LocalTime.parse("00:" + op_end);
//
//        for (String command : commands) {
//            if (p.isAfter(op_s) && p.isBefore(op_e)) {
//                p = op_e;
//            }
//            if (Objects.equals(command, "next")) {
//                if (p.isAfter(vd_len.minusSeconds(10)) && p.isBefore(vd_len)) {
//                    p = vd_len;
//                    continue;
//                }
//                p = p.plusSeconds(10);
//            } else {
//                if (p.isAfter(LocalTime.of(0, 0, 0)) && p.isBefore(LocalTime.of(0, 0, 10))) {
//                    p = LocalTime.of(0, 0, 0);
//                    continue;
//                }
//                p = p.minusSeconds(10);
//            }
//            if (p.isAfter(op_s) && p.isBefore(op_e)) {
//                p = op_e;
//            }
//        }
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");
//        return p.format(formatter);
//    }
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        LocalTime vd_len = LocalTime.parse("00:" + video_len);
        LocalTime p = LocalTime.parse("00:" + pos);
        LocalTime op_s = LocalTime.parse("00:" + op_start);
        LocalTime op_e = LocalTime.parse("00:" + op_end);

        for (String command : commands) {
            if ((p.isAfter(op_s) && p.isBefore(op_e.plusSeconds(1))) || p.equals(op_s)) {
                p = op_e;
            }

            if (Objects.equals(command, "next")) {
                if (p.isAfter(vd_len.minusSeconds(10)) && p.isBefore(vd_len.plusSeconds(1))) {
                    p = vd_len;
                } else {
                    p = p.plusSeconds(10);
                }
            } else {
                if ((p.isAfter(LocalTime.of(0, 0, 0)) && p.isBefore(LocalTime.of(0, 0, 10))) ||
                        p.equals(LocalTime.of(0, 0, 0))) {
                    p = LocalTime.of(0, 0, 0);
                } else {
                    p = p.minusSeconds(10);
                }
            }
        }

        if ((p.isAfter(op_s) && p.isBefore(op_e.plusSeconds(1))) || p.equals(op_s)) {
            p = op_e;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");
        return p.format(formatter);
    }
}
