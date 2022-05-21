import controller.ProjectController;
import model.Project;
import util.ConnectionFactory;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ProjectController projectController = new ProjectController();
        
//        Project project = new Project(); 
//        project.setName("Projeto teste");
//        project.setDescription("description");
//        projectController.save(project);
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setId(12);
        project.setName("Novo nome do projeto");
        project.setDescription("description");
        
        projectController.update(project);
    }
    
}
