import {Component} from '@angular/core';
import {DataSource} from '@angular/cdk/collections';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import {Storage} from '../../../model/Storage';
import {StorageService} from '../../../services/storage.service';

@Component({
  selector: 'app-storage-list',
  templateUrl: './storage-list.component.html',
  styleUrls: ['./storage-list.component.css']
})
export class IssueListComponent {
  displayedColumns: String[] = ['name', 'color', 'size', 'price', 'edit'];
  issues: DataSource<any> = new StorageDataSource(this.storageService);

  constructor(private storageService: StorageService) {
  }

  delete(id: number) {
    this.storageService.delete(id)
      .subscribe(
        res => console.log(res),
        err => console.log(err)
      );
  }
}

const data: Storage[] = [
  new Storage(1, 'fork', 'blue', '12cm', 1200),
  new Storage(1, 'spoon', 'green', '10cm', 1500)
];

export class StorageDataSource extends DataSource<any> {
  constructor(private storageService: StorageService) {
    super();
  }

  connect(): Observable<Storage[]> {
    return this.storageService.getIssues();
  }

  disconnect() {
  }
}
