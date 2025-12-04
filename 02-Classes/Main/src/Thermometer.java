public class Thermometer {
	private double temp;

	void setTemp(double tmp)
	{
		if(tmp < -50 || tmp > 50)
			throw new IllegalArgumentException("Температура вне допустимого диапазона");
		temp = tmp;
	}

	double getTemp()
	{
		return temp;
	}
}
