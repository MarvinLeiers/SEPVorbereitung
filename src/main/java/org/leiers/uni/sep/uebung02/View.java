package org.leiers.uni.sep.uebung02;

public class View {
    public void showMessage(final String message) {
        System.out.print("[Übung02]: " + message);
    }

    public void showError(final String errorMessage) {
        System.out.println("[ERROR]: " + errorMessage);
    }
}
