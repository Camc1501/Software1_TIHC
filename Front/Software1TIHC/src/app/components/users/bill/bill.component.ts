import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bill',
  templateUrl: './bill.component.html',
  styleUrls: ['./bill.component.css']
})
export class BillComponent implements OnInit {
 
  client: String ="Ejemplo";
  origin: String ="Puerto de Origen Ejemplo";
  destination: String ="Puerto de Destino Ejemplo";
  estimatedTime: String ="Ejemplo";
  state: String ="Ejemplo";
  loadType: String ="Ejemplo";
  loadweight: String ="Ejemplo";
  email: String ="Ejemplo";
  price: String ="$200.000";
  
  

  ngOnInit() {
  }
  payBill(){
    //codigo....
    alert("El pago de su factura fue un éxito");
  }

}

