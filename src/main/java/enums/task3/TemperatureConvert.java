package enums.task3;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    /*     C_F('C', 'F', temp -> temp * 9 / 5 + 32)*/
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    });

    char input;
    char output;
    Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }

    public static float convertTemperatura(char a, char b, float temperature){
        for (TemperatureConvert temperatureConvert : TemperatureConvert.values()){
            if(temperatureConvert.input == a && temperatureConvert.output == b){
                return temperatureConvert.converter.convert(temperature);
            }
        }
        return Float.MIN_VALUE;
    }
}
