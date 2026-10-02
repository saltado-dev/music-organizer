import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    //comment
    //second comment
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    //This is question 3 1/2
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    //This is question 3 2/2
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    //This is question 1
    public void checkIndex(int index) {
        if (index >= 0 && index < files.size()) {
            System.out.println("It's valid");
        }
        else {
            System.out.println("Error: invalid number. Enter index beween 0 and " + (files.size() - 1));
        }
    }
    
    //This is question 2
    public boolean validIndex (int index) {
        if (index >= 0 && index <files.size()) {
            return true;
        }
        else {
            return false;
        }
    }
    //This is question 5 (You would need a loop)
    //This is question 6
    public void listAllFiles() {        
        //This is question 4
        for(String filename : files) {
            System.out.println(filename);
        }
    }
    
    public void listWithIndex() {
        int position = 0;
        for(String filename : files) {
            System.out.println(position + ": " + filename);
            position++;
        }
    }
}
