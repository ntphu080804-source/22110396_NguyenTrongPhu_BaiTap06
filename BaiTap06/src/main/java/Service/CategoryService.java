package Service;
import  entity.Category;
import  Repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;
public interface CategoryService {
	List<Category> getAll();
    Category getById(Long id);
    Category save(Category category);
    void delete(Long id);
    List<Category> search(String keyword);
}
