public class Time1 {

    private int hour, minute, second;

    public void setTime(int hour, int minute, int second) 
    {
        //valida hora, minuto e segundo
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
        second < 0 || second >= 60)
        {
            throw new IllegalArgumentException(
                "hour, minute and/or second was out of range"
            );
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //converte em string no formato de data/hora universal(HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //converte em string no formato padrao de data/hora (H:MM:SS AM ou PM)
    public String toString() {
        return String.format("%02d:%02d:%02d",
        ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
        (hour < 12 ? "AM" : "PM"));
    }
} // fim da classe
