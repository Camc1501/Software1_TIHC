import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
<<<<<<< HEAD
=======
import { FormsModule } from '@angular/forms';
>>>>>>> Dairo

import { AppComponent } from './app.component';
import { UsersComponent } from './components/users/users.component';
import { ShipsComponent } from './components/ships/ships.component';

<<<<<<< HEAD
import { APP_ROUTING } from './app.routes';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { EmployeesComponent } from './components/employees/employees.component';
=======
import { StartComponent }  from './components/users/start/start.component';
import { ContractComponent }    from './components/users/contract/contract.component';
import { MapComponent }    from './components//map/map.component';

import { APP_ROUTING } from './app.routes';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { FooterComponent } from './components/shared/footer/footer.component';

import { AgmCoreModule } from '@agm/core';

>>>>>>> Dairo

@NgModule({
    declarations: [
        AppComponent,
        UsersComponent,
<<<<<<< HEAD
        ShipsComponent,
        NavbarComponent,
        EmployeesComponent
    ],
    imports: [
        BrowserModule,
        APP_ROUTING
=======
        StartComponent,
        ContractComponent,
        MapComponent,
        ShipsComponent,
        NavbarComponent,
        EmployeesComponent,
        FooterComponent,
        
    ],
    imports: [
        BrowserModule,
        APP_ROUTING,
        FormsModule,
        AgmCoreModule.forRoot({
            apiKey: 'AIzaSyBCvj2TnWGp8CoE3N0N6pkSbk0f_Fo4x3Q'
          })
>>>>>>> Dairo
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
