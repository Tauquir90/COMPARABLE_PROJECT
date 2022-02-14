 class Employee implements Comparable<Employee> {
    int eno;
    String e_name;
    double e_salary;
    String e_address;
    public Employee(int eno, String e_name, double e_salary,
                    String e_address)
    {
        this.eno=eno;
        this.e_name=e_name;
        this.e_salary=e_salary;
        this.e_address=e_address;
    }
    public String toString(){
        return"["+eno +", "+e_name+", "+e_salary+", "+e_address+" ]";
    }

    public int compareTo(Employee emp) {
        //Here we are sorting on the basis e_name
        int value = 0;
        try{
            value= (this.e_name).compareTo(emp.e_name);
    }catch(Exception e){
            e.printStackTrace();
        }
        return -value;
    }


}
