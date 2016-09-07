package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    
    public static final String ADD_TAG = "+";
    public static final String REMOVE_TAG = "-";
    
    private final Person person;
    private final Tag tag;
    private boolean isTagged;
    
    public Tagging(Person person, Tag tag) {
        this.person = person;
        this.tag = tag;
        isTagged = true;
    }
    
    public Tagging(Person person, Tag tag, boolean remove) {
        this.person = person;
        this.tag = tag;
        isTagged = remove;
    }
    
    public String printTagging() {
        String output = "";
        if (isTagged) {
            output = ADD_TAG;
        }
        else {
            output = REMOVE_TAG;
        }
        output += " " + person.getName() + " " + tag.toString();
        
        return output;
    }

}
