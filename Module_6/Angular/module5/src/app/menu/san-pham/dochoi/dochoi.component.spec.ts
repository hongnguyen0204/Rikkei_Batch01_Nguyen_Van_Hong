import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DochoiComponent } from './dochoi.component';

describe('DochoiComponent', () => {
  let component: DochoiComponent;
  let fixture: ComponentFixture<DochoiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DochoiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DochoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
