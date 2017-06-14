import { Component } from '@angular/core';
import { Router, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-root',
  template: `<a routerLink="/aluno" routerLinkActive="active">Alunos</a><router-outlet></router-outlet>`
})
export class AppComponent {
}
