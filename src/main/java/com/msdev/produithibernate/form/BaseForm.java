package com.msdev.produithibernate.form;

public abstract class BaseForm {
		protected boolean erreur;
		
		public abstract boolean verifie();

		public boolean aErreur() {
			return erreur;
		}
}
