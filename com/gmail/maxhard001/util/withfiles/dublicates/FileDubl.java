// package com.gmail.maxhard001.util.withfiles.dublicates;

// import java.io.File;
// import java.nio.file.InvalidPathException;
// import java.nio.file.Path;
// import java.util.ArrayList;
// import java.util.List;
// import com.gmail.maxhard001.util.withfiles.hash.FileHash;


// public class FileDubl {

//     static List<FileInfo> allFiles = new ArrayList<>();
    
    
//     static class FileInfo {
//         @Override
//         public int hashCode() {
//             final int prime = 31;
//             int result = 1;
//             result = prime * result + ((name == null) ? 0 : name.hashCode());
//             result = prime * result + size;
//             return result;
//         }
//         @Override
//         public boolean equals(Object obj) {
//             if (this == obj) {
//                 return true;
//             }
//             if (obj == null) {
//                 return false;
//             }
//             if (getClass() != obj.getClass()) {
//                 return false;
//             }
//             FileInfo other = (FileInfo) obj;
//             if (size != other.size) {
//                 return false;
//             }
//             if (!FileHash.get(path).equals(FileHash.get(other.path))) {
//                 return false;
//             }
//             return true;
//         }
        
//         String name;
//         int size;
//         Path path;
//         FileInfo dublicateOf;
//         /**
//          * @param name
//          * @param size
//          * @param path
//          */
//         public FileInfo(String name, int size, Path path) {
//             this.name = name;
//             this.size = size;
//             this.path = path;
//         }
//         /**
//          * @return the name
//          */
//         public String getName() {
//             return name;
//         }
//         /**
//          * @return the size
//          */
//         public int getSize() {
//             return size;
//         }
//         /**
//          * @return the path
//          */
//         public Path getPath() {
//             return path;
//         }
//         /**
//          * @return the dublicateOf
//          */
//         public FileInfo getDublicateOf() {
//             return dublicateOf;
//         }

        
//     }
    
//     public static void main(String[] args) {

//         if (args.length < 1) {
//             System.out.println("Wrong arguments number. Expected file path.");
//             return;
//         }

//         File file1 = null;
//         File file2 = null;
//         try {
//              file1 = Path.of(args[0]).toFile();
//              file2 = Path.of(args[1]).toFile();

//              System.out.println(file1.toPath().toString());
//              System.out.println(FileHash.get(file1));
//              System.out.println(file2.toPath().toString());
//              System.out.println(FileHash.get(file2) + "\n");
            
//             FileInfo f1 = new FileInfo("1", 0, Path.of(args[0]));
//             FileInfo f2 = new FileInfo("2", 1, Path.of(args[1]));

//             System.out.println(f1.equals(f2));


//         } catch (InvalidPathException | UnsupportedOperationException e) {
//             System.out.println("Wrong file name: " + args[0]);
//             e.printStackTrace();
//         }

        
//     }

// }

