package com.novasolutionsystems.exercicies.java8.mario;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PalMockito {

	
	public static void main(String[] args) {
		
		PalMockito p = new PalMockito();
		
		List<Step> pasos = new LinkedList<Step>();// esta lista la regresa el snake ya leímos el yaml
		pasos.add(p.new Step("mierda","la otra mierda"));
		pasos.add(p.new Step("inicio","carrusel"));
		pasos.add(p.new Step("inicio","carrusel2"));
		//--
		System.out.println(pasos);
		//--
		final String a1 = "inicio";
		final String a2 = "carrusel";
		pasos.stream().anyMatch(s -> {
			p.setCurrentStep(s.getCurrentStep());
			return s.getCurrentStep().equals(a1)
					&& s.getNextStep().equals(a2);
		});
		
		System.out.println(Arrays.asList(pasos.stream().toArray()));
	}
	public void setCurrentStep(String currentStep) {
		System.out.println("currentStep: " + currentStep);
	}
	public PalMockito() {
	}
	
	class Step{
		private String currentStep;
		private String nextStep;
		
		public Step(String currentStep,String nextStep) {
			this.currentStep = currentStep;
			this.nextStep = nextStep;
		}
		
		
		public String getCurrentStep() {
			return currentStep;
		}
		public void setCurrentStep(String currentStep) {
			this.currentStep = currentStep;
		}
		public String getNextStep() {
			return nextStep;
		}
		public void setNextStep(String nextStep) {
			this.nextStep = nextStep;
		}
		
		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("currentStep: ").append(getCurrentStep()).append(" nextStep: ").append(getNextStep());
			return sb.toString();
		}
		
	}

}
;