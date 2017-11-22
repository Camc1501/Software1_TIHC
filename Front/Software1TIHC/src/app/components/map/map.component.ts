import { Component, OnInit } from '@angular/core';
import { NgModel, FormsModule } from '@angular/forms';
import {
    BrowserModule
} from '@angular/platform-browser';
import { Map2Component } from './map2.component';

@Component({
    selector: 'app-map',
    templateUrl: './map.component.html',
    styleUrls: ['./map.component.css']
})
export class MapComponent {
    // google maps zoom level
    zoom: number = 2;
    maped:Map2Component;
    
    
    markerStartLat: string;
    markerStartLng: string;
    markerDestinationLat: string;
    markerDestinationLng: string;
    markerDay: string;
    markerDays: string;
    percent: number = 0;

    //startPoint y endPoint son el puerto de salida y el puerto de destino
    //los cuales seran datos dados al consumir servicio
         //lat: -24.526072,        lng: -28.068980
          
    startPoint:point ={ 
        lat: -24.526072, 
        lng: -28.068980
        }   
         //lat: 41.903146,        lng: -149.885387 
    endPoint:point ={
        lat: 41.903146,
        lng: -149.885387 
        }    
    // initial center position for the map
    lat: number = this.startPoint.lat;
    lng: number = this.startPoint.lng;     
    travelPoints: point[]=[
        {//coordenadas del puerto de inicio
            lat: this.startPoint.lat,
            lng: this.startPoint.lng
        }
    ];
    travelPointsInverse: point[]=[
        {//coordenadas del puerto de destino
            lat: this.endPoint.lat,
            lng: this.endPoint.lng
        }
    ];
    
    latlng: latlng[];
    southAmerica: latlng[];

    markers: marker[] = [
            {
                name: 'Start',
                lat: this.startPoint.lat,
                lng: this.startPoint.lng,
                draggable: true
            }
        ];
    


    constructor() { 
        this.maped = new Map2Component();
        var linePoints: point[]
        
        //this.travelPoints = this.maped.findRoute(startPoint,endPoint,this.maped.southAmerica);
        var countA;
        var countB;
        this.travelPoints = this.maped.findRoutePoints(
            this.startPoint,this.endPoint,this.maped.allLimitsPoints);
        countA = this.maped.countRepit;
        this.travelPointsInverse= this.maped.findRoutePoints(
            this.endPoint,this.startPoint,this.maped.allLimitsPoints);
        countB = this.maped.countRepit;
        if(countA<countB){
            linePoints = this.travelPoints;
        }
        else{
            linePoints = this.travelPointsInverse;            
        }
        this.latlng=[{
            latitude: linePoints[0].lat,
            longitude: linePoints[0].lng
        }];
        for (var index = 1; index < linePoints.length; index++) {
                this.latlng.push({
                latitude: linePoints[index].lat,
                longitude: linePoints[index].lng
            });  
        }
        //Bordear suramerica
        /*
        this.southAmerica=[{
            latitude: this.maped.southAmericaPoints[0].lat,
            longitude: this.maped.southAmericaPoints[0].lng
        }];

        for (var index = 1; index <  this.maped.southAmericaPoints.length; index++) {
            this.southAmerica.push({
                latitude: this.maped.southAmericaPoints[index].lat,
                longitude: this.maped.southAmericaPoints[index].lng
            });  
        }
        */
        var end = { 
            name: 'End',
            lat: this.endPoint.lat,
            lng: this.endPoint.lng,
            draggable: false
        }
        this.markers.push(end);
        
        var canal = { 
            name: 'Canal de panama',
            lat:  8.755949,
            lng: -81.154918 ,
            draggable: false
        }
        this.markers.push(canal);         

    }

    clickedMarker(label: string, index: number) {
        console.log(`clicked the marker: ${label || index}`)
    }
    addStartMarker() {
        var newMarker = {
            name: 'Start',
            lat: parseFloat(this.markerStartLat),
            lng: parseFloat(this.markerStartLng),
            draggable: false
        }

        this.markers.push(newMarker);
    }
    addDestinationMarker() {
        var newMarker = {
            name: 'End',
            lat: parseFloat(this.markerDestinationLat),
            lng: parseFloat(this.markerDestinationLng),
            draggable: false
        }
        this.markers.push(newMarker);
    }
    addShipMarker() {
        var shipLat = parseFloat(this.markerStartLat) - parseFloat(this.markerDestinationLat);
        shipLat = shipLat * parseFloat(this.markerDay) / parseFloat(this.markerDays);
        shipLat = parseFloat(this.markerStartLat) - shipLat;
        var shipLng = parseFloat(this.markerStartLng) - parseFloat(this.markerDestinationLng);
        shipLng = shipLng * parseFloat(this.markerDay) / parseFloat(this.markerDays);
        shipLng = parseFloat(this.markerStartLng) - shipLng;
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

interface marker {
    name?: string;
    lat: number;
    lng: number;
    draggable: boolean;
}

interface limit{
    latS: number;
    lngS: number;
    latE: number;
    lngE: number;
    x: number;
}
interface point{
    lat: number;
    lng: number;
}
interface latlng{
    latitude: number;
    longitude: number;
}
interface limitPoint{
    lat: number;
    lng: number;
    x: number;
}
