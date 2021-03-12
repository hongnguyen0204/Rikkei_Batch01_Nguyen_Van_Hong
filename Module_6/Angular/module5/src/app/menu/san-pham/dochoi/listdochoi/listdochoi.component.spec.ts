import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListdochoiComponent } from './listdochoi.component';

describe('ListdochoiComponent', () => {
  let component: ListdochoiComponent;
  let fixture: ComponentFixture<ListdochoiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListdochoiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListdochoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
