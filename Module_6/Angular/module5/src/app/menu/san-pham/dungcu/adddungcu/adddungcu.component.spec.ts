import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdddungcuComponent } from './adddungcu.component';

describe('AdddungcuComponent', () => {
  let component: AdddungcuComponent;
  let fixture: ComponentFixture<AdddungcuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdddungcuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdddungcuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
