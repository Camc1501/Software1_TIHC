import { MapComponent } from './map/map.component';
import { PrincipalComponent } from './principal/principal.component';
import { RouterModule, Routes } from '@angular/router';
import { StartComponent } from './start/start.component';  

export const appRoutes: Routes = [
    { path: 'start', component:   StartComponent  },
    { path: 'map', component:   MapComponent  }
];