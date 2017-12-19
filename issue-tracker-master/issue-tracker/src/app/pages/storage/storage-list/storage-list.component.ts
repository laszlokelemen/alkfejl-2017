import {Component} from '@angular/core';
import {DataSource} from '@angular/cdk/collections';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import {Storage} from '../../../model/Storage';
import {StorageService} from '../../../services/storage.service';
import { AuthService } from '../../../services/auth.service';

@Component({
  selector: 'app-storage-list',
  templateUrl: './storage-list.component.html',
  styleUrls: ['./storage-list.component.css']
})
export class StorageListComponent {
  displayedColumns: String[] = ['name', 'color', 'size', 'price', 'edit'];
  storage: DataSource<any> = new StorageDataSource(this.storageService);

  constructor(private authService: AuthService, private storageService: StorageService) {
    //this.storage = authService.user;
  }

  delete(id: number) {
    this.storageService.delete(id)
      .subscribe(
        res => console.log(res),
        err => console.log(err)
      );
  }
}
/*
const data: Storage[] = [
  new Storage('fork', 'blue', '12cm', 1200),
  new Storage('spoon', 'green', '10cm', 1500)
];
*/
export class StorageDataSource extends DataSource<any> {
  constructor(private storageService: StorageService) {
    super();
          console.log('StorageDataSource constructor');
  }

  connect(): Observable<Storage[]> {
    var a = this.storageService.getStorage();
    console.log(a);
    return this.storageService.getStorage();
  }

  disconnect() {
  }
}
