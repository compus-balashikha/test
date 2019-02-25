package com.company.temp;

import javafx.scene.chart.Chart;

import java.util.List;

public class ChartObject {
    long time;
    double close;
    double high;
    double low;
    double open;
    double volumefrom;
    double volumeto;

    @Override
    public String toString() {
        return "{" +
                "time=" + time +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", open=" + open +
                ", volumefrom=" + volumefrom +
                ", volumeto=" + volumeto +
                "}\n";
    }
}

class FullResponse {
    List<ChartObject> Data;
}