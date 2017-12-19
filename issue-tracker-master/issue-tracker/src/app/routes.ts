import {Routes} from '@angular/router';
import {LoginComponent} from "./pages/login/login.component";
import {RegisterComponent} from "./pages/register/register.component";
import {IssueListComponent} from "./pages/issues/issue-list/issue-list.component";
import {StorageListComponent} from "./pages/storage/storage-list/storage-list.component";
import {QuantityListComponent} from "./pages/quantity/quantity-list/quantity-list.component";                                    
import {StorageDetailComponent} from "./pages/storage/storage-detal/storage-detail.component";
import {QuantityDetailComponent} from "./pages/quantity/quantity-detail/quantity-detail.component";
import {IssueDetailComponent} from "./pages/issues/issue-detail/issue-detail.component";
import {NewIssueComponent} from "./pages/issues/new-issue/new-issue.component";
import {NewStorageComponent} from "./pages/storage/new-storage/new-storage.component";
import {NewQuantityComponent} from "./pages/quantity/quantity-new/new-quantity.component";
import {HelpComponent} from "./pages/help/help.component";
import {ErrorComponent} from "./pages/error/error.component";

export const appRoutes: Routes = [
  {path: '', redirectTo: 'help', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'issues', component: IssueListComponent},
  {path: 'storage', component: StorageListComponent},
  {path: 'quantity', component: QuantityListComponent},
  {path: 'quantity/new', component: NewQuantityComponent},
  {path: 'quantity/:id', component: QuantityDetailComponent},
  {path: 'issues/new', component: NewIssueComponent},
  {path: 'storage/new', component: NewStorageComponent},
  {path: 'storage/:id', component: StorageDetailComponent},
  {path: 'issues/:id', component: IssueDetailComponent},
  {path: 'help', component: HelpComponent},
  {path: '**', component: ErrorComponent},
];
