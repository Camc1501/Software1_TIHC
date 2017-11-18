import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-consultRadication',
  templateUrl: './consultRadication.component.html',
  styleUrls: ['./consultRadication.component.css']
})
export class ConsultRadicationComponent implements OnInit {
 
  
  radicationNumber: string = "##############";

  ngOnInit() {
  }
  constructor( private router: Router ) {}
  viewRadication(){        
    this.router.navigate(['/map']);      
  }
  toBill(){        
    this.router.navigate(['/bill']);      
  }
  toWaiting(){        
    this.router.navigate(['/waitingRadication']);      
  }

}

