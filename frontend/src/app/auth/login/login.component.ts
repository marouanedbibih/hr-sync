import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { ILoginREQ } from '../auth.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent implements OnInit {

  constructor(private authService: AuthService,private router: Router) { }

  request : ILoginREQ = {
    username: '',
    password: ''
  }


  ngOnInit(): void {
  }

  onSubmit() {
    this.authService.login(this.request).subscribe({
      next: (res) => {
        this.authService.setToken(res.token);
        this.authService.setUser(res.user);

        this.router.navigate(['/dashboard']);
      },
      error: (err) => {
        console.error(err)
        // TODO: Show error message
      }
    })
  }

}
