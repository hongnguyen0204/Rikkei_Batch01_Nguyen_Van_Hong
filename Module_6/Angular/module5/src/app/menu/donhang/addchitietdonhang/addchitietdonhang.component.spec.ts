import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddchitietdonhangComponent } from './addchitietdonhang.component';

describe('AddchitietdonhangComponent', () => {
  let component: AddchitietdonhangComponent;
  let fixture: ComponentFixture<AddchitietdonhangComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddchitietdonhangComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddchitietdonhangComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
