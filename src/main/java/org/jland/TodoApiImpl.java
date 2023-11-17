package org.jland;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.jland.api.TodoApi;
import org.jland.models.Todo;

public class TodoApiImpl implements TodoApi {

  @Override
  public void createTodo(@Valid @NotNull Todo todo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createTodo'");
  }

  @Override
  public void deleteTodo(Integer todoId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteTodo'");
  }

  @Override
  public Todo getTodo(Integer todoId) {
    return new Todo().completed(false).id(todoId).description("This is a test todo")
    .description("Test Todo").author("Jamie Landusto");
  }

  @Override
  public List<Todo> getTodos(Boolean completed) {    
    return Arrays.asList(new Todo().completed(false).id(12345).description("This is a test todo")
    .description("Test Todo").author("Jamie Landusto"));
  }

  @Override
  public void updateTodo(Integer todoId, @Valid @NotNull Todo todo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateTodo'");
  }

}
