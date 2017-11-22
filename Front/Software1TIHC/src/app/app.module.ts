import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AgmCoreModule } from '@agm/core';

import { AppComponent } from './app.component';
import { UsersComponent } from './components/users/users.component';
import { ShipsComponent } from './components/ships/ships.component';
import { StartComponent } from './components/users/start/start.component';
import { ContractComponent } from './components/users/contract/contract.component';
import { SuccessfulRadicationComponent } from './components/users/successfulRadication/successfulRadication.component';
import { WaitingRadicationComponent } from './components/users/waitingRadication/waitingRadication.component';
import { ConsultRadicationComponent } from './components/users/consultRadication/consultRadication.component';
import { BillComponent } from './components/users/bill/bill.component';
import { MapComponent } from './components//map/map.component';
import { APP_ROUTING } from './app.routes';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { FooterComponent } from './components/shared/footer/footer.component';
import { PiersComponent } from './components/piers/piers.component';

import { ShipsService } from './service/ships.service';
import { PiersService } from './service/piers.service';
import { EmployeeService } from './service/employee.service';

@NgModule({
    declarations: [
        AppComponent,
        BillComponent,
        UsersComponent,
        ShipsComponent,
        NavbarComponent,
        StartComponent,
        ContractComponent,
        SuccessfulRadicationComponent,
        WaitingRadicationComponent,
        ConsultRadicationComponent,
        MapComponent,
        ShipsComponent,
        EmployeesComponent,
        FooterComponent,
        EmployeesComponent,
        PiersComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        FormsModule,
        AgmCoreModule.forRoot({
            apiKey: 'AIzaSyBCvj2TnWGp8CoE3N0N6pkSbk0f_Fo4x3Q'
        }),
        APP_ROUTING
    ],
    providers: [
        ShipsService,
        EmployeeService,
        PiersService
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
