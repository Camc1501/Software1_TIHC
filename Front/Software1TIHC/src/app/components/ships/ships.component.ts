import { Component, OnInit } from '@angular/core';
import { ShipsService } from '../../service/ships.service';
import { Ship } from '../../interface/ship';

@Component({
    selector: 'app-ships',
    templateUrl: './ships.component.html',
    styleUrls: ['./ships.component.css']
})
export class ShipsComponent implements OnInit {
    ships: Ship[] = [];
    constructor(public _ships: ShipsService) {
        this._ships.getShip().subscribe((response: Ship[]) => {
            this.ships = response;
        });
    }

    ngOnInit() {
    }

}
