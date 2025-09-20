package cotroller;
import  entity.Category;          // Entity Category
import Service.CategoryService;  // Service Category
import org.springframework.stereotype.Controller;  // @Controller annotation
import org.springframework.ui.Model;              // Model để đưa dữ liệu ra JSP
import org.springframework.web.bind.annotation.*; // @RequestMapping, @GetMapping, @PostMapping, @PathVariable, @RequestParam, @ModelAttribute
import java.util.List;   
@Controller
@RequestMapping("/admin/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) { this.service = service; }

    @GetMapping
    public String list(Model model, @RequestParam(required = false) String keyword) {
        List<Category> list = (keyword != null) ? service.search(keyword) : service.getAll();
        model.addAttribute("categories", list);
        model.addAttribute("keyword", keyword);
        return "category/list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("category", new Category());
        return "category/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Category category) {
        service.save(category);
        return "redirect:/admin/categories";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("category", service.getById(id));
        return "category/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/categories";
    }
}
