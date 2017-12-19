import {Component, OnInit} from '@angular/core';
import {Storage} from '../../../model/Storage';
import {StorageService} from '../../../services/storage.service';
import {ActivatedRoute, Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-storage-detail',
  templateUrl: './storage-detail.component.html',
  styleUrls: ['./storage-detail.component.css']
})
export class StorageDetailComponent implements OnInit {
  storage: Storage = new Storage();
    storageForm: FormGroup = new FormGroup({
    name: new FormControl('', [Validators.required]),
    color: new FormControl('', [Validators.required]),
    size: new FormControl('', [Validators.required]),
    price: new FormControl('', [Validators.required])
  });
  id: number;

  constructor(private storageService: StorageService,
              private route: ActivatedRoute,
              private router: Router) {
    this.route.params.subscribe(
      params => this.id = params.id,
      err => console.log(err)
    );    
    this.router = router;

    this.storageService.read(this.id)
      .subscribe(
        (storage) => {
          this.storage = storage;
          err => console.log(err);
          this.storageForm = new FormGroup({
            name: new FormControl(storage.name, [Validators.required]),
            color: new FormControl(storage.color, [Validators.required]),
            size: new FormControl(storage.size, [Validators.required]),
            price: new FormControl(storage.price, [Validators.required])
          });
        }
    );
  }

  ngOnInit() {
    
  }
  submit() {
    var send = new Storage(this.name.value, this.color.value, this.size.value, this.price.value);
    send.id = this.id;
    this.storageService.update(send)
      .subscribe(
        (storage) => {
          console.log('ok');
          err => console.log(err);
          this.router.navigateByUrl('/storage');
        }
      );
  }

  get name() {
    return this.storageForm.get('name')
  }

  get color() {
    return this.storageForm.get('color')
  }
  get size() {
    return this.storageForm.get('size')
  }
  get price() {
    return this.storageForm.get('price')
  }

}