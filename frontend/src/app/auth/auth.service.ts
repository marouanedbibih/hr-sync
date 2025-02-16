import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ILoginREQ, ILoginRES } from './auth.model';
import { env } from '../../../env/env';
import { Observable } from 'rxjs';
import { IUser } from '../modules/user/user.model';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(private http: HttpClient) {}

  login(req: ILoginREQ): Observable<ILoginRES> {
    return this.http.post<ILoginRES>(`${env.api}/api/v1/auth/login`, req);
  }

  /**
   * This block of code is responsible for managing the token in the local storage.
   * @param token
   */
  setToken(token: string) {
    localStorage.setItem('token', token);
  }

  getToken() {
    return localStorage.getItem('token');
  }

  removeToken() {
    localStorage.removeItem('token');
  }

  /**
   * This block of code is responsible for managing the user in the local storage.
   * @param user
   */
  setUser(user: IUser) {
    localStorage.setItem('user', JSON.stringify(user));
  }

  getUser(): IUser | null {
    const user = localStorage.getItem('user');
    return user ? JSON.parse(user) : null;
  }

  removeUser() {
    localStorage.removeItem('user');
  }
}
