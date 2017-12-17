import java.io.*;
import java.util.ArrayList;

public class treesearch{
        public static void main(String[] args) {
            bPlusTree tree = new bPlusTree();

            try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {

                int order = Integer.parseInt(br.readLine());
                //Initializing a bPlusTree with the input order
                tree.Initialize(order);

                //creating a print writer object and output textfile to print output to a file
                PrintWriter out = new PrintWriter(new FileWriter("output_file.txt"));

                //Scanning the input file line by line and performing the operations written in the file
                String line;
                while ((line = br.readLine()) != null) {
                    if(line.charAt(0)=='I'){
                        int i=7;
                        String key = "";
                        String value = "";
                        while(line.charAt(i)!=','){
                            key = key + line.charAt(i);
                            i++;
                        }

                        i++;
                        while(line.charAt(i)!=')'){
                            value = value + line.charAt(i);
                            i++;
                        }
                        tree.insertData(Double.parseDouble(key), value);
                    }

                    if(line.charAt(0)=='S'){
                        int i=7;
                        String key1 = "";
                        String key2 = "";
                        while(line.charAt(i)!=','&&line.charAt(i)!=')'){
                            key1 = key1 + line.charAt(i);
                            i++;
                        }

                        if(line.charAt(i)==','){
                            i++;
                            while(line.charAt(i)!=')'){
                                key2 = key2 + line.charAt(i);
                                i++;
                            }
                        }

                        if(key2==""){
                            String result = tree.searchValue(Double.parseDouble(key1));
                            if(result == null){
                                out.println("Null");
                            }
                            else{
                                out.println(result);
                            }
                        }
                        else{
                            ArrayList<String> result = tree.searchValue(Double.parseDouble(key1),Double.parseDouble(key2));
                            if(result.size() == 0){
                                out.println("Null");
                            }
                            else{
                                out.println(result.toString().substring(1, result.toString().length()-1));
                            }
                        }
                    }
                }
                out.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
}
