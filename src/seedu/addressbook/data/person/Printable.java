package seedu.addressbook.data.person;

public interface Printable {

    
    
    default String getPrintableString(Printable... printables) {
        String printLine = "";
        
        for (Printable printable : printables) {
            printLine += printable.getPrintableString() + " ";
        }
        
        return printLine;
    }
}
