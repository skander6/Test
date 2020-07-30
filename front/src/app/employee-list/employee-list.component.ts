import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/service/employee.service'
import {Employee} from 'src/app/model/employee'

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
   employees: Employee[];
  constructor(private service : EmployeeService) { }

  ngOnInit() {
    this.service.findAll()
          .subscribe(res => this.employees = res);
  }

  

}
