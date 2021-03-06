import {BrowserModule} from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';

import {AppComponent} from './app.component';
import {LoginComponent} from './pages/login/login.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AuthService} from "./services/auth.service";
import {HttpModule} from "@angular/http";
import { RegisterComponent } from './pages/register/register.component';
import  {appRoutes} from './routes';
import { IssueDetailComponent } from './pages/issues/issue-detail/issue-detail.component';
import { StorageDetailComponent } from './pages/storage/storage-detal/storage-detail.component';
import { IssueListComponent } from './pages/issues/issue-list/issue-list.component';
import { StorageListComponent } from './pages/storage/storage-list/storage-list.component';
import { QuantityListComponent } from "./pages/quantity/quantity-list/quantity-list.component";
import {MaterialItemsModule} from "./MaterialItemsModule";
import { MenuComponent } from './components/menu/menu.component';
import { NewIssueComponent } from './pages/issues/new-issue/new-issue.component';
import { NewStorageComponent } from './pages/storage/new-storage/new-storage.component';
import {NewQuantityComponent} from "./pages/quantity/quantity-new/new-quantity.component";
import { StatsComponent } from './pages/stats/stats.component';
import {IssueService} from "./services/issue.service";
import { HelpComponent } from './pages/help/help.component';
import { ErrorComponent } from './pages/error/error.component';
import { StorageService } from './services/storage.service';
import { QuantityService } from './services/quantity.service';
import {QuantityDetailComponent} from "./pages/quantity/quantity-detail/quantity-detail.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    IssueDetailComponent,
    StorageDetailComponent,
    IssueListComponent,
    StorageListComponent,
    QuantityListComponent,
    MenuComponent,
    NewIssueComponent,
    NewStorageComponent,
    NewQuantityComponent,
    StatsComponent,
    HelpComponent,
    ErrorComponent,
    QuantityDetailComponent,
    NewQuantityComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
    BrowserAnimationsModule,
    MaterialItemsModule
  ],
  providers: [AuthService, IssueService, StorageService, QuantityService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
