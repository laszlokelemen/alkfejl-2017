import { TestBed, inject } from '@angular/core/testing';

import { StorageService } from './storage.service';

describe('IssueService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [StorageService]
    });
  });

  it('should be created', inject([StorageService], (storage: StorageService) => {
    expect(storage).toBeTruthy();
  }));
});
