import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SuccessfulRadicationComponent } from './successfulRadication.component';

describe('SuccessfulRadicationComponent', () => {
  let component: SuccessfulRadicationComponent;
  let fixture: ComponentFixture<SuccessfulRadicationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SuccessfulRadicationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SuccessfulRadicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
