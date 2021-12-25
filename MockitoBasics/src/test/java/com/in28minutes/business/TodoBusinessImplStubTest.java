package com.in28minutes.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoservice = new TodoServiceStub();
		TodoBusinessImpl todobusinessImpl = new TodoBusinessImpl(todoservice);
		List<String> todos = todobusinessImpl.retrieveTodosRelatedToSpring("Sai");
		assertEquals(3,todos.size());
		
	}

}
