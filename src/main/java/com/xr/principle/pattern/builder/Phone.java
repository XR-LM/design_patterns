package com.xr.principle.pattern.builder;

/**
 * 手机
 *
 * @author xr
 */
public class Phone {
    private String cpu;

    private String screen;

    private String memory;

    private String mainBoard;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    public static final class Builder {
        private String cpu;

        private String screen;

        private String memory;

        private String mainBoard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Phone builder() {
            return new Phone(this);
        }
    }

}
