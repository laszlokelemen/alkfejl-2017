import {Component, OnInit} from '@angular/core';
import {Role} from "../../model/User";
import {AuthService} from "../../services/auth.service";

interface MenuItem {
  link: String;
  title: String;
}

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  private common: MenuItem[] = [
    {link: '/stats', title: 'Statistics'},
   // {link: '/issues', title: 'Issues'},
    {link: '/help', title: 'Help'},
    {link: '/storage', title: 'Storage'},
    {link: '/quantity', title: 'Quantity'}
  ];

  private roleMenus = new Map<Role, MenuItem[]>([
    [Role.GUEST, [...this.common]],
    [Role.USER, [...this.common, {link: '/storage', title: 'Storage'}]],
    [Role.ADMIN, [{link: '/stats', title: 'Statistics'}, {link: '/storage', title: 'Storage'}, {link: '/quantity', title: 'Quantity'}]]
  ]);

  menus: MenuItem[];

  constructor(private authService: AuthService) {
  }

  ngOnInit() {
    if (this.authService.isLoggedIn) {
      this.menus = this.roleMenus.get(this.authService.user.role);
    } else {
      this.menus = this.roleMenus.get(Role.GUEST)
    }
  }
}
