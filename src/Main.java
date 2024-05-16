public class Main {
    public static void main(String[] args) {
      Cow [] farms1 ={new Cow(120,10,'m',"nnn"),
              new Cow( 121,11,'m',"ww"),
              new Cow(111,13,'j',"j"),
              new Cow( 123,11,'m',"wwe"),
              new Cow(131,13,'j',"jer"),
              new Sheep(40,3,'m',"tyu"),
              new Sheep(50,2,'j',"teu"),
              new Sheep(60,2,'m',"tku"),
              new Horse(240,9,'m',"qwe","kara"),
              new Horse(250,7,'j',"qe","ak")};
      Cow [] farms2 ={new Cow(120,10,'m',"nnn"),
              new Sheep(40,3,'m',"tyu"),
              new Horse(250,7,'j',"qe","ak")};
        Farm farm =new Farm(farms1);
        Farm farm2 =new Farm(farms2);

    }
}