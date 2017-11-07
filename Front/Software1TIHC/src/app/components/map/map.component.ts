import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import {
  BrowserModule
} from '@angular/platform-browser';


@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent {
  // google maps zoom level
  zoom: number = 8;
    
  // initial center position for the map
  lat: number = 51.673858;
  lng: number = 7.815982;
  markerStartLat: string;
  markerStartLng: string;
  markerDestinationLat: string;
  markerDestinationLng: string;
  markerDay: string;
  markerDays: string;
  percent: number = 0;
  markers: marker[]=[
	  {
      name: 'Prueba',
		  lat: 51.673858,
		  lng: 7.815982,
		  draggable: true
	  }
  ];
  clickedMarker(label: string, index: number) {
    console.log(`clicked the marker: ${label || index}`)
  }
  addStartMarker(){
    var newMarker = {
      name: 'Stard',
      lat: parseFloat(this.markerStartLat),
      lng: parseFloat(this.markerStartLng),
      draggable: false
    }

    this.markers.push(newMarker);
  }
  addDestinationMarker(){
    var newMarker = {
      name: 'End',
      lat: parseFloat(this.markerDestinationLat),
      lng: parseFloat(this.markerDestinationLng),
      draggable: false
    }
    this.markers.push(newMarker);
  }

  addShipMarker(){
    var shipLat = parseFloat(this.markerStartLat) - parseFloat(this.markerDestinationLat);
    shipLat = shipLat * parseFloat(this.markerDay)/ parseFloat(this.markerDays);
    shipLat = parseFloat(this.markerStartLat)- shipLat;
    var shipLng = parseFloat(this.markerStartLng) - parseFloat(this.markerDestinationLng);
    shipLng = shipLng * parseFloat(this.markerDay)/ parseFloat(this.markerDays);
    shipLng = parseFloat(this.markerStartLng)-shipLng;
    this.percent = parseFloat(this.markerDay) * 100 / parseFloat(this.markerDays);
    var newMarker = {
      name: 'Ship',
      lat: shipLat,
      lng: shipLng,
      draggable: false
    }
    this.markers.push(newMarker);
  }
}

interface marker
    {
      name?:string;
      lat:number;
      lng:number;
      draggable:boolean;
    }
