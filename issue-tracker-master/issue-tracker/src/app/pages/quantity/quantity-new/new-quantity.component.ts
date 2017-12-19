import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Quantity} from "../../../model/Quantity";
import {QuantityService} from "../../../services/quantity.service";
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-new-quantity',
  templateUrl: './new-quantity.component.html',
  styleUrls: ['./new-quantity.component.css']
})
export class NewQuantityComponent implements OnInit {
  quantityForm: FormGroup = new FormGroup({
    comment: new FormControl('', [Validators.required]),
    quantity: new FormControl('', [Validators.required])
  });

  constructor(private quantityService: QuantityService,
              private route: ActivatedRoute,
              private router: Router) {
  }

  ngOnInit() {
  }

  get comment() {
    return this.quantityForm.get('comment')
  }

  get quantity() {
    return this.quantityForm.get('quantity')
  }

  submit() {
    this.quantityService.create(new Quantity(this.quantity.value, this.comment.value, 1, 1))
      .subscribe(
        (res) => {
          res => res;
          err => console.log(err);
          this.router.navigateByUrl('/quantity');
        }
      );
  }
}
