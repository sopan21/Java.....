import java.util.Arrays;
import java.util.Scanner;

class User
{
    int []UId= new int[100];
    String []Uname= new String[100]; String []UDesignation= new String[100];
}
class Issuers extends User
{
    int []issuerId=new int[100];int []borrowerId=new int[100];String []issueDate=new String[100];String []dateExpiry=new String[100];
    String []booktTitle= new String[100];String []borrowerName= new String[100]; String []borrowerDesig= new String[100];
    String []bookAuthor= new String[100];

}
class Return extends Issuers
{
    int []returnId=new int[100];int []returnDate=new int[100],delay;
}
class Books extends Return {
    int []bookId =new int[100];
    String []bookTital= new String[100];
    public static void main(String[] args) {
        Books b = new Books();
        int i =1,c,q=1,r;
        int si =4;
        String []Abooks = {"Java Programing","C Programing","C++ Programing","Python","HTML"};
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (true) {

            System.out.println("1. Borrow Book \n2. Return Book \n3. view available books");
            c = s.nextInt();
            System.out.println("\n");
            switch (c){
                case 1:
                    System.out.println("Available Books");
                    for(int j=0,k = 1; j<=si;j++,k++){
                        System.out.print(k+"."+Abooks[j]+"\n");
                    }
                    System.out.println("Choose Between this");
                    int loc = s.nextInt();
                    for(int d = loc;d<si;d++)
                    {
                        Abooks[d-1] = Abooks[d+1];
                    }
                    si--;
                    System.out.println("Enter Book ID");
                    b.bookId[q] = s.nextInt();
                    System.out.println("Enter Book Title");
                    b.bookTital[q] = s.next();
                    System.out.println("Enter Book Author Name");
                    b.bookAuthor[q] = s.next();
                    System.out.println("Enter Borrower Id");
                    b.borrowerId[q] = s.nextInt();
                    System.out.println("Enter Borrower Name");
                    b.borrowerName[q] = s.next();
                    System.out.println("Enter Borrower Designation");
                    b.borrowerDesig[q] = s.next();
                    System.out.println("Enter Issue Date");
                    b.issueDate[q] = s.next();
                    System.out.println("Enter Date Expiry");
                    b.dateExpiry[q] = s.next();
                    System.out.println("\n");
                    System.out.println("All information about Borrower\n"+"Borrower Name:- "+b.borrowerName[q]+"\tBook Title:- "+b.bookTital[q]);
                    break;
                case 2:
//                    int n = Abooks.length;
//                    int Abook[] = new int [n+1];
//                    for(int j= 0; j<n;j++)
//                    {
////                      Abook[j] = Abooks[j];
//
//                    }
//                    System.out.println("Enter book name ");
//                    r = s.nextInt();
//                    Abook[n] = r;
//                    System.out.println(Arrays.toString(Abook));



                    break;
                case 3:
//                    for(int j =0,k=1;j<si;j++,k++) {
//                        System.out.println(k+". "+Abooks[j]+"\n");
//                    }
                    for(String element: Abooks)
                    {
                        System.out.println(element);
                    }
                    System.out.println("Borrowed Books:- \tBorrower Name:- "+b.borrowerName[q]+"\t Book Title:- "+b.bookTital[q]);
            }


          }
    }
}


