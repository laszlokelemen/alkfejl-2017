import {Component, OnInit} from '@angular/core';
import {Storage} from '../../../model/Storage';
import {StorageService} from '../../../services/storage.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-storage-detail',
  templateUrl: './storage-detail.component.html',
  styleUrls: ['./storage-detail.component.css']
})
export class StorageDetailComponent implements OnInit {
  storage: Storage = new Storage();
  message: String = '';
  id: number;

  constructor(private storageService: StorageService,
              private route: ActivatedRoute,
              private router: Router) {
                console.log("work");
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
