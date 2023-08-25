package com.company;

public class Main {

    public static void main(String[] args) throws NoPriorityException {
            MyLog.getInstance().setPriority(LogLevel.WARNING);


        MyLog.getInstance().log("Mensagem", LogLevel.INFO);
        MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING);
        MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);
        MyLog.getInstance().log("Mensagem customizada", LogLevel.CUSTOM_PRIORITY);

    }
}
