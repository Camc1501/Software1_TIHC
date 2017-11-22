import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Employee } from '../interface/employee';
import 'rxjs/add/operator/map';

@Injectable()
export class EmployeeService {
    employee: Employee;
    constructor(public http: HttpClient) { }
    getEmployee() {
        let url: string = 'http://181.143.139.214:9763/services/TIHC_DSS.HTTPEndpoint/ships/1';
        let headers = new HttpHeaders({
            'Accept': 'application/json'
        });
        return this.http.get(url, { headers }).map((response: any) => {
            this.employee = response.users.user;
            return this.employee;
        });
    }
}
