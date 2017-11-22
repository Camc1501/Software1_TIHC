import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../service/employee.service';
import { Employee } from '../../interface/employee';

@Component({
    selector: 'app-employees',
    templateUrl: './employees.component.html',
    styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
    employees: Employee[] = [];
    constructor(public _employees: EmployeeService) {
        this._employees.getEmployee().subscribe((response: Employee[]) => {
            this.employees = response;
        });
    }

    ngOnInit() {
    }

}
