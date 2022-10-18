package assignments;

import java.util.Scanner;

public class BayviewGlenPools {
    public static void main(String[] args) {
    

        //creaing new scanner
        Scanner in = new Scanner(System.in);

        //finding inputs for pool
        System.out.print("Please enter the length of the pool(m): ");
        double length = in.nextInt();
        
        System.out.print("Great! Now please enter the width of the pool(m): ");
        double width = in.nextInt();

        System.out.print("Thanks, now please enter the depth of the shallow end(m): ");
        double shallowDepth = in.nextInt();

        System.out.print("Enter the depth of the deep end(m): ");
        double deepDepth = in.nextInt();

        System.out.print("Please enter the length of the transition between the shallow end and the deep end(m): ");
        double transition = in.nextInt();

        System.out.print("Please enter the length of the shallow end(m): ");
        double shallowLength = in.nextInt();

        System.out.print("Please enter the price per meter squared of the liner that you are planning to purchase(m): ");
        double linerPrice = in.nextInt();

        
        //Volume calculations
        double volumeA1 = shallowDepth * shallowLength * width;

        //finding value of difference between deep and shallow end
        double verticalDiffShallowDeep = deepDepth - shallowDepth;
        //finding horizontal distance of the transition
        double horizontalTransitionDistance = Math.sqrt(Math.pow(transition, 2) - Math.pow(verticalDiffShallowDeep, 2));
        
        double volumeA2 = ((verticalDiffShallowDeep * horizontalTransitionDistance) / 2) * width;
        
        double volumeA3 = (shallowDepth * horizontalTransitionDistance) * width;
        
        //calculating the length of the deep end
        double deepLength = length - shallowLength - horizontalTransitionDistance;
        
        double volumeA4 = (deepLength * deepDepth) * width;
        
        //calculating total volume
        double totalVolume = volumeA1 + volumeA2 + volumeA3 + volumeA4;
        //calculating ninety percent volume
        double ninetyPercentVolume = totalVolume * 0.9;

        //adding one line of whiteplace
        System.out.println("");
        System.out.println("The amount of water needed to keep the pool 90% full is: " + (int)ninetyPercentVolume + "m^3");


        //calculating surface areas   
        double SA_ShallowWall= (shallowDepth * shallowLength) * 2;
        double SA_ShallowBottom = shallowLength * width;
        double SA_TransitionWall = ((shallowDepth * horizontalTransitionDistance) + ((horizontalTransitionDistance * verticalDiffShallowDeep) / 2)) * 2;
        double SA_TransitionBottom = transition * width;
        double SA_DeepWall = (deepDepth * deepLength) * 2;
        double SA_DeepDepth = (deepLength * width);
        double SA_BackWall = width * deepDepth;
        double SA_FrontWall = width * shallowDepth;
        

        //finding total surface area
        double totalSA = SA_ShallowWall + SA_ShallowBottom + SA_TransitionWall + SA_TransitionBottom + SA_DeepWall + SA_DeepDepth + SA_BackWall + SA_FrontWall;
        System.out.println("The total surface area of the pool is: " + (int)totalSA + "m^2");

        //calcualting cost of liner
        double linerCost = totalSA * linerPrice;
        System.out.println("The total cost of the liner is: " + "$" + Math.round(linerCost * 100) / 100.0);


        in.close();



        
    

        
    }

}
