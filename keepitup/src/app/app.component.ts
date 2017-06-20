import { Component } from '@angular/core';
import { Router, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-root',
  template: `<a routerLink="/aluno" routerLinkActive="active">Alunos</a><br/>`+
            `<a routerLink="/exercicio" routerLinkActive="active">Exercicios</a><br/>`+
            `<a routerLink="/treino" routerLinkActive="active">Treinos</a><router-outlet></router-outlet>`
})
export class AppComponent {
}
