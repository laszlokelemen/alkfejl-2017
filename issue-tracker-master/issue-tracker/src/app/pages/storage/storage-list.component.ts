import {Component, OnInit} from '@angular/core';
import {Storage} from './storage';

@Component({
    selector: 'storage-list',
    templateUrl: 'app/ts/storage-list.component.html',
    inputs: ['product']
})

export class StoragelistComponent {
    onSelect(prod: Storage) {
        console.log(JSON.stringify(prod))
    }
}
