import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { TopNavBarComponent } from './top-nav-bar/top-nav-bar.component';
import { RouterModule, Routes } from '@angular/router';
import { MapComponent } from './map/map.component';
import { PrincipalComponent } from './principal/principal.component';
import { appRoutes } from './app.routing';

import { AgmCoreModule } from '@agm/core';
import { StartComponent } from './start/start.component';  

@NgModule({
  declarations: [
    AppComponent,
    TopNavBarComponent,
    MapComponent,
    PrincipalComponent,
    StartComponent    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyDttd0yGAqFdRPHmEkA-7mf1y3fZq3uZmM'
    }),    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
