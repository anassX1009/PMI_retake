public class Assistant extends Dentist{
    public void refreshAppointment(String patientName, String time){
        
        for (int i = 0; i < apps.size(); i++) {
            if(apps.get(i).getPatientName().equals(patientName)){
                apps.get(i).setAppointment(time);
            }
        }
    }
}

