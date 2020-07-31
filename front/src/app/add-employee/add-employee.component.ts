import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,private router: Router,private service: EmployeeService) { }
  public error : boolean =false;
  createForm = this.formBuilder.group({ 
    firstName: ['', Validators.required],
    lastName: ['', Validators.required],
    email: ['', Validators.compose([Validators.required, Validators.email])],
    tel: ['', Validators.required], 
    adress: ['', Validators.required], 
    birthDate: ['', Validators.required],
   
  });

  ngOnInit() {
  }

  onSubmit(){
    this.service.createClient(this.createForm.value)
    .subscribe(res => {
      this.router.navigate(['employeeList']);
       },err=>{this.error=true})
    }
  

}
