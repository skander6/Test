import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

const routes: Routes = [
  {path:'',
  redirectTo:'/addEmployee',
  pathMatch:'full'
 },
 {path:'addEmployee',
   component:AddEmployeeComponent
  },
  {path:'employeeList',
  component:EmployeeListComponent
 },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
