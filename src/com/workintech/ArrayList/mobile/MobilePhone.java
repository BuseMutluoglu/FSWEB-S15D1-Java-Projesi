package com.workintech.ArrayList.mobile;

import java.util.ArrayList;
import java.util.Collections;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        try {
            if(!myContacts.contains(contact) && contact.getName()!=null && contact.getPhoneNumber()!=null){
                myContacts.add(contact);
                return true;
            }
        } catch (Exception ex){
            System.out.println("valid error" +ex.getMessage());
        }

        return false;


    }
    public boolean updateContact(Contact newContact, Contact oldContact){
        if(myContacts.contains(oldContact)){
            oldContact.setName(newContact.getName());
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            return true;
        }
        return false;


    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact.toString().trim().toLowerCase())){
            myContacts.remove(contact.toString().trim().toLowerCase());
        } else {
            return false;
        }
        return true;
    }
    public int findContact(Contact contact){
        try {
            if(myContacts.contains(contact.toString().trim().toLowerCase())){
                return myContacts.indexOf(contact.toString().trim().toLowerCase());
            } else {
                return -1;
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            return Integer.parseInt(ex.getMessage());
        }

    }

    public int findContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }
        return null;
    }

    public void printContact(){
        for(int i=0; i < myContacts.size(); i++){
            System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

}
