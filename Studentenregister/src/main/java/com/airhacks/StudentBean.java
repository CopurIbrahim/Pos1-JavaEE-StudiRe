package com.airhacks;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="student")
@SessionScoped
public class StudentBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static long  x = 000;
	private static final ArrayList<Student> studentList = new ArrayList<>(); 
	
	
	public static ArrayList<Student> getStudentlist() {
		return studentList;
	}



	public static class Student{
		long matrikelnummer;
		String nachname;
		String vorname;
		String adresse;
		Integer postleitzahl;
		String ort;
		
		
		
	public Student(String nachname, String vorname, String strasse, Integer post, String ort) {
			this.matrikelnummer = StudentBean.x;
			this.nachname = nachname;
			this.vorname = vorname;
			this.adresse = strasse;
			this.postleitzahl = post;
			this.ort = ort;
			this.matrikelnummer = StudentBean.x;
	}


		public long getMatrikelnummer() {
			return matrikelnummer;
		}


		public void setMatrikelnummer(long matrikelnummer) {
			this.matrikelnummer = matrikelnummer;
		}


		public String getNachname() {
			return nachname;
		}


		public void setNachname(String nachname) {
			this.nachname = nachname;
		}


		public String getVorname() {
			return vorname;
		}


		public void setVorname(String vorname) {
			this.vorname = vorname;
		}


		public String getStrasseHaus() {
			return adresse;
		}


		public void setStrasseHaus(String strasseHaus) {
			this.adresse = strasseHaus;
		}


		public String getOrt() {
			return ort;
		}

		
		public void setOrt(String ort) {
			this.ort = ort;
		}

		
		
	}
}