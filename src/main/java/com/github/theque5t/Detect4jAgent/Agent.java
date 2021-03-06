package com.github.theque5t.Detect4jAgent;

import java.io.File;
import java.io.FileWriter;
import java.lang.instrument.Instrumentation;

public class Agent {
    private static void scan(String agentArgs, Instrumentation inst) throws Exception{ 
        String scanHome = agentArgs.split("DETECTORDELIMITER")[0];
        String scanTargetPattern =  agentArgs.split("DETECTORDELIMITER")[1];

        FileWriter scanResultsOverwrite = null;
        FileWriter scanResultsAppender = null;
        FileWriter scanErrorsOverwrite = null;
        FileWriter scanErrorsAppender = null;
        try{
            File scanResultFile = new File(scanHome + "/results.txt");
            if(!scanResultFile.getParentFile().exists()){
                scanResultFile.getParentFile().mkdirs();
            }

            File scanErrorFile = new File(scanHome + "/errors.txt");
            if(!scanErrorFile.getParentFile().exists()){
                scanErrorFile.getParentFile().mkdirs();
            }
            
            scanResultsOverwrite = new FileWriter(scanResultFile, false);
            scanResultsOverwrite.write("");
            scanErrorsOverwrite = new FileWriter(scanErrorFile, false);
            scanErrorsOverwrite.write("");

            scanResultsAppender = new FileWriter(scanResultFile, true);
            Class[] loadedClasses = inst.getAllLoadedClasses();
            for (Class c : loadedClasses){
                if(c.getPackage() != null && c.getPackage().getName().matches(scanTargetPattern)){
                    scanResultsAppender.write(
                        "Detected class matching scan target pattern loaded: " + "\n" +
                        "Class Name: " + c.getName() + "\n" +
                        "Class Location: " + c.getProtectionDomain().getCodeSource().getLocation().getPath() + "\n" +
                        "Package Name: " +c.getPackage().getName() + "\n" +
                        "Package Specification Title: " + c.getPackage().getSpecificationTitle() + "\n" +
                        "Package Specification Vendor: " + c.getPackage().getSpecificationVendor() + "\n" +
                        "Package Specification Version: " + c.getPackage().getSpecificationVersion() + "\n" +
                        "Package Implementation Title: " + c.getPackage().getImplementationTitle() + "\n" +
                        "Package Implementation Vendor: " + c.getPackage().getImplementationVendor() + "\n" +
                        "Package Implementation Version: " + c.getPackage().getImplementationVersion() + "\n"
                    );
                }
            }
        }
        catch(Exception e){
            File scanErrorFile = new File(scanHome + "/errors.txt");
            if(!scanErrorFile.getParentFile().exists()){
                scanErrorFile.getParentFile().mkdirs();
            }
            scanErrorsOverwrite = new FileWriter(scanErrorFile, false);
            scanErrorsOverwrite.write("");
            scanErrorsAppender = new FileWriter(scanErrorFile, true);
            scanErrorsAppender.write(e.toString());
            for (StackTraceElement element : e.getStackTrace()) {
                scanErrorsAppender.write(" at " + element.toString() + "\n");
            }
        }
        finally{
            if(scanResultsOverwrite!=null){
                scanResultsOverwrite.close();
            }
            if(scanResultsAppender!=null){
                scanResultsAppender.close();
            }   
            if(scanErrorsOverwrite!=null){
                scanErrorsOverwrite.close();
            }   
            if(scanErrorsAppender!=null){
                scanErrorsOverwrite.close();
            }   
        }
    }

    public static void premain(String agentArgs, Instrumentation inst) throws Exception {
        scan(agentArgs, inst);
    }

    public static void agentmain(String agentArgs, final Instrumentation inst) throws Exception {
        scan(agentArgs, inst);
    }
}
