
package net.may5.service;

import net.may5.dao.EvaluationMapper;
import net.may5.dto.Evaluation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {

	@Autowired
	private EvaluationMapper evaluationMapper;

	@Override
	public void setEvaluation(Evaluation evaluation) {
		evaluationMapper.setEvaluation(evaluation);
		
	}

	@Override
	public void delEvaluation(int evaluationIndex) {
		evaluationMapper.delEvaluation(evaluationIndex);
		
	}


	
}

