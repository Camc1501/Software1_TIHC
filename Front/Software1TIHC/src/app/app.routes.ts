import { RouterModule, Routes } from '@angular/router';

import { UsersComponent } from './components/users/users.component';
import { ShipsComponent } from './components/ships/ships.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { StartComponent }  from './components/users/start/start.component';
import { ContractComponent }    from './components/users/contract/contract.component';
import { SuccessfulRadicationComponent }    from './components/users/successfulRadication/successfulRadication.component';
import { WaitingRadicationComponent }    from './components/users/waitingRadication/waitingRadication.component';
import { ConsultRadicationComponent }    from './components/users/consultRadication/consultRadication.component';
import { BillComponent }    from './components/users/bill/bill.component';
import { MapComponent }    from './components//map/map.component';

const APP_MODULES: Routes = [
    { path: 'home', component: UsersComponent },
    { path: 'search', component: ShipsComponent },
    { path: 'employee', component: EmployeesComponent },
    { path: 'start', component: StartComponent },
    { path: 'contract', component: ContractComponent },
    { path: 'successfulRadication', component: SuccessfulRadicationComponent },
    { path: 'waitingRadication', component: WaitingRadicationComponent },
    { path: 'consultRadication', component: ConsultRadicationComponent },
    { path: 'bill', component: BillComponent },
    { path: 'map', component: MapComponent },
    { path: '**', pathMatch: 'full', redirectTo: 'home' }
    
];

export const APP_ROUTING = RouterModule.forRoot(APP_MODULES, { useHash: true });