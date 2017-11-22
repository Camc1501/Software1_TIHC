import { Component, OnInit } from '@angular/core';
/*import { LoginService } from '../../service/login.service';
import { Login } from '../../interface/login';*/

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
    logins: any[] = [];
    constructor() { /*public _login: LoginService) {
        this._login.getlogin().subscribe((response: any[]) => {
            this.logins = response;
        });*/
    }

    ngOnInit() {
    }

}
