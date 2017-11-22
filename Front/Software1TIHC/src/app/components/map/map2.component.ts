import { Component, OnInit } from '@angular/core';
import { NgModel, FormsModule } from '@angular/forms';
import {
    BrowserModule
} from '@angular/platform-browser';


export class Map2Component {
    
    southAmericaPoints: limitPoint [];
    northAmericaPoints: limitPoint [];
    oldContinentPoints: limitPoint [];
    oceaniaPoints:  limitPoint[];
    allLimitsPoints:  limitPoint[];  
    countRepit:number;    
    southAmerica: limit[]=[      
        {    
            latS: -56.677650,
            lngS: -71.430668,
            latE:  -17.848571,
            lngE: -73.364261,
            x: 1
        },
        {    
            latS:  -17.848571,
            lngS: -73.364261,
            latE: -2.674734,
            lngE: -82.680668,
            x: 1
        },
        {    
            latS: -2.674734,
            lngS: -82.680668,
            latE: 2.991878,
            lngE: -78.945316,
            x: 1
        },
        {    
            latS: 2.991878,
            lngS: -78.945316,
            latE: 8.759695,
            lngE: -77.714847,
            x: 1
        },
        {    
            latS: 8.759695,
            lngS: -77.714847,
            latE: 13.030796,
            lngE: -71.650394,
            x: 1
        },
        {   
            latS: 13.030796,
            lngS: -71.650394,
            latE: 11.032338,
            lngE: -65.717777,
            x: 0
        },
        {   
            latS: 11.032338,
            lngS: -65.717777,
            latE:  10.535894,
            lngE: -62.268070,
            x: 0
        },
        {    
            latS: 10.535894,
            lngS: -62.268070,
            latE: 6.473077,
            lngE: -57.258304,
            x: 0
        },
        {   
            latS: 6.473077,
            lngS: -57.258304,
            latE: 3.803431,
            lngE: -50.776371,
            x: 0
        },
        {    
            latS: 3.803431,
            lngS: -50.776371,
            latE: -0.060960,
            lngE: -47.963871,
            x: 0
        },
        {    
            latS: -0.060960,
            lngS:-47.963871,
            latE: -5.851542,
            lngE: -34.208988,
            x: 0
        },
        {    
            latS: -5.851542,
            lngS: -34.208988,
            latE: -13.641169,
            lngE: -38.427738,
            x: 0
        },
        {    
            latS: -13.641169,
            lngS: -38.427738,
            latE: -22.933594,
            lngE: -41.459965,
            x: 0
        },
        {    
            latS: -22.933594,
            lngS: -41.459965,
            latE: -25.379256,
            lngE: -47.172855,
            x: 0
        },
        {   
            latS: -25.379256,
            lngS: -47.172855,
            latE: -56.677650,
            lngE: -71.430668,
            x: 0
        },
        {   
            latS: -56.677650,
            lngS: -71.430668,
            latE: -25.379256,
            lngE: -47.172855,
            x: 0
        }     
        
    ];
    northAmerica: limit[]=[   
        {     
            latS: 75.492224,
            lngS: -110.930825,
            latE: 70.488997,
            lngE: -168.411294,
            x: 1
        },
        {    
            latS: 70.488997,
            lngS: -168.411294,
            latE: 58.345296,
            lngE: -163.313637,
            x: 1
        },
        {    
            latS: 58.345296,
            lngS: -163.313637,
            latE: 53.213976,
            lngE: -133.255043,
            x: 1
        },
        {    
            latS: 53.213976,
            lngS: -133.255043,
            latE: 23.867829,
            lngE: -113.215981,
            x: 1
        },
        {    
            latS: 23.867829,
            lngS: -113.215981,
            latE: 8.474626,
            lngE: -83.245277,   
            x: 1
        },
        {   
            latS: 8.474626,
            lngS: -83.245277,
            latE:  29.899781,
            lngE: -80.344887,
            x: 0
        },
        {    
            latS: 29.899781,
            lngS: -80.344887,
            latE: 32.604281,
            lngE: -79.202309,
            x: 0
        },
        {    
            latS: 32.604281,
            lngS: -79.202309,
            latE: 50.388961,
            lngE: -50.901527,
            x: 0
        },
        {   
            latS: 50.388961,
            lngS: -50.901527,
            latE: 75.492224,
            lngE: -110.930825,
            x: 0
        },
        {   
            latS: 75.492224,
            lngS: -110.930825,
            latE: -50.901527,
            lngE: 50.388961,
            x: 0
        }
        
    ];
    oldContinent: limit[]=[
        {     
            latS: 81.001454,
            lngS: 94.098989,
            latE: 71.053838,
            lngE: 20.798207,
            x: 1
        },
        {   
            latS: 71.053838,
            lngS: 20.798207,
            latE: 61.909627,
            lngE: 4.802114,
            x: 1
        },
        {    
            latS: 61.909627,
            lngS: 4.802114,
            latE: 51.905841,
            lngE: 3.571645,
            x: 1
        },
        {   
            latS: 51.905841,
            lngS: 3.571645,
            latE: 48.065811,
            lngE: -3.283824,
            x: 1
        },
        {   
            latS: 48.065811,
            lngS: -3.283824,
            latE: 43.215816,
            lngE: -9.611949,
            x: 1
        },
        {    
            latS: 43.215816,
            lngS: -9.611949,
            latE: 37.180704,
            lngE: -9.963511,
            x: 1
        },
        {    
            latS: 37.180704,
            lngS: -9.963511,
            latE: 38.568172,
            lngE: 0.056020,
            x: 0
        },
        {    
            latS: 38.568172,
            lngS: 0.056020,
            latE: 43.662537,
            lngE: 8.054067,
            x: 0
        },
        {    
            latS: 43.662537,
            lngS: 8.054067,
            latE: 33.599328,
            lngE: 32.487661,
            x: 1
        },
        {   
            latS: 33.599328,
            lngS: 32.487661,
            latE:  33.818668,
            lngE: 12.184926,
            x: 0
        },
        {    
            latS: 33.818668,
            lngS: 12.184926,
            latE: 37.320625,
            lngE: 8.229848,
            x: 0
        },
        {    
            latS: 37.320625,
            lngS: 8.229848,
            latE: 31.899281,
            lngE: -9.963511,
            x: 1
        },
        {    
            latS: 31.899281,
            lngS: -9.963511,
            latE: 22.556483,
            lngE: -17.324351,
            x: 1
        },
        {    
            latS: 22.556483,
            lngS: -17.324351,
            latE: 10.793689,
            lngE: -16.533335,
            x: 1
        },
        {    
            latS: 10.793689,
            lngS: -16.533335,
            latE: 3.473163,
            lngE: -9.502085,
            x: 1
        },
        {    
            latS: 3.473163,
            lngS: -9.502085,
            latE: 0.487004,
            lngE: 7.548696,
            x: 1
        },
        {   
            latS: 0.487004,
            lngS: 7.548696,
            latE: -35.278552,
            lngE:  18.359243,
            x: 1
        },
        {    
            latS: -35.278552,
            lngS: 18.359243,
            latE: -33.024059,
            lngE: 28.818227,
            x: 0
        },
        {   
            latS: -33.024059,
            lngS: 28.818227,
            latE: -12.593929,
            lngE:  42.001821,
            x: 0
        },
        {    
            latS: -12.593929,
            lngS: 42.001821,
            latE: -3.378218,
            lngE: 40.595571,
            x: 0
        },
        {    
            latS: -3.378218,
            lngS: 40.595571,
            latE: 10.620968,
            lngE: 53.076040,
            x: 0
        },
        {    
            latS: 10.620968,
            lngS: 53.076040,
            latE: 14.395616,
            lngE: 50.263540,
            x: 0
        },
        {   
            latS: 14.395616,
            lngS: 50.263540,
            latE:  25.208209,
            lngE: 65.468618,
            x: 0
        },
        {    
            latS: 25.208209,
            lngS: 65.468618,
            latE: 5.488363,
            lngE: 78.124868,
            x: 1
        },
        {    
            latS: 5.488363,
            lngS: 78.124868,
            latE: 20.018039,
            lngE: 89.550649,
            x: 0
        },
        {    
            latS: 20.018039,
            lngS: 89.550649,
            latE: -5.656124,
            lngE: 104.316274,
            x: 1
        },
        {    
            latS: -5.656124,
            lngS: 104.316274,
            latE: 19.935436,
            lngE: 111.347524,
            x: 0
        },
        {    
            latS: 19.935436,
            lngS: 111.347524,
            latE: 28.655200,
            lngE: 122.949086,
            x: 0
        },
        {   
            latS: 28.655200,
            lngS: 122.949086,
            latE:  48.120472,
            lngE: 140.449824,
            x: 0
        },
        {    
            latS: 48.120472,
            lngS: 140.449824,
            latE: 50.525846,
            lngE: 158.731074,
            x: 0
        },
        {   
            latS: 50.525846,
            lngS: 158.731074,
            latE: 67.6166599, 
            lngE: 183.6920121,
            x: 0
        },
        {   
            latS: 67.6166599, 
            lngS: 183.6920121,
            latE: 81.001454,
            lngE: 94.098989,
            x: 0
        },
        {   
            latS: 81.001454,
            lngS: 94.098989,
            latE: 67.6166599,
            lngE: 183.6920121,
            x: 0
        }
    ];
    oceania: limit[]=[
        {     
            latS: -32.397184,
            lngS: 131.838455,
            latE: -35.602437,
            lngE: 116.721267,
            x: 0
        },
        {   
            latS: -35.602437,
            lngS: 116.721267,
            latE: -22.104538,
            lngE:  112.326736,
            x: 1
        },
        {    
            latS: -22.104538,
            lngS: 112.326736,
            latE: -10.486262,
            lngE: 132.014236,
            x: 1
        },
        {    
            latS: -10.486262,
            lngS: 132.014236,
            latE: -23.401318,
            lngE: 153.635330,
            x: 0
        },
        {    
            latS: -23.401318,
            lngS: 153.635330,
            latE: -43.960055,
            lngE: 146.779861,
            x: 0
        },
        {   
            latS: -43.960055,
            lngS: 146.779861,
            latE: -32.397184,
            lngE: 131.838455,
            x: 1
        },
        {   
            latS: -32.397184,
            lngS: 131.838455,
            latE: -43.960055,
            lngE: 146.779861,
            x: 1
        }
    ];
    indexFinal:number;
    isEnd:boolean = false;
    percent:number;
  ngOnInit() {
  }
  constructor() {      
    this.southAmericaPoints = this.findPointsLimits(this.southAmerica);
    this.northAmericaPoints = this.findPointsLimits(this.northAmerica);
    this.oceaniaPoints = this.findPointsLimits(this.oceania);
    this.oldContinentPoints = this.findPointsLimits(this.oldContinent);
    this.allLimitsPoints =   this.southAmericaPoints;

    for (var index = 0; index < this.northAmericaPoints.length; index++) {
        this.allLimitsPoints.push(this.northAmericaPoints[index]);        
    }
    for (var index = 0; index < this.oceaniaPoints.length; index++) {
        this.allLimitsPoints.push(this.oceaniaPoints[index]);        
    }
    for (var index = 0; index < this.oldContinentPoints.length; index++) {
        this.allLimitsPoints.push(this.oldContinentPoints[index]);        
    }


  }
    findPointsLimits(limits:limit[]) {
        var pointsTo:limitPoint [];
        for (var index = 0; index < limits.length; index++) {
            var distance = this.distancePoints(limits[index].latS,limits[index].lngS,limits[index].latE,limits[index].lngE);
            distance =  Math.round(distance)*50;
            for (var index2 = 0; index2 < distance; index2++) {
                var pointLat = limits[index].latS - limits[index].latE;
                pointLat = pointLat * index2/ distance;
                pointLat = limits[index].latS - pointLat;
                var pointLng = limits[index].lngS - limits[index].lngE;
                pointLng = pointLng * index2/ distance;
                pointLng = limits[index].lngS - pointLng;
                if(index==0 && index2==0 ){
                    pointsTo= [
                        {
                            lat: pointLat,
                            lng:pointLng,
                            x:limits[index].x
                        }
                    ];
                }
                else{
                    pointsTo.push({
                        lat: pointLat,
                        lng: pointLng,
                        x:limits[index].x
                    }); 
                }
                
            }
        }
        return pointsTo;
    }
    findRoutePoints(startPoint:point,endPoint:point, limits: limitPoint []){
        var pointsTo:point [] = [
            {
                lat: startPoint.lat,
                lng: startPoint.lng
            }
        ];
        var distance = this.distancePoints(startPoint.lat,startPoint.lng,endPoint.lat,endPoint.lng);
        distance = Math.round(distance)*50;
        var pointLat;
        var pointLng;
        var colstill:boolean=false;
        var end:boolean=false;
        var oldPoint:point={
            lat: startPoint.lat,
            lng: startPoint.lng
        };
        var lastColision:point;
        this.countRepit=0;
        var y;
        for (var index = 0; index < distance; index++) {
        
            pointLat = oldPoint.lat - endPoint.lat;
            pointLat = pointLat * index/ distance;
            pointLat = oldPoint.lat - pointLat;
            pointLng = oldPoint.lng - endPoint.lng;
            pointLng = pointLng * index/ distance;
            pointLng = oldPoint.lng - pointLng;
            
            var indexDistance=this.checkLimit(pointLat, pointLng, limits,1);
            if(indexDistance>=0){
                this.countRepit++;
                    pointLat = limits[indexDistance].lat;
                    if(limits[indexDistance].x==1){
                        pointLng =limits[indexDistance].lng-1;
                    }
                    else{
                        pointLng =limits[indexDistance].lng+1;                   
                    }                         
            }            
            
            oldPoint={
                lat: pointLat,
                lng: pointLng
            };
            

            pointsTo.push({
                lat: pointLat,
                lng: pointLng
            });  
            if(pointLat == endPoint.lat && pointLng == endPoint.lng && !this.isEnd){
                this.indexFinal = index;
                this.isEnd = true;
                console.log(this.indexFinal);
                return pointsTo;
            }           
        }

        return pointsTo;
    }

