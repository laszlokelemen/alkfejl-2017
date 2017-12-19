import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QuantityListComponent } from './quantity-list.component';

describe('QuantityListComponent', () => {
  let component: QuantityListComponent;
  let fixture: ComponentFixture<QuantityListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QuantityListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QuantityListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
