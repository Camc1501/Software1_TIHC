import { RouterModule, Routes } from '@angular/router';

import { UsersComponent } from './components/users/users.component';
import { ShipsComponent } from './components/ships/ships.component';
import { EmployeesComponent } from './components/employees/employees.component';
//import { ViewRecipeComponent } from './componentes/view-recipe/view-recipe.component';
import { StartComponent } from './components/users/start/start.component';
import { ContractComponent } from './components/users/contract/contract.component';
import { MapComponent } from './components//map/map.component';

const APP_MODULES: Routes = [
    { path: 'home', component: UsersComponent },
    { path: 'search', component: ShipsComponent },
    { path: 'employee', component: EmployeesComponent },
    //    { path: 'view/:id', component: ViewRecipeComponent },
    { path: '**', pathMatch: 'full', redirectTo: 'home' },
    { path: 'start', component: StartComponent },
    { path: 'contract', component: ContractComponent },
    { path: 'map', component: MapComponent },
    { path: '**', pathMatch: 'full', redirectTo: 'home' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_MODULES, { useHash: true });
