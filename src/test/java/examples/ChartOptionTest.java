package examples;

import org.junit.Test;
import org.one2team.highcharts.shared.ChartOptions;
import org.one2team.highcharts.shared.Jsonify;

public class ChartOptionTest {

	@Test
	public void test() {
		final SamplesFactory highchartsSamples = SamplesFactory.getSingleton();

		// ====================================================================
		// ChartOptions creation
		// ----------------------
		// The createHighchartsDemoColumnBasic method describes the creation of
		// a java chartOption. It is a java equivalent to javascript Highcharts
		// sample
		// (see http://highcharts.com/demo/column-basic)
		ChartOptions chartOptions = highchartsSamples.createColumnBasic();
		System.out.println(((Jsonify) chartOptions).toJson());
	}
}
