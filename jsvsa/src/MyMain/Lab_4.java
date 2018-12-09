package MyMain;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import human_types.Parent;
import java.util.Random;

public class Lab_4 {
	protected void start() {
		try(FileWriter writer = new FileWriter("C:\\Users\\fifab\\eclipse-workspace\\jsvsa\\log.txt", false))
        {
			
			java.util.Date currentDate = new java.util.Date();
            writer.write("Start program: " + String.valueOf(currentDate) + '\n' + '\n');
            long program_start_time = System.currentTimeMillis();
            int fill_count = 10;
            //ArrayList
    		ArrList(writer, fill_count); 
    		
    		//LinkedList filling
    		LinkList(writer, fill_count);
    		
    		long program_end_time = System.currentTimeMillis(); 
            writer.append("Total time: " + String.valueOf(program_end_time-program_start_time) + " ms");
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
	}
	
	protected long LinkList(FileWriter writer, int fill_count) {
		try {
			writer.append("LinkedList" + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long[] filling_time = new long[fill_count] ;
		LinkedList<Parent> parent_ll = new LinkedList<Parent>();
		for (int i = 0; i < fill_count; i++) {
			long arr_start_time = System.nanoTime();
			String parentFirstName = getRandomName();
			String parentSecondName = getRandomName();
			String parentPatronymicName = getRandomName();
			int parentAge = getRandomAge();
			char parentSex = getRandomSex();
			int parentMoney = getRandomMoney();
			Parent par = new Parent(parentFirstName, parentSecondName, parentPatronymicName,
									parentAge, parentSex, parentMoney);
			parent_ll.add(par);
			long arr_end_time = System.nanoTime();
			filling_time[i] = arr_end_time - arr_start_time;
			try {
				writer.append("add, ID = " + parent_ll.indexOf(par) +  ", " + String.valueOf(filling_time[i]) + " ns" + '\n');
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        //Time counting
		long ll_total_time = Arrays.stream(filling_time).sum();
		long ll_median_time = ll_total_time / fill_count;
		
		try {
			writer.append("addTotalCount = " + fill_count + '\n');
			writer.append("addTotalTime = " + ll_total_time + " ns" + '\n');
			writer.append("addMedianTime = " + ll_median_time + " ns" + '\n' + '\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
		//LinkedList removing
		
		int rem_count = (int) (fill_count * 0.1);
		long[] removing_time = new long[rem_count] ;
		Random rnd = new Random();
		for (int i = 0; i < rem_count; i++) {
			long ll_rem_start_time = System.nanoTime();
			int ll_id = rnd.nextInt(parent_ll.size()); 
			parent_ll.remove(ll_id);
			long ll__rem_end_time = System.nanoTime();
			removing_time[i] = ll__rem_end_time - ll_rem_start_time;
			try {
				writer.append("Remove, ID = " + ll_id +  ", " + String.valueOf(removing_time[i]) + " ns" + '\n');
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Time counting
		long ll_total_rem_time = Arrays.stream(removing_time).sum();
		long ll_median_rem_time = ll_total_rem_time / rem_count;
		
		try {
			writer.append("removeTotalCount = " + rem_count + '\n');
			writer.append("removeTotalTime = " + ll_total_rem_time + " ns" + '\n');
			writer.append("removeMedianTime = " + ll_median_rem_time + " ns" + '\n' + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ll_median_time;
		
	}

	protected	 long ArrList(FileWriter writer, int fill_count) {
		try {
			writer.append("ArrayList" + '\n');
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		long[] filling_time = new long[fill_count] ;
        ArrayList<Parent> parent_al = new ArrayList<Parent>();
		for (int i = 0; i < fill_count; i++) {
			long arr_start_time = System.nanoTime();
			String parentFirstName = getRandomName();
			String parentSecondName = getRandomName();
			String parentPatronymicName = getRandomName();
			int parentAge = getRandomAge();
			char parentSex = getRandomSex();
			int parentMoney = getRandomMoney();
			Parent par = new Parent(parentFirstName, parentSecondName, parentPatronymicName,
									parentAge, parentSex, parentMoney);
			parent_al.add(par);
			long arr_end_time = System.nanoTime();
			filling_time[i] = arr_end_time - arr_start_time;
			try {
				writer.append("add, ID = " + parent_al.indexOf(par) +  ", " + String.valueOf(filling_time[i]) + " ns" + '\n');
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		//Time counting
		long total_time = Arrays.stream(filling_time).sum();
		long median_time = total_time / fill_count;
		
		try {
			writer.append("addTotalCount = " + fill_count + '\n');
			writer.append("addTotalTime = " + total_time + " ns" + '\n');
			writer.append("addMedianTime = " + median_time + " ns" + '\n' + '\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//ArrayList removing
		
		int rem_count = (int) (fill_count * 0.1);
		long[] removing_time = new long[rem_count] ;
		Random rnd = new Random();
		for (int i = 0; i < rem_count; i++) {
			long arr_rem_start_time = System.nanoTime();
			int arr_id = rnd.nextInt(parent_al.size()); 
			parent_al.remove(arr_id);
			long arr__rem_end_time = System.nanoTime();
			removing_time[i] = arr__rem_end_time - arr_rem_start_time;
			try {
				writer.append("Remove, ID = " + arr_id +  ", " + String.valueOf(removing_time[i]) + " ns" + '\n');
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Time counting
		long total_rem_time = Arrays.stream(removing_time).sum();
		long median_rem_time = total_rem_time / rem_count;
		
		try {
			writer.append("removeTotalCount = " + rem_count + '\n');
			writer.append("removeTotalTime = " + total_rem_time + " ns" + '\n');
			writer.append("removeMedianTime = " + median_rem_time + " ns" + '\n' + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return median_time;
	}
	

	private String getRandomName() {
			byte[] array = new byte[7]; // length is bounded by 7
			new Random().nextBytes(array);
			String generatedString = new String(array, Charset.forName("UTF-8"));
			return generatedString;
	}
	private int getRandomAge() {
		Random rnd = new Random();
		int par_age = rnd.nextInt(40) + 40;
		return par_age;
	}
	private char getRandomSex() {
		Random r = new Random();
	    String alphabet = "mf";
	    char par_sex = alphabet.charAt(r.nextInt(alphabet.length()));
	    return par_sex;
	}
	private int getRandomMoney() {
		Random rnd = new Random();
		int par_money = rnd.nextInt(10000) + 10000;
		return par_money;
	}
}
