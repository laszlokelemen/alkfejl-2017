import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Storage} from "../../../model/Storage";
import {StorageService} from "../../../services/storage.service";

@Component({
  selector: 'app-new-storage',
  templateUrl: './new-storage.component.html',
  styleUrls: ['./new-storage.component.css']
})
export class NewStorageComponent implements OnInit {
  storageForm: FormGroup = new FormGroup({
    name: new FormControl('', [Validators.required]),
    color: new FormControl('', [Validators.required]),
    size: new FormControl('', [Validators.required]),
    price: new FormControl('', [Validators.required])
  });

  constructor(private storageService: StorageService) {

  }

  ngOnInit() {
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

  submit() {
    this.storageService.create(new Storage(this.name.value, this.color.value, this.size.value, this.price.value))
      .subscribe(
        res => res,
        err => console.log(err)
      )
  }
}
