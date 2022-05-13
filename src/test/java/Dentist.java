import java.util.ArrayList;

public class Dentist {
    ArrayList<Appointments> appointments = new ArrayList<>();

    public void newAppointment(String patientName, String timestamp) {
        boolean flag = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientName().equals(patientName)) {
                flag = true;
            }
        }
        if (!flag) {
            appointments.add(new Appointments(patientName, timestamp));
        }

    }

    public String getAppointments() {
        String appointment = "";
        for (int i = 0; i < appointments.size(); i++) {
            if (i < appointments.size() - 1) {
                appointment = appointment + appointments.get(i).getPatientName() + " " + appointments.get(i).getAppointment() + "\r\n";
            } else {
                appointment = appointment + appointments.get(i).getPatientName() + " " + appointments.get(i).getAppointment();
            }
        }
        return appointment;
    }

    public void resign(String patientName) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientName().equals(patientName)) {
                appointments.remove(i);
            }
        }
    }


    class Appointments {
        String patientName;
        String appointment;

        public Appointments(String patientName, String appointment) {
            this.patientName = patientName;
            this.appointment = appointment;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getAppointment() {
            return appointment;
        }

        public void setAppointment(String appointment) {
            this.appointment = appointment;
        }
    }
}




