/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//AHMAD MUIZZUDDIN BIN AHMAD RIDZUAN 2211679
package first.program;
import java.util.Scanner;
import java.lang.Character;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Asus
 */
public class project {
    public static void main(String[] args) {
        
        DisplayQuestion();
        
    }
    public static void DisplayQuestion(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t\t\t\toooooooooooooooooooooooooo");
        System.out.println("\t\t\t\t\tWELCOME TO GUESS THE BRAND");
        System.out.println("\t\t\t\t\toooooooooooooooooooooooooo\n\n");
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
       
        
        int[] uniqueRandom = new int[arr.length];
        Random rand = new Random();
        int ans;
        int check =1;
        int point = 0;
        int stop = 0;

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rand.nextInt(arr.length - i);
            uniqueRandom[i] = arr[randomIndex];
            arr[randomIndex] = arr[arr.length - i - 1];
            if(uniqueRandom[i] == 1){
                
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:BATA");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 2){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:TOYOTA");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 3){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:SKECHERS");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 4){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Dell");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 5){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:AIKEN");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Skincare  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 6){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:FLIPPER");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 7){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Jeep");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 8){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:NIKE");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 9){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:ADIDAS");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 10){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:UNDER ARMOUR");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 11){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MITSUBISHI");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 12){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:SAMSUNG");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='a' || ans=='A'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 13){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:KFC");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='b' || ans=='B'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 14){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:LENOVO");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Device  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 15){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:COWAY");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Water Filter  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 16){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:ASADI");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] ==17){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:UNIQLO");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='a' || ans=='A'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 18){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:KRONOS");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 19){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:PADINI");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='b' || ans=='B'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 20){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:PERODUA");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='b' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 21){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MIZUNO");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 22){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:PROTON");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 23){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:SUBWAY");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 24){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:HP");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 25){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MCDONALD");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 26){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:APPLE");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 27){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:BMW");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 28){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:H&M");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='a' || ans=='A'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 29){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:COTTON ON");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 30){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:VANS");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 31){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:AMORI");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 32){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:LOTUS");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 33){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:K-FRY");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 34){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MSI");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 35){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:CUCKOO");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Water Filter  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 36){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:HUAWEI");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 37){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:RALPH LAUREN");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 38){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:CHANEL");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 39){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:JOMA");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 40){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:KELME");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] ==41){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:REEBOK");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 42){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:BENTLEY");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 43){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:JORDAN");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 44){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:ACER");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 45){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:TEXAS CHICKEN");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 46){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:VIVO");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 47){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:AUDI");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 48){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:Brands Outlet");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 49){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:FILA");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 50){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:Woodland");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 51){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:DR MARTENS");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 52){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:BUGATTI");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 53){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:STARBUCKS");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Drinks");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 54){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:RAZER");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 55){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:PANASONIC");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Device  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 56){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:CROCS");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 57){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:LACOSTE");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 58){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:Zara");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 59){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:New Balance");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 60){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:ASICS");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 61){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Tesla");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 62){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:Ford");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 63){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Burger King");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Food  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 64){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Isuzu");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='b' || ans=='B'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 65){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:AMWAY");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Water Filter  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 66){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:OPPO");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='b' || ans=='B'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 67){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:KIA");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Car  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='a' || ans=='A'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 68){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:GUCCI");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 69){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:PARKSON");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 70){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:NISSAN");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 71){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MASERATI");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 72){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:Mazda");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 73){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Tealive");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Drinks  B.Ball");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 74){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MIROSOFT");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Software  B.Window");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 75){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:TACO-BELL");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Food  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 76){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:DOMINOS");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Food  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 77){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Pagani");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 78){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:Pontiac");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Car  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 79){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Xiaomi");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Device  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 80){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:BIG APPLE");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 81){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:ROLLS-ROYCE");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 82){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:Porsche");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 83){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Honor");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 84){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Walton");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Device  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 85){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Durabook");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Laptop  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 86){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Avia");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 87){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Scania");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 88){
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:SUZUKI");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Car  B.Shoes");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 89){
                 System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:A&W");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Food  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 90){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:DIADORA");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }if(uniqueRandom[i] == 91){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Kappa");
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Shoes  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     }else{
                     
                     System.out.println("Sorry,incorrect answer");
                     check=-1;break;
            }
            }
            if(uniqueRandom[i] == 92){
                System.out.println("\t\t\t\t\t---------------------");
               System.out.println("\t\t\t\t\tBrand:VOLVO");
               System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tWhat is the type of product?");
                System.out.println("\t\t\t\t\tA.Device  B.Car");
                ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop ++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 93){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:KICKERS");
                System.out.println("\t\t\t\t\t---------------------"); 
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Food");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
            }
            if(uniqueRandom[i] == 94){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:MOTOROLA");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Device  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     stop++;
                     
                     
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 95){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Nokia");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Water Filter  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;  
                 }
            }
            if(uniqueRandom[i] == 96){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Li-Ning");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Shoes  B.Device");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
            if(uniqueRandom[i] == 97){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Subaru");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;   
                 }
            }
            if(uniqueRandom[i] == 98){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:Peugeot");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothe  B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='B' || ans=='b'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;    
                 }
            }
             if(uniqueRandom[i] == 99){
                System.out.println("\t\t\t\t\t---------------------");
                System.out.println("\t\t\t\t\tBrand:Datsun");
                System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Car  B.Clothe");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;     
                 }
             }
             if(uniqueRandom[i] == 100){
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tBrand:Tommy Hillfiger");
                 System.out.println("\t\t\t\t\t---------------------");
                 System.out.println("\t\t\t\t\tWhat is the type of product?");
                 System.out.println("\t\t\t\t\tA.Clothes B.Car");
                 ans = input.next().charAt(0);
                 
                 if(ans=='A' || ans=='a'){
                     
                     System.out.println("\t\t\t\t\tCorrect!!\n");
                     
                     check=1;
                     point+=10;
                     
                     
                 }else{
                     
                     System.out.println("\t\t\t\t\tSorry,incorrect answer");
                     check=-1;break;
                 }
             }
        }
        int sum = 0;
        sum = point/10;
        System.out.println("\t\t\t\t\t-------------------------");
        System.out.println("\t\t\t\t\tO- Your Score is "+sum+"/100 -O");
        if(sum>=0){
            System.out.println("\t\t\t\t\tYOU ARE A POTATO");
        }else if(sum<=20){
            System.out.println("\t\t\t\t\tYOU ARE NOOB");
        }else if(sum<=40){
            System.out.println("\t\t\t\t\tYOU ARE WEAK");
        }else if(sum<=60){
            System.out.println("\t\t\t\t\tYOU ARE AVERAGE");
        }else if(sum<=70){
            System.out.println("\t\t\t\t\tYOU ARE PRETTY GOOD");
        }else if(sum<=80){
            System.out.println("\t\t\t\t\tYOU ARE SMART");
        }else if(sum<=90){
            System.out.println("\t\t\t\t\tYOU ARE PRO");
        }
        System.out.println("\t\t\t\t\t-------------------------");
        System.out.println("\n"+Arrays.toString(uniqueRandom));
    }
  
    
}
