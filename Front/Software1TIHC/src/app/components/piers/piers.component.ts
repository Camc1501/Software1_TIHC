import { Component, OnInit } from '@angular/core';
import { PiersService } from '../../service/piers.service';

@Component({
    selector: 'app-piers',
    templateUrl: './piers.component.html',
    styleUrls: ['./piers.component.css']
})
export class PiersComponent implements OnInit {
    piers: any[] = [];
    constructor(public _piers: PiersService) {
        this._piers.getPier().subscribe((response: any[]) => {
            this.piers = response;
        });
    }

    ngOnInit() {
    }

}
