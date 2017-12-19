import {Component} from '@angular/core';
import {DataSource} from '@angular/cdk/collections';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import {Quantity} from '../../../model/Quantity';
import {QuantityService} from '../../../services/quantity.service';
import { AuthService } from '../../../services/auth.service';

@Component({
  selector: 'app-quantity-list',
  templateUrl: './quantity-list.component.html',
  styleUrls: ['./quantity-list.component.css']
})
export class QuantityListComponent {
  displayedColumns: String[] = ['comment', 'quantity', 'depo id', 'product id', 'edit'];
  quantity: DataSource<any> = new QuantityDataSource(this.quantityService);

  constructor(private authService: AuthService, private quantityService: QuantityService) {
    //this.quantity = authService.user;
    console.log('quantity-list-components constuctor');
  }

  delete(id: number) {
    this.quantityService.delete(id)
      .subscribe(
        res => console.log(res),
        err => console.log(err)
      );
  }
}

export class QuantityDataSource extends DataSource<any> {
  constructor(private quantityService: QuantityService) {
    super();
        console.log('qunatity data sourse constructor');
  }

  connect(): Observable<Quantity[]> {
    console.log('quantity connect');
    return this.quantityService.getQuantity();
  }

  disconnect() {
  }
}
