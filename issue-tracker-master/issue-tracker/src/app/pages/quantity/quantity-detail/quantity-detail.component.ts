import {Component, OnInit} from '@angular/core';
import {Quantity} from '../../../model/Quantity';
import {QuantityService} from '../../../services/quantity.service';
import {ActivatedRoute, Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-quantity-detail',
  templateUrl: './quantity-detail.component.html',
  styleUrls: ['./quantity-detail.component.css']
})
export class QuantityDetailComponent implements OnInit {
  quantity: Quantity;
  quantityForm: FormGroup = new FormGroup({
    comment: new FormControl('', [Validators.required]),
    quantity: new FormControl('', [Validators.required])
  });
  id: number;

  constructor(private quantityService: QuantityService,
              private route: ActivatedRoute,
              private router: Router) {
    this.route.params.subscribe(
      params => this.id = params.id,
      err => console.log(err)
    );    
    this.router = router;

    this.quantityService.read(this.id)
      .subscribe(
        (quantity) => {
          this.quantity = quantity;
          err => console.log(err);
          this.quantityForm = new FormGroup({
            comment: new FormControl(quantity.comment, [Validators.required]),
            quantity: new FormControl(quantity.quantity, [Validators.required]),

          });
        }
    );
  }

  ngOnInit() {
    
  }
  submit() {
    var send = new Quantity(this.quantityField.value, this.comment.value, null, null);
    send.id = this.id;
    this.quantityService.update(send)
      .subscribe(
        (quantity) => {
          //console.log('ok');
          err => console.log(err);
          this.router.navigateByUrl('/quantity');
        }
      );
  }
  get comment() {
    return this.quantityForm.get('comment')
  }

  get quantityField() {
    return this.quantityForm.get('quantity')
  }

}