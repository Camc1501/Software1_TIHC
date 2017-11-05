import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UsersComponent } from './components/users/users.component';
import { ShipsComponent } from './components/ships/ships.component';

import { APP_ROUTING } from './app.routes';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { EmployeesComponent } from './components/employees/employees.component';

@NgModule({
    declarations: [
        AppComponent,
        UsersComponent,
        ShipsComponent,
        NavbarComponent,
        EmployeesComponent
    ],
    imports: [
        BrowserModule,
        APP_ROUTING
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
