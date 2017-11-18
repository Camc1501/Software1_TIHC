import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WaitingRadicationComponent } from './waitingRadication.component';

describe('WaitingRadicationComponent', () => {
  let component: WaitingRadicationComponent;
  let fixture: ComponentFixture<WaitingRadicationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WaitingRadicationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WaitingRadicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
