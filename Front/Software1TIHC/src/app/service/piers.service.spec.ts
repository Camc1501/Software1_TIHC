import { TestBed, inject } from '@angular/core/testing';

import { PiersService } from './piers.service';

describe('PiersService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PiersService]
    });
  });

  it('should be created', inject([PiersService], (service: PiersService) => {
    expect(service).toBeTruthy();
  }));
});
