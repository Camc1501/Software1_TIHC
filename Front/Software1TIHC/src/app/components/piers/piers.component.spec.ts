import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PiersComponent } from './piers.component';

describe('PiersComponent', () => {
  let component: PiersComponent;
  let fixture: ComponentFixture<PiersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PiersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PiersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
