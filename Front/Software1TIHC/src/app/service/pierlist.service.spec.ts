import { TestBed, inject } from '@angular/core/testing';

import { PierlistService } from './pierlist.service';

describe('PierlistService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PierlistService]
    });
  });

  it('should be created', inject([PierlistService], (service: PierlistService) => {
    expect(service).toBeTruthy();
  }));
});
