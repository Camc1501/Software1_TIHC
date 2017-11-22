import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Ship } from '../interface/ship';
import 'rxjs/add/operator/map';

@Injectable()
export class ShipsService {
    ship: Ship[] = [];
    constructor(public http: HttpClient) {

    }

    getShip() {
        let url: string = 'http://181.143.139.214:9763/services/TIHC_DSS.HTTPEndpoint/ships/1';
        let headers = new HttpHeaders({
            'Accept': 'application/json'
        });
        return this.http.get(url, { headers }).map((response: any) => {
            this.ship = response.users.user;
            return this.ship;
        });
    }
}
