import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class VersionControl {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите первую версию: ");
            StringBuilder v1 = new StringBuilder(reader.readLine());

            System.out.println("Введите вторую версию: ");
            StringBuilder v2 = new StringBuilder(reader.readLine());

            int i = 0;
            boolean found = false;

            do {
                int ver11 = 0, ver22 = 0;

                if (i != 3) {
                    int indexPointOfFirst = v1.indexOf(".");
                    String v11 = v1.substring(0, indexPointOfFirst);
                    ver11 = Integer.parseInt(v11);
                    v1 = new StringBuilder(v1.substring(indexPointOfFirst + 1));

                    int indexPointOfSecond = v2.indexOf(".");
                    String v22 = v2.substring(0, indexPointOfSecond);
                    ver22 = Integer.parseInt(v22);
                    v2 = new StringBuilder(v2.substring(indexPointOfSecond + 1));
                } else {
                    ver11 = Integer.parseInt(v1.toString());
                    ver22 = Integer.parseInt(v2.toString());
                }


                if (ver11 != ver22) {
                    if (ver11 > ver22) {
                        System.out.println("Первая версия новее.");
                    } else {
                        System.out.println("Вторая версия новее.");
                    }
                    found = true;
                }
                i++;
            } while ((i != 4) | (!found));

        } catch (Exception e) {
            System.out.println("Ошибка");
        }

    }
}