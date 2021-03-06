import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Storage} from "../../../model/Storage";
import {StorageService} from "../../../services/storage.service";
import {ActivatedRoute, Router} from '@angular/router';

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

  constructor(private storageService: StorageService,
              private route: ActivatedRoute,
              private router: Router) {

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
    // console.log(this.name.value, this.color.value, this.size.value, this.price.value);
    this.storageService.create(new Storage(this.name.value, this.color.value, this.size.value, this.price.value))
      .subscribe(
        (res) => {
          res => res;
          err => console.log(err);
          this.router.navigateByUrl('/storage');
        }
      );
  }
}
