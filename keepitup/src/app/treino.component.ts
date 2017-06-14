import { Aluno } from './aluno.component';
import { Execrcicio } from './exercicio.component';
import { Component } from '@angular/core';

export class Treino {
  public id: number;
  public aluno: Aluno;
  public exercicio: Execrcicio;
  public data_criacao: string;
  public data_troca: string;

  constructor() {
  }
}
