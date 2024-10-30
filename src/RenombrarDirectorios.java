import java.io.File;

public class RenombrarDirectorios {

    public void renombrarDirectorios(String path){


        //validemos que el path sea un dirctorio
        File directorio = new File(path);
        if (!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio valido");
            return;
        }
        /// Aca vamos a camiar los nombre

        System.out.println("La ruta path es valida");

        renombrarDirectoriosInternos(directorio);
    }

    public void renombrarDirectoriosInternos(File directorio){
        //Listar todos los archivos y/o carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles(); 
        if(directoriosArchivosInternos == null){
            return;
        }

        for(File directoriosArchivos : directoriosArchivosInternos){
            if(directoriosArchivos.isDirectory()){
                //si es un directorio, renombralo
                String nombre
            }
        }

    }
}
