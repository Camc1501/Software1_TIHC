import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-waitingRadication',
  templateUrl: './waitingRadication.component.html',
  styleUrls: ['./waitingRadication.component.css']
})
export class WaitingRadicationComponent implements OnInit {
 
  
  radicationNumber: string = "##############";

  ngOnInit() {
  }

}

