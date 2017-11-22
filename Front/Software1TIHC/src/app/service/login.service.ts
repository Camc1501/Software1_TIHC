import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Login } from '../interface/login';
import 'rxjs/add/operator/map';

@Injectable()
export class LoginService {
    employee: Login[] = [];
    constructor(public http: HttpClient) { }
    getlogin() {
        let url: string = 'http://181.143.139.214:9763/services/TIHC_DSS.HTTPEndpoint/login';
        let headers = new HttpHeaders({
            'Accept': 'application/json'
        });
        return this.http.get(url, { headers }).map((response: any) => {
            this.employee = response.users.user;
            return this.employee;
        });
    }
}
