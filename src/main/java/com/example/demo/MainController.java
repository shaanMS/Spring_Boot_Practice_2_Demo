package com.example.demo;


import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.Iterator;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private CustRepo custRepo;

    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private BilRepo billRepo;

    @Autowired
    private LoginRepo loginRepo;
    @Autowired
    private MobileCompRepo mobileCompanyRepo;
    @Autowired
    private MobileDetaillsRepo mobileDetailsRepo;






    /*---------------------------------------------------------*/
    //   CRUD OF
    
    
      /*   1-  CUSTOMER
    
           2-  BILL
          
           3-  EMPLOYEE
         
           4-LOGIN
         
           5-MOBILE COMPANY
         
           6-MOBILEDETAILS
          
     */
    /*
     We will Implement  -------->>

                        Hibernate from tym to tym as learned
                        Node js
                        Graal Support
                        Github
                        Spring boot More Annotation
                        o2Auth Impl
                        Jwt Impl
                        IOC
                        Aop
                        CI and Cd
                        Docker
                        Devops
                        """ Leaking Internals ""-->Dep Inject
                        Validations Remains
                        Ctrl+shift+space =Excellent
                        @Request PAram Must be vertical In A line
                        @id @gen val primafry key h to dekho lagana h wrna nhi
                        RelationShip Baad M aply krna


     */
    /*  Till Now Only Get And Put is implemented  --19 april 23










     */


    /*--------CODE STARTS-----1------------------------*/


    @PostMapping(path = "/addCustomers") // Map ONLY POST Requests
    public @ResponseBody String addCustomer(@RequestParam String name
            , @RequestParam String email) {

        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Customer cust = new Customer();
        cust.setName(name);
        cust.setEmail(email);
        custRepo.save(cust);
        return "Saved Customer";
    }


    @GetMapping(path = "/allCustomers")
    public @ResponseBody Iterable<Customer> getAllCustomer() {
        // This returns a JSON or XML with the users
        return custRepo.findAll();
    }







    /*-----------------------2-----------------------*/


    @PostMapping(path = "/addBill")// Ye path name alag hona chaihye
    public @ResponseBody String addBill(@RequestParam String name
            , @RequestParam String attend,
                                        @RequestParam Integer id,
                                        @RequestParam Integer billId,
                                        @RequestParam Integer imei,
                                        @RequestParam String mob,
                                        @RequestParam String model
            , @RequestParam String email) {
        Bill bill = new Bill();
        bill.setCustomerName(name);
        bill.setCustomerNO(id);
        bill.setAttend(attend);
        bill.setBiiId(billId);
        bill.setImei(imei);
        bill.setMob(mob);
        bill.setModel(model);
        bill.setEmail(email);
        billRepo.save(bill);
        return "Saved Bill";// ye return success messeage hai// 200 ayega
    }


    @GetMapping(path = "/getBill")
    public @ResponseBody Iterable<Bill> getAllBills() {
        // This returns a JSON or XML with the users
        return billRepo.findAll();
    }










    /*---------------------------------3---------------------------------------*/


    @PostMapping(path = "/addEmployee")// Ye path name alag hona chaihye
    public @ResponseBody String addEmployee(@RequestParam String aId
            , @RequestParam String name,
                                            @RequestParam String phone,
                                            @RequestParam String email,
                                            @RequestParam String address,
                                            @RequestParam String uname) {
        Employee emp = new Employee();
        emp.setAdress(address);
        emp.setAdhaarId(aId);
        emp.setEmail(email);
        emp.setName(name);
        emp.setPhone(phone);
        emp.setUname(uname);
        empRepo.save(emp);
        return "Saved Employee";
    }


    @GetMapping(path = "/getEmployees")
    public @ResponseBody Iterable<Employee> getAllEmplyees() {


        // This returns a JSON or XML with the users
        return empRepo.findAll();
    }

    /*------------------------------------4--------------------*/


    // Method  to get Login Not adding the user
    @PostMapping(path = "/matchLogin")
    public @ResponseBody String gettingLogin(@RequestParam Integer id,
                                             @RequestParam String utype,
                                             @RequestParam String uname,
                                             @RequestParam String passw) {
        Login login = new Login();
        Iterable<Login> it = loginRepo.findAll();
        Iterator<Login> i = it.iterator();

        //  Via loop But Not Feasible  in case Lare Login values
        while (i.hasNext()) {

            if (i.next().getPassword().equals(passw)) {
                System.out.println(i.next().getPassword());


            }


        }


        return "Not Matched";
    }


    @GetMapping(path = "/getLogins")
    public @ResponseBody Iterable<Login> findLogins() {
        return loginRepo.findAll();
    }




    /*-----------------------------5----------------------------*/


    @PostMapping(path = "/mobileCompany")
    public @ResponseBody String addMobileComp(@RequestParam Integer compId,
                                              @RequestParam String mobilename) {


        MobileCompany mobcom=new MobileCompany();
        mobcom.setCompId(compId);
        mobcom.setMobilename(mobilename);
        mobileCompanyRepo.save(mobcom);
        return "Saved Details";
    }



    @GetMapping(path="/getMobCompDet")
    public @ResponseBody Iterable<MobileCompany> getMobCompDet()
    {
        return mobileCompanyRepo.findAll();
    }










    /*--------------------------------6--------------------------*/

    //Pending Due To Lot of Deatils





















    /*----------------------------Entities Finished---------------------------------*/


















}