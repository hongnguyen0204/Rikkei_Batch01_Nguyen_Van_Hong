import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdddonhangComponent } from './adddonhang.component';

describe('AdddonhangComponent', () => {
  let component: AdddonhangComponent;
  let fixture: ComponentFixture<AdddonhangComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdddonhangComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdddonhangComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
