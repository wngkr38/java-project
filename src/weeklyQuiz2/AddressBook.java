package weeklyQuiz2;

import java.util.*;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("연락처가 비어있습니다.");
        }else{
            contacts.forEach(System.out::println);
        }
    }
    public void searchContact(String name) {
        List<Contact> foundContacts = contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .toList();

        if(foundContacts.isEmpty()){
            System.out.println("연락처를 찾을 수 없습니다.");
        }else{
            foundContacts.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while(true){
            System.out.println("\n1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String businessName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String businessPhone = scanner.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    String companyName = scanner.nextLine();
                    addressBook.addContact(new BusinessContact(businessName,businessPhone,companyName));
                    break;
                case 2:
                    System.out.print("이름을 입력하세요: ");
                    String personalName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String personalPhone = scanner.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String relationship = scanner.nextLine();
                    addressBook.addContact(new PersonalContact(personalName, personalPhone, relationship));
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }

        }
    }

}
