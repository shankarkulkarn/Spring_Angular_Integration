import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate{
  canActivate(route: ActivatedRouteSnapshot) : boolean
  {
       return true;
  }

  constructor() { }
}
