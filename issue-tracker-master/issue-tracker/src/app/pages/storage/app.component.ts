import {Component} from '@angular/core';
import {Config} from './config.service';
import {Storage} from './storage';
import {StoragelistComponent} from './storage-list.component';


@Component({
    // tslint:disable-next-line:component-selector
    selector: 'my-app2',
    templateUrl: 'app/ts/app.component.html',
    directives: [StoragelistComponent]
})

export class AppComponent {
    mainHeading = Config.MAIN_HEADING;
    product: Array<Storage>;

    constructor() {
        this.product = [
            new Storage(1,"fork","green","12cm",800),
            new Storage(2,"spoon","green","8cm",600)

        ]
    }
}