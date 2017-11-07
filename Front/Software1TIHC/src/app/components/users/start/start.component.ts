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
    
        /*
        aca va el cdigo consumiendo el servicio para agregar una nueva carga al sistema
        */
        this.router.navigate(['/contract']);
      
      }

      sendToRadication(){
    
        /*
        aca va el cdigo consumiendo el servicio para agregar una nueva carga al sistema
        */
        alert("reenvio al mapa mientras esta este componente esta en construcción");
        this.router.navigate(['/map']);
      
      }

}
