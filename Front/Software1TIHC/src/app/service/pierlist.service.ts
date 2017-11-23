import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { PierList } from '../interface/pierList';
import 'rxjs/add/operator/map';

@Injectable()
export class PierlistService {
    pierList: PierList[] = [];
    constructor(public http: HttpClient) { }
    getPierList() {
        let url: string = 'http://181.143.139.214:9763/services/TIHC_DSS.HTTPEndpoint/pierList/';
        let headers = new HttpHeaders({
            'Accept': 'application/json'
        });
        return this.http.get(url, { headers }).map((response: any) => {
            this.pierList = response.users.user;
            return this.pierList;
        });
    }

}
