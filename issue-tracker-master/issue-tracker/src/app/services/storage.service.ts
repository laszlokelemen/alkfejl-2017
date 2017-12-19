import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {Routes, Server} from '../utils/ServerRoutes';
import {Observable} from 'rxjs/Observable';
import {Storage} from '../model/Storage';
import 'rxjs/add/operator/map';

@Injectable()
export class StorageService {

  constructor(private http: Http) {
  }

  getStorage(): Observable<Storage[]> {
    //console.log('all storage');
    return this.http.get(Server.routeTo(Routes.STORAGE))
      .map(res => res.json());
  }

  create(storage: Storage): Observable<Storage> {
    return this.http.post(Server.routeTo(Routes.STORAGE), storage)
      .map(res => res.json());
  }

  delete(id: number) {
    return this.http.delete(Server.routeTo(Routes.STORAGE) + '/' + id)
      .map(res => res.json());
  }

  read(id: number) {
    return this.http.get(Server.routeTo(Routes.STORAGE) + '/' + id)
      .map(res => res.json());
  }

  update(storage: Storage) {
    return this.http.put(Server.routeTo(Routes.STORAGE) + '/' + storage.id, storage)
      .map(res => res.json());
  }

  sendMessage(id: number, message: String) {
    return this.http.post(Server.routeTo(Routes.STORAGE + '/' + id + '/message'), {message})
      .map(res => res.json());
  }
}
