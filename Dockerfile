FROM grafana/grafana:9.1.0

RUN grafana-cli plugins install jdbranham-diagram-panel 1.7.3