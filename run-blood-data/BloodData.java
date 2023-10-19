package runblooddata;

// author @sollano_jhaynefe

class BloodData {
    private static String bloodType;
    private static String rhFactor;
  
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }
  
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }
  
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}
