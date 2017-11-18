import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.css'],
  
})
export class StartComponent implements OnInit {
  imgUrl='assets/images/logo.png';
  constructor( private router: Router ) {}

  ngOnInit() {
    
  }
      sendToContract(){
            this.router.navigate(['/contract']);
          
          }

      sendToRadication(){        
        this.router.navigate(['/consultRadication']);      
      }

}
