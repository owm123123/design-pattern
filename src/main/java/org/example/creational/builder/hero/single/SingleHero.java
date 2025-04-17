package org.example.creational.builder.hero;

public class SingleHero {
    private String hair;
    private String body;

    public static class Builder {
        private String hair = "default";
        private String body = "default";

        public Builder hair(String hair) {
            this.hair = hair;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public SingleHero build() {
            SingleHero h = new SingleHero();
            h.hair = this.hair;
            h.body = this.body;
            return h;
        }
    }

    @Override
    public String toString() {
        return "SingleHero{" +
                "hair='" + hair + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        SingleHero hero = new SingleHero.Builder()
                .hair("red")
                .body("blue")
                .build();
        System.out.println(hero);
    }
}
