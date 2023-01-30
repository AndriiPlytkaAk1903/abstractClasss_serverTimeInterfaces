import java.time.format.SignStyle;

public class BackSequence implements CharSequence {

    private String string;

    public BackSequence(String string){
        this.string=string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= string.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return string.charAt(string.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = string.length()-1;
        if(start<0 || end <0){
            throw new IndexOutOfBoundsException();
        }

        if(start>length || end>length || start>end){
            throw  new IndexOutOfBoundsException();
        }

        int startFrom = length-start;
        int fromEnd = length-end;
        StringBuilder builder=new StringBuilder();
        for(int i=startFrom; i>=fromEnd; i--){
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.string);
        return s.reverse().toString();
    }
}
