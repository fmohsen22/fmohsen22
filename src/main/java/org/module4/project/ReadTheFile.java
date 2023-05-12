package org.module4.project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTheFile {
    public static List<DataObject> createObjectFromCsv() {
        String csvFile = "table-data.csv";
        String line = "";
        String cvsSplitBy = ",";

        List<DataObject> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // Skip the header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Split the line into fields
                String[] fields = line.split(cvsSplitBy);

                // Create a new DataObject and set its fields
                DataObject dataObj = new DataObject(
                        fields[0],
                        fields[1],
                        fields[2],
                        fields[3],
                        fields[4],
                        fields[5],
                        Boolean.parseBoolean(fields[6]),
                        fields[7],
                        Integer.parseInt(fields[8])
                );

                // Add the DataObject to the list
                dataList.add(dataObj);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (dataList.stream().anyMatch(o->o.getFullName().equals("Angelia MacGoun"))){
            System.out.println("the person exist!\n");

        }
        // Do something with the list of DataObjects
        for (DataObject obj : dataList) {
            if (obj.getFullName().equals("Angelia MacGoun")){
                System.out.println(obj);

                //check if she has activated account
                System.out.println("\nthe Account is Activated:"+obj.isActive());
            }
            //System.out.println(obj);
        }

        return dataList;
    }
}
