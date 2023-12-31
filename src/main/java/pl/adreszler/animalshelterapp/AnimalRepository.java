package pl.adreszler.animalshelterapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
class AnimalRepository {

    private final Map<Integer, Animal> animals = new HashMap<>();
    private int nextId = 1;

    public AnimalRepository() {
        addTestAnimal("Lucky", "Test description 1", "/images/lucky-pic.jpg", "Labrador sitting on a meadow",
                Category.DOGS);
        addTestAnimal("Billy", "Test description 2 shdsahdhsad sed sad sa dsa d sadsad sa dsa d sadsadsadds " +
                "sdadsadsa", "/images/billy-pic.jpg", "German shepherd laying on grass", Category.DOGS);
        addTestAnimal("Kitty", "Test description 3", "/images/kitty-pic.jpg", "An orange cat",
                Category.CATS);
        addTestAnimal("G̷̣̟͓͈̦̉̾ͅą̴̗̼̤̺̭̫͉͎̂ê̶̗̱̠̬̎̄͒̋̃͗͛̌͌̽̀̌͜͠l̴̡̢̛̗̖͇͖̥̣̇͌̉̚", "H̴̡̢͇̬͋̈̈́̈̀͛E̷͕͒̈̾̕ ̸̨̧͉̯̮̜̼̱̰̬̜͔͖͔̻̐̔I̴̩̥̖͎̥̱͎̺̊̌̌̈́͜S̵͇̠͚̰̫͇̩̼̤̮̏̀̔ ̸̾̊͂̽̽͑̿͋̌̕̕͝ͅC̶̨̪͕̝̗͎̫̘̱̝̙̙̫̺̣̑̉̔̐̎̚̕͝Ö̴̧͎̖̠̭́̃͗̒̈́́̿̈̓͘͘M̴̡͈̻̭̎̒̿̐̈Į̵͖͓͚̻̬̪͈̗̬̹̈́̿͊̓̏̓̍͆̀͠Ň̶̡̨̞̗̘̺̲̲͉̲̬͍̼́͐́̉̔͗̎͝G̴̼̣͍͙̰̳̘̿̈́̈̑͊͒̈́͛̂̿͊̔̿͠ ̴̡̢̨̱̮͔͕͙̺͉̻̥̂̅H̸͍̝̭̋̾̔̊̒̾͋̿̿̑̐̚͠Ę̵̡̨̫̫͈̩̰̲̟͈̬̱̺̌̉̀͝ ̴̝̹̰͇̬͒̏̿͘͠Ì̸̡̭͇̟̞̱̭̊̾̒̐̍̾̏̀̓͐̈́͜͝ͅS̶͇̼͖͔̩̻͎̹̼̮͈̠̣̀͊͛͗̇́̐͆́̈́̈͜͠ ̴̺̼̪̘̜̻̙̪̟̩̘̪̀͋͑̉̚͜ͅC̶̬̫͂͒Ǫ̶̧͔͖̩̣̲͖͕̙̱̘̫̿͂̾M̷̗̮̻̀͋͐̅̌͒̃͑͠͠Ï̷̧͔͍̠̹̺̻̥̈̏̿̒̎̌̽̐̀̈́̕Ṇ̶̡̢̟̟͖̰͎̱͇̤̦͇̩̐̏͗̿ͅG̸̢̞̬͚̞͎̬̭̝̖̀͆͂͐̌̑̎̈́̍͗̅͝ ̵̱̣͍͖͚̺̳̻͈͍͎͙̲̪̂͐͑̎̊̋H̴͎͋͗̒̏̔̾̎͗̏́̾͘̚͝͝E̷̡͎̗͇̮̝̠̪̖͇͈̦̱͑͋̒ ̷̨̨̢̡̛̫̯͚̹̹̖̰̜̩̜̙́͌̿͛͌͊̓͐̀̕I̵̧̻͈̳̹̱̪̪̗̰͐̀͊̈́̐̃̇͝Ṣ̵̩̠̊͑̓̉̆͐͝͝͠͠ ̷̟̾̌C̶̢̨̰̩̟͎̥̱̙̹͖̳̹͙̄͊̄̑̑̊̈́̈́̈̕̕Ǫ̷̧̦̼͔͎̳̥̩͍͓̒̅̾ͅͅṂ̵̧̧̧̺͉͖̗͘Į̴̛̹͔͕͖͍͗̽̓́͒̌͠N̷̛͓̬̹̪͓̤̓̏̈́̈͒̊̂̀̇̆̓̐͠Ġ̶͕̪̥̝͈̠̳̞̳̼̺̍͐͑̈́̉ ̸̢̢̰̣̰̮̗̼̬̭̤͖̃H̶͕͍͔͔͉͗̂̀̌̔̔̋͌̎̈̆͆͜ͅẼ̵̢̥̹̲̦͈͍̗̻̲͕̤̭͚̌ ̵̢̺̝̗́̓̌͂̾̒̚̚Ì̶͔̺̳̬͖͖͎͓͍͂̽̑͊́̉S̵̛̘̙̹̝̗̰̻̰̰̝͒́̈́̒̌͗̿͂̍̍̈́͑̚͝ ̶̧̼̳͚̮̟͑́̎̉̈͛̎͊̉̚̚C̸͈͖̏͛̾̌̄̎̉̾́̈͝O̴͉͔͔̣̥̺͋͒̓̎̈́͘̕M̵̢̡͎̥̫̻͕͇̰̘̾̌̿̍̽̚͜Ī̵̹̞̞̠̹̥̯̤͍͓͕̪͈͚̑̑́̅͊͜Ň̷͔͉͕̰͚̪͉͉͜G̶̛̩̼̼̒̈́̆͂̒̒̆͋̅͝ ̶̡̑͂̀̀̇̐̈́̚Ḩ̶̩͙̮̯̦͙͕͉̂̋̉̈͘͠Ë̴̢̼̭̲̻̯͕̥̞̦̣̜̀̈̍̑̈́̕͜ ̸̛̞̐́̈̍͠͠Ĩ̷̤͎̦̥͖̭͑̓͒̋̚͜S̶̨̩̲̘̰͊̒̉̒̔̽̅͒̽̔̕ͅ ̸̨̡̢̨̲̲̻̈́̊͝ͅC̸̢̯̙̥̣̪̥̥̳͗͊́͛̒̕͜͜ͅO̸̱͚̤̙͔͒͋́̈́̒̇͐͊́̐̒̕M̴̧̛̥͙̺͓̉̎̓̑̍̊̽̄̓͒̂͑͝I̴̢͔͎̰͍̱̖̝̼̍̈́̿͊̅̇̍͛̕̚͠͠N̷̨̨̡̤̠̪͍̪͓̭͇͔̺͕͊̉̌̊͋̈͗̋̄̃̈́̇̚̕̕G̸̢̨͖͇̗̑̏̈́̔͒͛͝͝ ̸̢͎̠̺̞̳̞̼̠̱̹̪̺͂̍͗͋͊͂̈́̿̽̂͌̕͝H̷̺͍̝̭͌̑̽̈̽̇̎̒̈́̑͝Ḛ̴̛̗̟̙͊̈́̔͒͗͆̈́̀̉͋̚͠ ̸͍̝̗̠̥̱͕̙̲̳͖̥̔̾̋̇̔̈́͘͜Ī̸̢̙̠͎̩̥͝S̶͓̰̬͖͋̌̎͒͆̆̔̂͗̾̽͘͝͝ͅ ̶̲̪͔̺̱̞̙̒͗͗̒͊͌͌̈́̔̌̚͜͜ͅͅC̵̞̺͊͊̓̍O̵̡̙̜̣̤̬̩̅͆́̐̌̈́́̃̀̉̇͘M̶̧̞͎̹̯͔͔̰͇̼̼̺͈̫̋̒̉̀͘͠I̷̧̢̡̟̺̽́̓̆̉̒͗̄͐́̿̐͛̋̑N̶̂͂͗́͒͐̌͆͂̈̌́̋͘͝ͅĜ̶̨̤͍̰̙̣̮̩̦̳̦̈́͂͗̾̈́͂̿̓̋̇̿̈́͝ͅ ̵̲̾͒̍͐̾̓̈́̋̌͘͘͘H̸̼̲͛Ę̷͕̻̮͚͕̟̬̜͕͔̗͈̭̈̐͊̀̀̄̌́̕ ̷̧̤͙̖̻̱̤̜͇̬͉̰̣̉̂̀̐͐͝I̴͇̺̭̞͎̫͓̞̰͚̥͚̥͎͈̊̓̌̈͆͆͛̒̓͛̀͝͝Ş̴̧̝̭̲͎̱͇̳̳͚̽ͅ ̷̡̨̨̡̲̦̝̞̜̘̗̠̣̀͊̄̓͌̀͋̈́̀̎̍̔͝C̶͓̯͈̳̈́̋͋̋̅͐̒̂̉̏͘̕͜͠Ở̵̻̪̜͚̔̒͋̂̚̚͝M̵̨̨͖͇͕͖̩͖͔̮̝̯̉̃̔̈́̓͋̀̈́͘̕̕͜I̴̢̥̗̭̞͈̟̫̦̜̠̾̅̀̍̕N̵̛̞͂̀̏͆͘͘Ḡ̸̡̲̖̰̖̼͓͈̩̪̹̈͑̉̓̆̔̉̕ͅ ̶̰̫̼̟͖͍͇̘̗͚̳̱̤́͒́̉̽̒̋̂͋̾̒̚H̸̡̛̞̮̜̥͖̙̞͎͍̳͙̗͎͋̃ͅȨ̷̢͇͙̦̭͇̳͖̹͇̺͍̘͖͋͌̾̓̀̽̓͐̌̆̂͘͠͠ ̵̧̡͔̩̬̰͚̟̼̰͎͉̫̙̇͆͛͒̆̉͌̀̔̄I̸̢͚̓̇̃͐̀͑͒͝͝S̸͍͈͑̽̋̽̑̿͛̌̍̈̊̏́͛̚ ̶͇̝̭̥̥̩̬͍͔͈̹̿͛̈́̏̈́͋͛͆͘͜Ĉ̷͇̱́̾O̸̧̬̝̱̘̦̣͈̐͌̉͋͛̒́͑̀̔̕̕M̷͚̼̏̎̌́̈́Í̶̺̞͔̟̞̯͈͂̓̚Ñ̶̡̺͇G̷̹̣̻̘̹͕̼̰̀ ̶̢̟͓̟̗͆̈́̈͘͘͝ͅH̴̬̹̩̖̉͐͆̒̄̌̌̎̌̆͊̀͋̚͝E̵̘̯̳̲̫̬̭̜̞̺̯̪̙͛͌̍̃̐̽̋ͅ ̸̮͖̀͑͋͠Ḭ̵̢̙̬̠̰̥͎̹̣͈̖̈́̓͆̈́̀̎̈́͜S̸̢̠͇͉̻̝͔͉͖̒̔͊̐̃̈́̐̿͒̾̓̎ͅ ̶̢̼̱͔̞̺̹̙̹̥͔̟̖̟͍̓̑̈́̆͌͆̓̐̑̕͘͘̚Ć̸̨̧̛̘̮̦͉̤̥̰̭̣̺̥͖̘̇̒̃͂̀̑͑̚̚Ơ̷̢̦̳͒̅̃̿̾̈́̌̐͆́̓͛̚M̸̛͍̰̼͕̙̜̣̘̤̥̺̥͈͆̄̍̃̂̉̈́͜I̵̢̘̠̭̦͍̰̳̮̖̞̬͕̔̾̆͜͠ͅN̵̨̛̙̣̻͖͇̘̗̫̪̫̥̼̑̉̃̋̈͑̋̂̕̚͠G̷̳͚̘͕̳̬͓͓͎͖̋̓̔͌̀̆̽̋̄̓͘ ̵̡̣̻̹̫̼̹̤͆͂͒̉̂͜Ḧ̶̛͓͓́̏̏̎̋͛͒͂̋̃̀͂̌͝E̵̝͖̺̭̠̠̦̻̯͂͗̽͆́̑̚͠ͅ ̸̭͇͚̼̜̪̗̜̱̄̄̇̿̓͊͘Ï̴͇̗̭̟̲̩͝S̸̡̳͕͉̞͆̀̿̍̊͗͐͌̀̈́̀̆͝͠ ̸̫̟̘̲̳̠͓̤͌͑̃̓̔͌̅̋́̚͝͝C̵̼̮̼̮̤̀̇̀̎̅̿̈́̇̒̇̃̈́Ǒ̶̺̅͊̾́̑͒͋̐M̷͎̰̯̲͔̈́͋́̆̀͂̿̌̏̾̇̌͆̚I̵̡̮͇̟̿͐̆͗N̶̢͍͎̠̜̰͐̌̓͛̚͜G̶̨̧̛̤̼͕̤̭̝̰̩͈͚̓̀̈͆̒ ̵̧̼͇̣̜̋́̃͗ͅͅH̷͔̦̬̣͓̬̯̐̔̓͝E̶̡̺͙̥͚͕̫͚͕̬̓̋̔̆͂͑͋̉ ̴̬͛͋̄͊͊̈́͂̕͝I̴̼͉͙͉̯̖̺̪͚̣̬͆̍̔̀̾̕͠S̷̢͚̪̥̩̤̫͚̹͖̥͒̕͝͠ͅ ̵̨̧̯̯͔̱̭̻̬̲̮͇̓̆͋͒̅C̷̢̩̝̘̟̻̪̏̋̾̑̍͑̃ͅO̵̮͒̏M̸̩̹͎̀͠ͅÏ̸͍͕̩̪̝̞͎̱̀́̆͊̈́̾̅͊͘͘͜͝͝͝N̶̨̟̱̲͔̏̄́̒̂̃̄͒̒͗̕Ğ̸̞̯̻͕̼͉̩͖̳͍͜ ̵̢̠̪͔̲̙͙̽̆̓̊̔̽̑̐̓̍̄͋̈́Ḣ̴̬̠̰̲̩̗͇́̚E̶̢̨̻͉̣̗͔̝͓̼̟͂͐̉͋͊͊̀̊̋́̕̚ͅ ̷̛̛̰͖̳̭̻͍̳͓͔̩͛͒́̾̍̑̉͛̈̃̕͝I̴̢̧̢̛̳̟͔̗̙͔̘̼͉̫̟͇̔̎̉͂̉͆̌͒͐̚͠͝S̷̤̤̜̲͉͋͂̈́́̄̅͐̈̊͆̀̌͝ ̸̼͎̺̘̠͗̑̐͂̔͑̋̀̍͘͝͠C̴̨̭̼͍̮̻͉̤̩̭͎͓͚̕ͅO̶̢̧͕̬͍̱͍̲͖̘̍̾̇̈́͛͌͝ͅM̴̡͈̣͖̲̖͎͙̩̘̹̿̋́̈́͋̏͊̕I̴̞̤̟͉̼̭̲̻̣̱͚͂̂̂͑͌̈͒̈̚͝͝N̴͕͍͗͌̍̓̈́̑̀̓̀̓̚̚͘͝ͅG̶̨̢͓̲͓̻̲̗͔̦̱͚͖̃̋̀͠ ̴̜͓͍̭̆̓̅͒̓̾̆͌̋͐̈́H̴̛̘̺̘̳̗̺̻̙͋̈̽͂̒̈̏̇̆̑͊̀͒͝Ȩ̸̧͎̞͇̲̱̦̗̼͍̈́̂͆͐͜ ̶̛̭̭̜̦̩̖͚͕̣͉̻͓̻͂̄̎̌́̔́͆͌̆͘͠͠İ̸̟̞̠͎̳̠̏̑S̷͖͉̩͍̤̙̩̣̬̗̞͓̦̼̱̒̐́ ̸̮͓̽̃͑̀̉̄̓̄̋̌̾C̶̬̱͍̖̫͙̥̝͉̊͗̎͒̀͗̓̑̀̏͒͘̚͝ͅÖ̷̼̱̺̤́̔̄͐̎͌̔͒̎M̸̞̞̹͆͑̄͊̑̇̓͒̽͛̐͘Į̸͕̫̼͈͕͙̳̩̻̮̠̀͆̈̓̋̓̇͠͝Ń̷̛͎͙̠̺̲̫̙͉͙̞͒̑̔̆͒̑̒̀͘G̶̼͉͎̺̗̯̬̦̤͔̯̍̈ ̴̜͈̫͕̘̘̆̐͛̅͊̽H̴̡̨̛͙̖͙̯̦̰̞̉͆͛̈́̒̓͋͆̚͝͝Ë̷̮͓͎́̽̽̈́͊͊̑̑͋͐͒͛ ̵̢͍̲͐͌͑̈́͗̓͌̅͋̍̾ͅI̶̗̜̥̦͔̼̜͈̻͋Ś̷̡̲̺̭͇̗͈̟̪̗̱̲̦̹͌̓ ̸̬̬̖̲̖͉̙͈̞̎͌̀̋̔̔̿̓͑̈̆̐̓͜C̴͍̙̞̠̩͔̗̘̞̮͚̀̇̐͛̒̄̾͘O̴͙̺͚̣̦̱̺̒̉͆͊̆͌́̒̓͑̓̓͜M̶͚͈̩̫̼͚̻̬̲͇̞̝̮̰͍̐̿̀̈́͛̚Ĭ̶̹̺̰̯̤̗̪̭̞̍́̄̾̔͜͜N̷̢̤͍̱̻̈́͂͂̀̄̾̏̈́̾̆̀͒͠G̸̡̢̛̺̫͓̬͚̙̩̰̯̗̉͊́́̒ͅ ̸̡̛̛̗͙̼̳̣̙̤̜̯̩̩̭͗̂͌̒̉̈́͌̈́̂̍̚͝H̴̢̙̬͓͍̼̎͆͌̓̍͆̒̓̕͝͠Ȩ̴̰͚̯̘̱̂̔̓͑͐̒̿͝ ̸̛̛͇̺͚̰̬̝̪̩̻͂̎ͅI̶̧̨̦̩͖̔̎͑S̶̡̬̬͍̫̲̦͍̻̤̦̰̠̔̔̔͜ ̵̰̣̭̻̏͐̆Ç̷̺̯͎͍̺͖̰͚̺̈́͐̉ͅǪ̴̲̙̬͙̮͍̥͙̝̎͂̀̌͗̎̓́͑͂̅̚M̴̖̠̟͋͛̀Í̶͇͈̬̆̈̈́́̈̾̌́̎̅͗͠N̸̞͓̝̬̠̉̔͂̈́͆̄͜͜͠G̶̦̭̜͇̮͓͖͈̬̩̋̓́̋͒̈́͐̎͒͌̈̕̚͠ ̴̯̫̙͔̆̐̒Ḩ̶̜͙̹͇̤̜͚͉̭̹͊̽̈́͊̉̉̚͜Ȩ̷̧̡̘͎̦̪̹͔̟̣̫̰͕́͊̂͆͆͆̒̀̅̍ ̸̨̛͓̟͖̝̞̘͋́̉͑̄̇̍̄̕̕͠ͅḮ̶̡̡̪̘̞̺͉͔͉͎̠͙̞͑͛̆̔͘Ş̷͓͉̫̘͓̣̫̞̠͈̞̘͉͙͌͒ ̴͕̤̜̣̲͙̘̦͙̹̰̭͓̃͑̎͂̃̏͂C̸̢͚̼̘͈͖͆̃͐͌̅O̴̝͕̣̝̟̼̖̎̋͒͂̐͂͊̈́̈́̄̈́ͅM̸͕̭̫̈́̾̆͆̌̇͂̐I̴̢̛͕̎͑͆̈̽̆̀́̔̾̚͝Ñ̸̡̺͇̳̜̩̮̜̊̔̑͐̓̽͑̕G̸̱͓̾̄̎̃̀͐̍̇̃̓̏̍̚̚ ̷̫͖̱͓̪̑̾͛̄̔̌Ḣ̷̘͚̠͓͙͓͂͐̄̆͛͂̇̿͝ͅẺ̵̱ ̴̜̤͎̭͈̄̎̀̀̀Ì̶̡̛̙̟͉͔̮͉̀͗̀͆̕S̵̨̛̞̲̪͈̽̈́̍͛͒̉̏̎̈̆̑ ̶̢̪̲̮͉̘͚̳̹̬̮̠̜͔͎̏̔̋̐̔̇̓C̷̨̛͕͈̜̘̀̚͠Ő̸̬̤̰͈͙͓͍̞͎̥͚̪̄͝M̸̡̛̤̗̹̪̲̹̖͇̙͙̒͌̌̽̓̂̊̽̈́͜Î̸̭̩̪̫̯͇̑̐̋͌͠Ñ̴̦̘̺͔͖̻̗͕̮̜͎̘͍̬̌̎́̎̅̐̏̒̀̋̋͘G̷̨̡͉̻͇̘͓̼͕͕͇͂̿̿̑̕͜ ̵̛̦̘̝̣̠͙͖͇̫̦̎̎́͗̓̎ͅH̷̞̙͖̪͑̄̊̒̂̊̈̚ͅĖ̸͕̣̤̒́̕ ̴̢̦̝̼̗̞̪̃̉̎̽Ĩ̸͈̩͓̤͓̲͗̌͂̿̑S̶̮͕̹͍͆̈́̃̋́̉̇̑̊̐̑̈͘͝͠ͅ ̷̥̳͙̺̯͔̘̫̈́̎̔̈̓̌͛̽͊͘͝Ç̷̻̞̖̭͚͇͉̖͔̽̇̈́͌͌͒̉Ȏ̶̡̳̬͈̦̙͉̰͙̲̄̏̇̒̀̃͐́̈́M̷̳̦̜̜̯͙͕̫̟͙̝͚͆̆́͛͆͝Į̶̮̠͓̘̹͔̈̓̐̆̀̓N̵̡̘̰̮̗̼͒̈́͑̾́̂͠G̶̡̤͈̮̝̲̪͉̞͖͕͙̳͖̠̏͑̒͛̏̃͊̓̍̋̚͠ ̴̧̨̪̬͕̪̤̖̥̬͍͍̭̙͋̓͛͌̀̐̊̓́͘̕̕͝H̸̨̯̝̫̯͖͎̟̼́̑͜ͅË̴͍͎̰͔̙͖̦͉͎̐̎̀͗̑͊̑̈́͜͠ ̵̟̼͖̜̹̭̹͇͚̼̤̉͘Ȉ̸̢̧̡͙͕̩̮͈̣̼̦̣̃͛͛̔͒̔̑̑̋̍̈́͘͠ͅS̸̢̖͕̜̥̭̙̪͙̤͛̽͐̽̓͆̈͋͊͂̅̆̕̕̚͜ ̸̱͕̞̮͖̱̼́C̷̢̓O̸̢̖̘̱̱͙̱͉͇̺͕̳̓͜M̷̨̪̦̣̠̥͎̔̍́̑͑̽͂̈̎̒̅̇̚ͅͅͅI̶̢̮̘̮̙̮̟̼̳͕̺̝̿͌́́͋̂͂͌͝N̷̟̏̽͑͊͐̂̆̾͛͠G̵̘̰͙̭̟͖̲̯̪̋̿͂́̒̂̌̀̚͠ ̷̯͈̬̜̫̰͔̝͔̬̫̠̐̍͋͆̉̆̋͛͜H̶̢̯̗̩̣̝͔̮͈̼̘̦̪̒͋͘ͅE̷̜̞̼͓̺̤̠͙̿̏̍ ̶͓̜̈́̐̿͒̀̏͜͝͠Ỉ̷̢̝̩͚͚̠̥̼͓͇̹̫̖͚͆̆̉͐̿̀̊̒̍̚̚ͅŠ̷̢̥̩̼̀͛͊͠ ̸͉̝̥̉̓̏̚C̷̞̹̩̟̳͓͎͖̳͇̦͖̒̈̓̃͂͂͆͐́̾̅̓Ṍ̴̼͐̽̄̆͝M̸̛͙̩͖̆I̸̧̙̳̖͍͇̦̝͙̠̾͒̄́͜N̶̡̘͇̜̠͚̪͊͝ͅͅĞ̷̘̈́̀̈̽͆͂͊ ̵̨̧̺̣͈̞̮̳̲̂̆͐́͘H̸̢̼͕̠̝̺̄͑E̸̩͚̘͇͕̤̯̼̱̺͍̖͔͉͒̒̉̆͌͜ ̵̡̧̢̥̗̟͔̲̞̫̾̆͛́̀͝͝Ḭ̴̧͍̗͇̟͇͉̘̂̅͂̊̑S̷̫̲͉̝̓͐̀̒̕͠ ̸̝̦̰̲̻̫͕̱̗͔̺̟̒͂Ĉ̸̱̿Ǒ̷̜̱͇͎̳͆͘M̶̤̳̟̪̣̭͙͔̮̳͉̺̉̽́̋̋̈̔͠ͅỈ̶͖̙̤̪̐̎̈́̓̈̓̂̽̄͠Ņ̷̡̥̇͒͊̈́̉́̓̓͑̈͝͝ͅG̶͈̻͙̖̙̙̙͈̺̘̟͉̃̿̏͌̕̕̕͝͠ ̷̺̜̩̞̙̥̀̈́͋̄͋̃̍͝͠H̸̲̼̭̲̱̜̒̇̉͐̈́͂͒̕E̴̯͑̀́̊͛̾͌̀̾̉͘ ̵͚̍̏I̵̟̿̐̽̅̀̓͋́̂̓̊S̶̢̢̳͎̬̓̈́͆͝͝ ̸̨̡͙͓̹̘̗͎̮̦̎͝Ĉ̸̰͕̩̼̦͖̭̼̅̓̉̊́̀̊̋̚ͅÕ̸̢̢̨͓̻̜̳̺̭͕̪͕͙̐̒̅̽̍̊͝M̸̧̪̖̳͍̪̪̭̀̍͠Ì̴̳͈̭̖̝̖͚̝̤̺̠̃̓̌̀̓̃̚͝͠ͅŅ̸̧̛͖̮̹̲͚̠͌́̌̿̔́͋̾̆͂̕͜Ģ̸̨̨̧̢̙͕̻̠͓̣̘̖̳̈́͆͌̈́͛̈́͌̔̓̅̏ ̸̢̛̣̱̩̭̱̱͔͔̙̮͙̐̉̊͗̀͗̿̽̆͑͒̉̚͝Ḩ̸̊̋̌͒Ȅ̷̼̤̮̖͙̟̤̳͖̞͚̠̳̞͜ ̴̨̛͉̖̺̯͉͖̿͆̈̔̔̅͑̉̉̏̒͑̕̕I̵̡̡̡̩̲̫̖̥̳̮̦̪̒́́̋̏͑͌̚Ş̴̲̋̈̔̇̌͆̋́̓̆̅͘͝ͅ ̶̨̧̛͇̮̠͖̻̮̭͙͊̇͌̓̾ͅÇ̷̨̥̖̫̜͊́̌̋́̋̕ͅȌ̵̡̧͎̲̝̰̹̿̽͋͛̒͊M̴̮͈̭̹̣̫͊̎̀̾͛͌̊̕͝͠I̷̢̡̡̜̟̥͖̻̹̹̊͐͂̊͒N̸̡͍̱̟͚̦͚͔̩͙̹̻̗͍͆͜G̶̺͎͕̹̿̉͌͋̆̃ ̷͖̽H̵̢̘̟͍̫͎̼̜̪̔͝Ę̴̡̧̛̤̯̲̙͖̥̺̻̹̓͐̾͋͝͝ ̸̮̮̯͎̰̭̟̬̳̯̈ͅI̶̞͍̽̀̿̒́͛̑̊S̸̨͚̜̲̲̙̳͍͔͎̺̿̒̍̓̄̒̏͂͐̊̈̄̌͠ͅ ̴̢̻͕̳̤̝͍͉̳͙̳̤̫͚̃̚͝C̸̜̺̞̫͚͇̠͖͕̠͙̰̝̟̀̉͌̿͐͆́̈̈́̍͆͐́O̶̢̧̞̭͇̣̖̹͚̬͙̙̰͗̽͜M̶̡̢̞͓̭͗̐̍̀̕͝I̸̜͈̟͓̟̤̬̊N̷̨͈̞̯̺̖̖͚̞̽̈G̷͔̝͓̜̝͑͆̓͛̽͜͠ ̴̜̳̜̹̭̮̼̯̋̇͛̃̈́́̓̚͝ͅḨ̷̱̻͈̣̳͔͖̙̫̠̰̥̿̈́́͛Ę̷̡̤̹̙͇̺̪̜̬̠̹̥̅̉̐͐̅̓̄̓́̽̽͆͜ ̷͍͈̝̜̠̑̆͛̈́̾̉̂I̶̫̲̹̓̎͒̂S̶̳̩̬̩͔͖͗ͅ ̵̡͇͎̞̲̦̋̔̑̀̐͂̆̌͂̾C̵̢̯͗̂̄͛̇̆͌̓̆̓͒̈O̴̢͍̜̭̦͕̫̣̙̝̽̆̔͐̑͌̀̐̆̔̀́͝͝M̴̨̻̘̠͇̘̟̘͕̹̼̈͘Ȋ̶͈̄͗͋͒̈́̉̓͑͘̚N̷̡̢̨̙̣͎͓̦͙̝̜̒̄̀͌͋̐̿̆͜͠͠͝ͅG̵̨̦͔͎̯̙̞̺͕̱̮̰̙͛̄̅̆̍̂̾̀̊̏̔̽̚͝͠ ̴̖̬͚̟̱͕̬̤͍̣͎͚͚̌̌H̵̡͙̣̙̦͙͍̩̝̮̥̎̾́̅̈͑͜E̸̢̡̼͚̹̙̤͔̱̲͆͐͐̓̌͒̓̅̀̇́͒ ̵̨̜̪͓̭̳̖̼͙͔͖̹͚̑̑͂̉̒̓͜͜͠I̶̢̡̛͍͉̞̳̞͉̹̣͗̇̉͂̀̇̆̏̐͆̉̍̎̐ͅͅS̵̡͚̺̞͚̪̭͇͇̓̍̑̕ ̸̨̢̘̗̣̺̙͖̥̝̺̰͇̯͉̈́̉̊̓͐̔̊́́̿C̸͙̪̭̮͔̖̹͍̈́̽̏̓̎͆̈́̌͘Ô̷̹͚̄̎͝M̸͙̮̥̯̙̩̳͎͓̩̫̾̈́̈́̀͂̎͂̅̔̇͒̕͠͠ͅI̷̮̠̘̩̿̈́͝Ņ̵̨̺͈̠͙̦͕̟͖̩̃̈́̓͑̃́͌̎̀͊́͜Ǵ̶̡̝̩̙̘̗͚̫̱͛̇̀̾͌͑̋̽̆̑̅̚͝͝ͅ ̴̖̹̣̝̐̌͛̐̈́͝H̴̹͚̝̬̪̟͔̦͐̅͝ͅE̵͖͙͙͙̐ ̴̦̉̏͛́̇͆̏̍̚͜͠I̷̢̦͎̗͇̼̣͇̤̙̘̲̖̔̇͊͗́̓̉͂̇͆̓̄̚S̴̛̤̝̫͕͉͖̬̙͇̀̐ ̶̡̧͚̩̯̤͍͍͓̹̂̏͗̑̈́̅́́̈́̎͗C̷͕͓̪͊O̴̜̘̯͍͖̥̺͉̘̖͍̔͊̒͌̔͑̆͠ͅM̷͙̳̟͎̤͓͕̙̙͖̫̠̻͛Į̴̧̛̪͍̰̰̝̋͋̿͗̔̽̅͗̔̓͝Ń̴̙̖̪͕͍̫͓̼̀̐̚G̷̢̛͙͖̈́̏́̄̋̉͂̽͊̀͊̏͂̕ ̸̠̼̮͖̳͕̗͓͐͒̍̉̎̀͆̽̈́͘ͅḦ̴̢͉͎̺̞̺̯͈̰̼̠͉́̊E̸͔̩̞͈͖̦͙̜̟͗́͛̈̅̈́̈͂̈̀̅̈́̄̃̕ͅ ̸̡̫͕̖̯͓̮̞̦̰͙̥̱̑͐̊̌̃́̍̆͆͒͛̈́̎̔̚ͅI̴̢̺̦͍̙̟͇͒̏̇̓͐̽͗͌́̀̽̏̐͝S̸̛̮͙̣̳͕̩͈̱̜̉͌̈́̄̉̆̽̑͗̈͋̕͝͝ͅͅ ̴̧̪͇̫̦̱̺̳̹̞̹͎̫̍̈̒Ç̸͎͇̼̱̟̪̲͍͎͖̔̅͐̒̎̔̿͆͘͝Ơ̵͔̞̫̭͈̝̈́͐́̃̈̃͒́M̶͇͔̼̦̯̖̭̫͚̯̮̮̞̒̅͜ͅI̴̜̩̙̙͖̐Ǹ̷̛̥̰̺̗͔̣̜͈̮͔̣̓̅̒̈́͆̾͂̐͘̕̚͘Ģ̶̧̜͙̖̮̯̻͚͋͆͊̈́̎͘͝ ̷̘̠͓̮̞̫̱̽̃̽͐͠͝H̶̡̟̅̇̈́̔̄͊̂̈́̒͌̃̓̚͘͠ͅĘ̶̨̲̠̩̘̳͇̮̰̋́̊̀͒̏͑̊͊̔̀̀ ̸͕̄̓̌̅͆̔̔̋̇̅̽̓̈́͠Í̴͖̞̺͚̞̱̊̄̒̈́̕ͅS̸̢͈̰̖̣̤͙͚͖̻̦͐̒̆̈́͘̕ ̷̧̼͔̻͚̞̩̹͎̪̝̫̣͚̀̇̔̈́̓̌̽̕̚͜͠͝C̶͚̗̱͈̭̃̂̂͆̽Ỏ̸̢̦̰̳͚̱̀͋M̷̖̹̞̘̥̳̄̀̉̿̏̎̀́ͅI̷͉̋̈́̀͠N̸̲̲̝̥͇͗̿̌͂̓̏͛̾̄̔͘̕G̶̛̬͙͔̙̿̈̊̓̈́͘͘ ̵̠̠̙̰̞̬̃H̷̨̛̘͉̤̞̫̭͓̘͚͕̺̾̓̈̈̍̉̋̊̚͝͝Ȩ̶̺̦͙͔̠̺͍̼̦̖̯̉͋̈̊̅͂͊̅͑̓̿́̚̚ ̶̡̝͓̏̕I̴̧͖̪̹̘͍̟̣͌̆̑S̸͈̗̱̥̅̀̽̇̽ ̶̟͉̼̺͉̼͈̟̝̐̋͗͑͛̾͗̋̌́̑̓͛͛͘ͅC̶̽̀̃͛́̋͆́̍̇͜͝͝O̴̧̜̟̯̦̗̟̹̦̒̐̆̍͗̎̓̚M̶̙͈͛̊̎̀́Ì̸̡̙̬͖̟̠͔̲̹̕N̸̖̹̝͇͓̻̤̯̈́̇̀̂̇͠ͅG̸̩̼͚̖̼̓̈ ̶̪̲̗̯͈̩̳̜͇͕͒͑͂͊̑̾͌̽̒̾͑͛̉̕͠H̴͚̔͑͐̈́͋̎̈̒̚̕E̸͚̭͖͔̘̻̯̻̫̥̻̰̠̣͑̂̈́͌͑͊̽͋͊̾̕͝ ̵͓̰͆̓͑̐̅̄̇͐͋̐̒̕Į̸͉͍͖̼̓́̆͊̆S̵͍͉̞̥̹̫̣̮̯̗̻͇̍̇̑́ ̵̞̯͂͑C̸̡͙̭̼̣̣̻̝͑͂Ȯ̸̡̦͇͈̯̺̤̔̀̋́̉̈́́̇͆̔̈͜͝M̸̬͕̫̪̉̏͊Ȉ̷̙̯̜̱͚̰̀Ǹ̷̻̺̘̖̤̤̮̥̱̲́͌̇̑̑̑̃̓̋̑̎̑͒͜͝Ğ̵͇̣̞̜̣̖̙̮̗͙̰̫̤̃͜ ̶̮̱̯́̅̀̔̎H̶̹͎̘̞̲̹̦̪̞̒͠E̸̼̤̎ͅͅ ̸̢̢͇̥̞͚̞̮͈͖͆̋͋͂̈́̅̇̒̾̓̆̕͘͘͜͝Į̶͚͇͚̊̌̀̈̽̿̍̍̌Ş̸̬̙̜͉̱̻͈̙̥̬̒̄̈́͋͊͊͗̀̀̈́͜͜ ̶͖̟̫̱͉̠͚͔̓̏͐͐͘C̴̢͕̠͚̤̭͊́̏͂̊̿̑̿̅̎̕O̴͉͒͗͐M̴̭̺̝̘̝͚̰͎̘͖̼̦͖̌̀́́̒͌̍̕I̴͖̤̼̠͎̦̔́̆̇̌̉̀̊̎͑̉͊̕͜͠ͅṊ̸̦͚̹̀̈́̈́̽̕G̸̛̠͎̜̲̹͉̞̟̊́͋̉̿̈́͌̄͌̈͝͝͠ ̷̲̳͆̎̅̀̓̀̑ͅH̸̨͖̬̹̗̲̙̱̥͗̑̎Ể̵̉̌ͅ ̴͖̱̺͛̄̾̔̐̍̆̇͐̓̔͛̚I̵̬̜̭̪͑̇́͆͂̀̔͗̔͊̓̚͝S̶̢͆͆͒̊̾̅̾͝ ̴͇̖̫̀̑̄́̿͋̀̈͌͊̓͋͗͝C̷̨̖̲̠̱̝͆͐̓Ǫ̷̡̦͖̪̲̰̽̽͌Ḿ̸̜̦̝͕̠͎͉͔̤͖͚͉̲̅͜ͅḮ̸̡̧̛͔͎̪̪̥̝̤̗͖̙͍̋̒̇̉̇͑̚̕N̸̢̛̲͙͕͎̮̓̋̍͗̑̀͗́̋̎̑̔̍͝G̵̣̋̓̀ ̴̰̺̰̓̿͗̎̈́́́̋̇̏͆͜", "/images/gael-pic.jpg", "VOID MONSTER",
                Category.DIFFERENT);
    }

    private void addTestAnimal(String name, String description, String pictureFileName, String pictureAlt, Category category) {
        Picture picture = new Picture(pictureFileName, pictureAlt);
        int id = getNextIdAndIncrement();
        animals.put(id, new Animal(id, name, description, picture, category));
    }

    void addEditedAnimal(Animal animal) {
        animals.put(animal.getId(), animal);
    }

    int addAnimalAndReturnId(Animal animal) {
        int id = getNextIdAndIncrement();
        animal.setId(id);
        animals.put(id, animal);
        return id;
    }

    int getNextIdAndIncrement() {
        int nextId = this.nextId;
        this.nextId++;
        return nextId;
    }

    Animal getAnimalById(Integer id) {
        return animals.get(id);
    }

    List<Animal> findAll() {
        return animals.values().stream().toList();
    }

    List<Animal> findByCategory(Category category) {
        return animals.values().stream()
                .filter(animal -> animal.getCategory() == category)
                .toList();
    }

    List<Animal> findByName(String name) {
        String lowercaseName = name.toLowerCase();
        return animals.values().stream()
                .filter(animal -> animal.getName().toLowerCase().contains(lowercaseName))
                .toList();
    }
}