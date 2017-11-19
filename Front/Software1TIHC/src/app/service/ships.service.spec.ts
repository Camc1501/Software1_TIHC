import { TestBed, inject } from '@angular/core/testing';

import { ShipsService } from './ships.service';

describe('ShipsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ShipsService]
    });
  });

  it('should be created', inject([ShipsService], (service: ShipsService) => {
    expect(service).toBeTruthy();
  }));
});
