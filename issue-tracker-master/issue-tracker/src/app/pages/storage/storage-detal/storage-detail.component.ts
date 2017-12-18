import {Component, OnInit} from '@angular/core';
import {Storage} from '../../../model/Storage';
//import {Quantity} from '../../../model/quantity';
//import {Depository} from '../../../model/depository';
import {StorageService} from '../../../services/storage.service';
//import {QuantityService} from '../../../services/quantity.service';
//import {DepositoryService} from '../../../services/depository.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-storage-detail',
  templateUrl: './storage-detail.component.html',
  styleUrls: ['./storage-detail.component.css']
})
export class StorageDetailComponent implements OnInit {
  storage: Storage = new Storage();
 // quantity: Quantity = new Quantity();
  //depository: Depository = new Depository();
  message: String = '';
  id: number;

  constructor(private storageService: StorageService,
             // private quantityService: QuantityService,
             // private depositoryService: DepositoryService,
              private route: ActivatedRoute,
              private router: Router) {
    this.route.params.subscribe(
      params => this.id = params.id,
      err => console.log(err)
    );
  }

  ngOnInit() {
    this.storageService.read(this.id)
      .subscribe(
        storage => this.storage = storage,
        err => console.log(err)
      );
     /* this.quantityService.readDepo(this.id)
      .subscribe(
        quantity => this.quantity = quantity,
        err => console.log(err)
      );
      this.depositoryService.read(this.id)
      .subscribe(
        depository => this.depository = depository,
        err => console.log(err)
      );*/
  }

  updateStatus() {
    this.storageService.update(this.storage)
      .subscribe(
        storage => console.log('ok'),
        err => console.log(err)
      );
  }

  submit() {
    this.storageService.sendMessage(this.storage.id, this.message)
      .subscribe(
        storage => console.log('ok'),
        err => console.log(err)
      );
  }

}
