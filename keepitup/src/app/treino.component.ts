import { Aluno } from './aluno.component';
import { Exercicio } from './exercicio.component';
import { Component } from '@angular/core';

export class Treino {
  public id: number;
  public aluno: Aluno;
  public exercicio: Exercicio;
  public data_criacao: string;
  public data_troca: string;

  constructor() {
  }
}
