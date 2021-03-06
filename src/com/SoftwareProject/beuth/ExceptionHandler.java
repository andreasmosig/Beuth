package com.SoftwareProject.beuth;

import java.io.PrintWriter;
import java.io.StringWriter;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;

/**
 * ExceptionHandler faengt nicht behandelte Ausnahmen im Code auf.
 * Thread UncaughtExceptionHandler wurde in jede Activity eingesetzt.
 * Liefert mittels der CrashActivity den relevanten Auszug aus dem Log
 * der Android-Entwicklungsumgebung sowie Informationen zum verwendeten Endgeraet.
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
public class ExceptionHandler implements
        java.lang.Thread.UncaughtExceptionHandler {
    private final AppCompatActivity myContext;
    private final String LINE_SEPARATOR = "\n";

    public ExceptionHandler(AppCompatActivity context) {
        myContext = context;
    }

    /**
     * UncaughtException
     * - Erstellung des Error-Reports
     * - Aufruf der CrashActivity
     * @param thread Log-Prozess zur Laufzeit
     * @param exception zu behandelnde Ausnahme
     */
    public void uncaughtException(Thread thread, Throwable exception) {
        StringWriter stackTrace = new StringWriter();
        exception.printStackTrace(new PrintWriter(stackTrace));
        StringBuilder errorReport = new StringBuilder();
        errorReport.append("************ CAUSE OF ERROR ************\n\n");
        errorReport.append(stackTrace.toString());
        errorReport.append("\n************ DEVICE INFORMATION ***********\n");
        errorReport.append("Brand: ");
        errorReport.append(Build.BRAND);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("Device: ");
        errorReport.append(Build.DEVICE);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("Model: ");
        errorReport.append(Build.MODEL);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("Id: ");
        errorReport.append(Build.ID);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("Product: ");
        errorReport.append(Build.PRODUCT);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("\n************ FIRMWARE ************\n");
        errorReport.append("SDK: ");
        errorReport.append(Build.VERSION.SDK);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("Release: ");
        errorReport.append(Build.VERSION.RELEASE);
        errorReport.append(LINE_SEPARATOR);
        errorReport.append("Incremental: ");
        errorReport.append(Build.VERSION.INCREMENTAL);
        errorReport.append(LINE_SEPARATOR);

        Intent intent = new Intent(myContext, CrashActivity.class);
        intent.putExtra("error", errorReport.toString());
        myContext.startActivity(intent);

        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(10);
    }
}