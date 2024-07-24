import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomerTS } from '../../types/Customer';
import { of } from 'rxjs';

@Component({
  selector: 'app-customersample',
  standalone: true,
  imports: [],
  templateUrl: './customersample.component.html',
  styleUrls:[ './customersample.component.css']
})
export class CustomersampleComponent {
customer :any= new CustomerTS("2","ajay","a@g.com","aj","a12","IT")
}

