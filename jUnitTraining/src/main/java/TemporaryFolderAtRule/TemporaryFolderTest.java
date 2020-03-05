package TemporaryFolderAtRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



import java.io.File;
import java.io.IOException;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
public class TemporaryFolderTest {
	
	@Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();
     
    @Test
    public void testCreateFile() throws IOException{
        File file = tempFolder.newFile("testjunit.txt");
        assertTrue(file.exists());
    }
     
   /* @Test
    public void testDeleteFile() throws IOException{
        File file = tempFolder.newFile("testjunit.txt");
       // file.delete();
        assertFalse(file.exists());
    }*/
     
    @Test
    public void testCreateFolder() throws IOException{
        File file = tempFolder.newFolder("testjunit");
        assertTrue(file.exists());
    }
     
   /* @Test
    public void testDeleteFolder() throws IOException{
        File file = tempFolder.newFile("testjunit");
        //file.delete();
        assertFalse(file.exists());
    }*/
}
