import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QuantityDetailComponent } from './Quantity-detail.component';

describe('QuantityDetailComponent', () => {
  let component: QuantityDetailComponent;
  let fixture: ComponentFixture<QuantityDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QuantityDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QuantityDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
