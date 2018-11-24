package com.cg.choc.dao;

import java.util.List;

import com.cg.choc.dto.Chocolate;

public interface IChocolateDao 
{
	public List<Chocolate> getAllChocolates();

	Chocolate insertChocolate(Chocolate chocolate);
}
