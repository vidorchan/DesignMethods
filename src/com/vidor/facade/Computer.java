package com.vidor.facade;

/**
 * Created by vidor on 2017/5/29.
 * 外观模式：解决类与类之家的依赖关系的
 */
public class Computer {
    public CPU cpu;
    public Disk disk;
    public Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startUp() {
        System.out.println("Computer startUp...");
        cpu.startUp();
        disk.startUp();
        memory.startUp();
        System.out.println("Computer startUp finished...");
    }

    public void shutDown() {
        System.out.println("Computer shutDown...");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("Computer shutDown finished...");
    }
}
