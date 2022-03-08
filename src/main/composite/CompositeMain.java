package main.composite;

public class CompositeMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
      ConcreteCompany root = new ConcreteCompany("北京总公司");
      root.add(new HRDepartment("北京总公司人力部"));
      root.add(new FinanceDepartment("北京总公司财务部"));
      
      ConcreteCompany comp = new ConcreteCompany("上海分公司");
      comp.add(new HRDepartment("上海分公司人力部"));
      comp.add(new FinanceDepartment("上海分公司财务部"));
      root.add(comp);
      
      ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
      comp1.add(new HRDepartment("南京办事处人力部"));
      comp1.add(new FinanceDepartment("南京办事处财务部"));
      comp.add(comp1);

      Company test=new HRDepartment("sdaf");
      test.add(comp);

      System.out.println("公司结构:");
      root.display(1);
      
      System.out.println("职责:");
      root.lineOfDuty();
  }

}
