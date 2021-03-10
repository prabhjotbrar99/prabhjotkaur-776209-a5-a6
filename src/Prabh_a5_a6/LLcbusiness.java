package Prabh_a5_a6;

import javax.swing.*;

public class LLcbusiness {

        double serviceCostA;
        double serviceCostB;
        double optionCostSmall;
        double optionCostLarge;
        double itemBoxesSmall;
        double itemBoxesLarge;

        public LLcbusiness()
        {
            setServiceCostA();
            setServiceCostB();
            setOptionCostSmall();
            setOptionCostLarge();
            setItemBoxesSmall();
            setItemBoxesLarge();
        }

        public double getServiceCostA() {
            return serviceCostA;
        }

        public void setServiceCostA() {
            this.serviceCostA = 100.00;
        }

        public double getServiceCostB() {
            return serviceCostB;
        }

        public void setServiceCostB() {
            this.serviceCostB = 150.00;
        }

        public double getOptionCostSmall() {
            return optionCostSmall;
        }

        public void setOptionCostSmall() {
            this.optionCostSmall = 8.00;
        }

        public double getOptionCostLarge() {
            return optionCostLarge;
        }

        public void setOptionCostLarge() {
            this.optionCostLarge = 20.11;
        }

        public double getItemBoxesSmall() {
            return itemBoxesSmall;
        }

        public void setItemBoxesSmall() {
            this.itemBoxesSmall = 2.50;
        }

        public double getItemBoxesLarge() {
            return itemBoxesLarge;
        }

        public void setItemBoxesLarge() {
            this.itemBoxesLarge = 4.50;
        }

        public static void main(String[] args) {
            LLcbusiness cost = new LLcbusiness();

            int j = 0;
            JOptionPane.showMessageDialog(null,"The user name is Prabhjot and password is Brar for login");
            while (true){
                String userName = JOptionPane.showInputDialog(
                        null,"Please enter user name ");
                String userPass = JOptionPane.showInputDialog(
                        null,"Please enter the password ");
                if(userName.equals("Prabhjot") && userPass.equals("Brar")){
                    JOptionPane.showMessageDialog(null,
                            "You have successfully logged in");
                    double servicePackage = getServicePackage(cost.getServiceCostA(),cost.getServiceCostB());
                    System.out.println(servicePackage);
                    double storageOption = getStorageOption(cost.getOptionCostSmall(),cost.getOptionCostLarge());
                    System.out.println(storageOption);
                    double boxOption = getBoxOption(cost.getItemBoxesSmall(),cost.getItemBoxesLarge());
                    System.out.println(boxOption);
                    JOptionPane.showMessageDialog(null,
                            "The total Service cost as per your option is $"+ servicePackage );
                    JOptionPane.showMessageDialog(null,
                            "The total cost of storage as per your option is $"+ storageOption );
                    JOptionPane.showMessageDialog(null,
                            "The total cost of per box as per your option is $"+ boxOption );
                    JOptionPane.showMessageDialog(null,
                            "The total final cost $"+ (servicePackage + storageOption + boxOption) );
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Please enter correct user name and password");
                }
                j+=1;
                if(j == 3){
                    break;
                }
            }
        }

        private static double getBoxOption(double itemBoxesSmall, double itemBoxesLarge) {
            String servicePackage = JOptionPane.showInputDialog(null,
                    "Please enter type of storage box (S/l) " +
                            "\n$" + itemBoxesSmall + " for small Storage or $" +
                            itemBoxesLarge + " for large storage");
            if(servicePackage.equalsIgnoreCase("S")){
                return itemBoxesSmall;
            }else if(servicePackage.equalsIgnoreCase("L")){
                return itemBoxesLarge;
            }else  {
                return 0.0;
            }
        }

        private static double getStorageOption(double optionCostSmall, double optionCostLarge) {
            String servicePackage = JOptionPane.showInputDialog(null,
                    "Please enter type of storage (S/L) " +
                            "\n$" + optionCostSmall + " for small Storage or $" +
                            optionCostLarge + " for large storage");
            if(servicePackage.equalsIgnoreCase("S")){
                return optionCostSmall;
            }else if(servicePackage.equalsIgnoreCase("L")){
                return optionCostLarge;
            }else  {
                return 0.0;
            }
        }

        private static double getServicePackage(double costA, double costB) {
            String servicePackage = JOptionPane.showInputDialog(null,
                    "Please enter type of service(A/B) " +
                            "\n$" + costA + " for package A or $" + costB + " for package B");
            if(servicePackage.equalsIgnoreCase("A")){
                return costA;
            }else if(servicePackage.equalsIgnoreCase("B")){
                return costB;
            }else  {
                return 0.0;
            }
        }
    }
