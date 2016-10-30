package com.bvan.oop.lesson5.fs.bad;

/**
 * @author bvanchuhov
 */
public class BadFSRunner {

    public static void main(String[] args) {
        BadDirectory root = new BadDirectory()
                .add(new BadFile(10))
                .add(new BadDirectory()
                        .add(new BadFile(20))
                        .add(new BadDirectory()
                                .add(new BadFile(30))
                        )
                        .add(new BadDirectory())
                )
                .add(new BadDirectory()
                        .add(new BadFile(40))
                );

        root.add(new BadDirectory().add(root));

        System.out.println(root.getSize());
    }
}
