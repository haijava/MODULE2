package hai.bloghue.repository.impl;

import hai.bloghue.model.Blog;
import hai.bloghue.repository.BlogRepository;

import java.util.List;

public class BlogRepositoryimpl implements BlogRepository {

    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public Blog findId(Long id) {
        return null;
    }

    @Override
    public void save(Blog model) {

    }

    @Override
    public Void edit(Blog model) {
        return null;
    }

    @Override
    public Void remove(Long id) {
        return null;
    }
}
