package Abstract;
class Job extends Employee{
    public String Skill = "Java";
    public Job (String id , String name , Double salary){
        super(id, name, salary);
    }

    //Override
    public void bonus(){
        //System.out.println("20 %");
    }
}
