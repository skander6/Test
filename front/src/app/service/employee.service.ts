import { Injectable } from '@angular/core';
import {Employee} from 'src/app/model/employee'
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
 

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  private createEmployeeURL = "http://localhost:8080/api/employee/create" ;
  private getAllEmployeeURL = "http://localhost:8080/api/employee/all" ;
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(private http: HttpClient) { }

  findAll(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.getAllEmployeeURL);
  }

  createClient(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(this.createEmployeeURL, employee, {headers: this.httpHeaders});
  }
}
