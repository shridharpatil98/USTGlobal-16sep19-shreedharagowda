import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router } from '@angular/router';

@Injectable({
    providedIn: 'root'
})

export class AuthGuard implements CanActivate {
    constructor(private rote: Router) { }

    canActivate(route: ActivatedRouteSnapshot): boolean {
        const roles = route.data.roles;
        const userDetails = JSON.parse(localStorage.getItem('userDetails'));
        let role;
        for (let i in roles) {
            if ((userDetails && userDetails.role === roles[i])) {
                role = userDetails.role;
            }
        }
        if (userDetails && role === userDetails.role) {
            return true;
        } else {
            this.rote.navigate(['page-not-found']);
        }
    }
}
