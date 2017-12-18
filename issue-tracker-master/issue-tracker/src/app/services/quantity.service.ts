import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {Routes, Server} from '../utils/ServerRoutes';
import {Observable} from 'rxjs/Observable';
import {Quantity} from '../model/Quantity';
import 'rxjs/add/operator/map';

@Injectable()
export class QuantityService {

  constructor(private http: Http) {
  }

  getQuantity(): Observable<Quantity[]> {
    return this.http.get(Server.routeTo(Routes.STORAGE))
      .map(res => res.json());
  }

  create(quantity: Quantity): Observable<Quantity> {
    return this.http.post(Server.routeTo(Routes.STORAGE), quantity)
      .map(res => res.json());
  }

  delete(id: number) {
    return this.http.delete(Server.routeTo(Routes.STORAGE) + '/' + id)
      .map(res => res.json());
  }

  read(id: number) {
    console.log(id);
    return this.http.get(Server.routeTo(Routes.STORAGE) + '/' + id)
      .map(res => res.json());
  }

  readDepo(id: number) {
    console.log(id);
    return this.http.get(Server.routeTo(Routes.STORAGE) + '/' + id)
      .map(res => res.json());
  }

  update(quantity: Quantity) {
    return this.http.put(Server.routeTo(Routes.STORAGE) + '/' + quantity.id, quantity)
      .map(res => res.json());
  }

  sendMessage(id: number, message: String) {
    return this.http.post(Server.routeTo(Routes.STORAGE + '/' + id + '/message'), {message})
      .map(res => res.json());
  }
}
