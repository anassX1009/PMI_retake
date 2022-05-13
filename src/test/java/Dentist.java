import java.util.ArrayList;


public class Dentist {
    ArrayList<Appointments> apps = new ArrayList<>();

    public void newAppointment(String patientName, String time) {
        boolean flag = false;
        for (int i = 0; i < apps.size(); i++) {
            if (apps.get(i).getPatientName().equals(patientName)) {
                flag = true;
            }
        }
        if (!flag) {
            apps.add(new Appointments(patientName, time));
        }

    }

    public String getApps() {
        String appointment = "";
        for (int i = 0; i < apps.size(); i++) {
            if (i < apps.size() - 1) {
                appointment = appointment + apps.get(i).getPatientName() + " " + apps.get(i).getAppointment() + "\r\n";
            } else {
                appointment = appointment + apps.get(i).getPatientName() + " " + apps.get(i).getAppointment();
            }
        }
        return appointment;
    }

    public void resign(String patientName) {
        for (int i = 0; i < apps.size(); i++) {
            if (apps.get(i).getPatientName().equals(patientName)) {
                apps.remove(i);
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



