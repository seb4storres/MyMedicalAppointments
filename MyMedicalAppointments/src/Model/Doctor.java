package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email){
       super(name,email);
   }

    ArrayList<AvaiableAppointment> avaiableAppointments = new ArrayList<>();
    public void addAvaiableAppointment(String date, String time){
        avaiableAppointments.add(new AvaiableAppointment(date,time));
    }
    public ArrayList <AvaiableAppointment> getAvaiableAppointments(){
        return avaiableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Speciality: "+ speciality+ "\nAvaiable: "+ avaiableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Cruz Rojas");
        System.out.println("Cancerologia");
    }

    public static class AvaiableAppointment{
       private String id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        public AvaiableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Avaiable Appointment \n Date: "+date+ "\nTime: "+time;
        }
    }
}
