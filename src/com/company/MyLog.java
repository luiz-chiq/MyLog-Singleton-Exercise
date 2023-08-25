package com.company;

import java.util.Locale;

public class MyLog {

    private static MyLog MY_LOG;
    private static LogLevel priority;

    private MyLog() {
    }

    public static MyLog getInstance(){
        if (MY_LOG == null)
            MY_LOG = new MyLog();
        return MY_LOG;
    }

    public void setPriority(LogLevel priority){
        MyLog.priority = priority;
    }

    public void log(String message, LogLevel priority) throws NoPriorityException {
        if (MyLog.priority == null) throw new NoPriorityException();
        if (priority.ordinal() >= MyLog.priority.ordinal()) {
            StringBuilder sb;
            sb = new StringBuilder();
            sb.append("> ");
            sb.append(priority.toString().charAt(0));
            sb.append(priority.toString().substring(1).toLowerCase(Locale.ROOT));
            sb.append(" message: ");
            sb.append(message);
            System.out.println(sb);
        }

    }




}
