package hai.bloghue.services;

import hai.bloghue.model.Blog;

import java.util.List;

public interface BlogServices {
List<Blog>findAll();
Blog findById(Long id);
void add(Blog blog);
void edit(Blog blog);
void remove(Long id);
}