    checkLimit(pointLat, pointLng, limits: point [],minDistance){        
        for(var i = 0; i < limits.length; i++) {
            var distance = this.distancePoints(pointLat,pointLng,limits[i].lat,limits[i].lng);
            if(distance<minDistance){
                return i;
            }
        }
        return -1;
    }
    distancePoints(lat1:number,long1:number,lat2:number,long2:number){
        var distance = Math.sqrt(
            (Math.pow(long2 - long1,2 )+
            Math.pow(lat2 - lat1,2 ))
        );  
        return distance;
    }
    findDayPoint(day:string, days:string, routePoints:point[],markerStartLat,markerStartLng,markerDestinationLat,markerDestinationLng){
        var shipLat = parseFloat(markerStartLat) - parseFloat(markerDestinationLat);
        shipLat = shipLat * parseFloat(day) / parseFloat(days);
        shipLat = parseFloat(markerStartLat) - shipLat;
        var shipLng = parseFloat(markerStartLng) - parseFloat(markerDestinationLng);
        shipLng = shipLng * parseFloat(day) / parseFloat(days);
        shipLng = parseFloat(markerStartLng) - shipLng;
        this.percent = parseFloat(day) * 100 / parseFloat(days);
        var minDistance = 300;
        var indexDay;
        for (var index = 0; index < routePoints.length; index++) {
            var distance = this.distancePoints(
                routePoints[index].lat,routePoints[index].lng,shipLat,shipLng);
            if(distance<minDistance){
                minDistance = distance;
                indexDay = index;
            }            
        }
        return indexDay;
    }

}
interface limit{
    latS: number;
    lngS: number;
    latE: number;
    lngE: number;
    x: number;
}
interface limitPoint{
    lat: number;
    lng: number;
    x: number;
}
interface point{
    lat: number;
    lng: number;
}