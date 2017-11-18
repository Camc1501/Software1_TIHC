import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-successfulRadication',
  templateUrl: './successfulRadication.component.html',
  styleUrls: ['./successfulRadication.component.css']
})
export class SuccessfulRadicationComponent implements OnInit {
 
  
  radicationNumber: string = "##############";

  ngOnInit() {
  }
  constructor( private router: Router ) {}

  createRadication(){
    //codigo para crear una radicación
  }
}

