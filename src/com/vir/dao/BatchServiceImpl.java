package com.vir.dao;

import java.util.List;

import com.vir.model.Batch;

public class BatchServiceImpl implements BatchService {
	private BatchDaoImpl b=new BatchDaoImpl();

	@Override
	public Batch findById(int id) {
		// TODO Auto-generated method stub
		return b.findById(id);
	}

	@Override
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		return b.getAllBatch();
	}

	@Override
	public boolean addBatch(Batch batch) {
		// TODO Auto-generated method stub
		return b.addBatch(batch);
	}

	@Override
	public boolean removeBatch(Batch batch) {
		// TODO Auto-generated method stub
		return b.removeBatch(batch);
	}

	@Override
	public boolean updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		return b.updateBatch(batch);
	}
	
	
}
