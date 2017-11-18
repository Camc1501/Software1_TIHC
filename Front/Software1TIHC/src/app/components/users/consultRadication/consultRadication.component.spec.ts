import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultRadicationComponent } from './consultRadication.component';

describe('ConsultRadicationComponent', () => {
  let component: ConsultRadicationComponent;
  let fixture: ComponentFixture<ConsultRadicationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsultRadicationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultRadicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
