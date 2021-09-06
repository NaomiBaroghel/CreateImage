package primitives;

public class Material {

	 double kD,kS,kR,kT;
	

	public int _nShininess;
	
	
	
	@Override
	public String toString() {
		return "Material [_nShininess=" + _nShininess + "]";
	}

	public Material() {

		this.kD = 1;
		this.kS = 1;
		this.kR = 1;
		this.kT = 1;
		this._nShininess = 2;
	}

	public Material(double kD, double kS, double kR,double kT, int _nShininess) {
		this.kD = kD;
		this.kS = kS;
		this.kR = kR;
		this.kT = kT;
		this._nShininess = _nShininess;
	}
	
	

	public Material(Material m) {
		this.kD = m.kD;
		this.kS = m.kS;
		this._nShininess = m._nShininess;
	}

	public int getShininess()
	{
		return this._nShininess;
	}

	public double getkD() {
		return this.kD;
	}

	public void setkD(double kD) {
		this.kD = kD;
	}

	public double getkS() {
		return this.kS;
	}

	public void setkS(double kS) {
		this.kS = kS;
	}

	public void setShininess(int _nShininess) {
		this._nShininess = _nShininess;
	}
	
	public double getkR() {
		return kR;
	}

	public void setkR(double kR) {
		this.kR = kR;
	}

	public double getkT() {
		return kT;
	}

	public void setkT(double kT) {
		this.kT = kT;
	}
	
}
