import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewQuantityComponent } from './new-quantity.component';

describe('NewQuantityComponent', () => {
  let component: NewQuantityComponent;
  let fixture: ComponentFixture<NewQuantityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewQuantityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewQuantityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
