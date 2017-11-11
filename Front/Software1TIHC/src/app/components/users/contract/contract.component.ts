import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contract',
  templateUrl: './contract.component.html',
  styleUrls: ['./contract.component.css']
})
export class ContractComponent implements OnInit {
 


  ngOnInit() {
  }
  constructor( private router: Router ) {}
  newClient(){

    /*
    aca va el cdigo consumiendo el servicio para agregar una nueva carga al sistema
    */
    alert("Necesito saber como consumir servicios ¬¬");

  }
  

}

