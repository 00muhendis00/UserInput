package Project;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		String userName, password;
		String systemUserName = "Patika";
		String systemPassword = "Patika";
		Scanner input = new Scanner(System.in);
		System.out.print("Kullanıcı Adı = ");
		userName = input.nextLine();
		System.out.print("Şifre = ");
		password = input.nextLine();
		 
		if (userName.equals("Patika") && password.equals("Patika"))
		{
			System.out.print("Kullanıcı Adı ve şifre Doğru");
		}
		else 
		{
			System.out.println("Hatalı Giriş");
			System.out.print("Şifrenizi sıfırlamak istiyorsanız y tuşuna basınız?");
			String answer = input.nextLine();
			if(answer.equals("y"))
			{
				System.out.print("Oluşturulacak yeni şifreyi giriniz ");
				String newPassword = input.nextLine();
				if(newPassword.equals(password)) {
					System.out.print("Şifre oluşturulamadı lütfen tekrar deneyiniz");
				}
				else {
					System.out.print("Şifre oluşturuldu");
				}
			}
		}
	}
}
