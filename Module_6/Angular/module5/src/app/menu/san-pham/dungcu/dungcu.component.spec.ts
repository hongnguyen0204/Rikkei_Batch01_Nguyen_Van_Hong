import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DungcuComponent } from './dungcu.component';

describe('DungcuComponent', () => {
  let component: DungcuComponent;
  let fixture: ComponentFixture<DungcuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DungcuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DungcuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
