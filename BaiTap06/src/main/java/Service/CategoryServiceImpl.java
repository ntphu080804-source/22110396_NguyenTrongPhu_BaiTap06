package Service;

import entity.Category;
import Repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
	private final CategoryRepository repo;

	public CategoryServiceImpl(CategoryRepository repo) {
		this.repo = repo;
	}

	public List<Category> getAll() {
		return repo.findAll();
	}

	public Category getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Category save(Category c) {
		return repo.save(c);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Category> search(String keyword) {
		return repo.findByNameContainingIgnoreCase(keyword);
	}
}
