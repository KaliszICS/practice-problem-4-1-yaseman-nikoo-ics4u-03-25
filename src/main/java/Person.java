public class Person {
        private String name;
        private int age, weight, height;
        private String eyeColour, hairColour;
        public Person(String name, int age, int height, int weight, String eyeColour, String hairColour){
            this.name = name;
            this.age=age;
            this.weight = weight;
            this.height= height;
            this.eyeColour= eyeColour;
            this.hairColour= hairColour;
        }
        public int getAge(){
            return this.age;
        }
        public int getHeight(){
            return this.height;
        }
        public int getWeight(){
            return this.weight;
        }
        public String getName(){
            return this.name;
        }
        public String getHairColour(){
            return this.hairColour;
        }
        public String getEyeColour(){
            return this.eyeColour;
        }
        
         
}

