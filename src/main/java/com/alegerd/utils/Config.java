package com.alegerd.utils;

public class Config {

    public static Integer timeInterval = 1000;
    public static String finalMessage = "FIN";
    public static boolean stopDrawing = false;

    public static boolean isStopDrawing() {
        return stopDrawing;
    }

    public static void setStopDrawing(boolean stopDrawing) {
        Config.stopDrawing = stopDrawing;
    }

    public static String getFinalMessage() {
        return finalMessage;
    }

    public static void setFinalMessage(String finalMessage) {
        Config.finalMessage = finalMessage;
    }

    public static Integer getTimeInterval() {
        return timeInterval;
    }

    public static void setTimeInterval(Integer timeInterval) {
        Config.timeInterval = timeInterval;
    }
}
