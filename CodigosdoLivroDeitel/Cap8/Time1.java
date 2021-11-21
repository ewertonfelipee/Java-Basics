package CodigosdoLivroDeitel.Cap8;

public class Time1
{
    private
        int hour;
        int minute;
        int second;

    public void setTime(int Hour, int Minute, int Second) 
    {
        //valida hora, minuto e segundo
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
        second < 0 || second >= 60)
        {
            throw new IllegalArgumentException(
                "hour, minute and/or second was out of range");
        }

        this.hour = Hour;
        this.minute = Minute;
        this.second = Second;
    }

    //converte em string no formato de data/hora universal(HH:MM:SS)
    public String toUniversalString() 
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //converte em string no formato padrao de data/hora (H:MM:SS AM ou PM)
    public String toString()
    {
        return String.format("%02d:%02d:%02d",
        ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
        (hour < 12 ? "AM" : "PM"));
    }
} // fim da classe
