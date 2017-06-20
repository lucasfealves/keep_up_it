import { Component } from '@angular/core';
import { HttpExercicioService } from './http_exercicio.service';
import { HttpTreinoService } from './http_treino.service'
import { HttpAlunoService } from './http_aluno.service';
import { Treino } from './treino.component'
import { Aluno } from './aluno.component'
import { Exercicio } from './exercicio.component';

@Component({
  selector: 'app-root',
  templateUrl: './http_treino.component.html',
  providers: [HttpTreinoService, HttpAlunoService, HttpExercicioService]
})
export class HttpTreinoComponent {
  treinos: Treino[];
  alunos: Aluno[];
  exercicios: Exercicio[];
  treino: Treino;

  constructor(private httpTreinoS: HttpTreinoService, private httpAlunoS: HttpAlunoService, private httpExercicioS: HttpExercicioService) {
    this.treino = new Treino();
    this.treino.aluno = new Aluno();
    this.treino.exercicio = new Exercicio();
    this.getTreinos();
  }

  getTreinos() {
    this.httpTreinoS.getTreinos().subscribe(
      treinos => this.treinos = treinos,
      error => alert(error),
      () => this.getAlunos()
    );
  }

  getExecercios() {
    this.httpExercicioS.getExercicios().subscribe(
      exercicios => this.exercicios = exercicios,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  getAlunos() {
    this.httpAlunoS.getAlunos().subscribe(
      alunos => this.alunos = alunos,
      error => alert(error),
      () => this.getExecercios()
    );
  }

  addTreino() {
    this.httpTreinoS.addTreino(this.treino).subscribe(
      data => data,
      error => alert(error),
      () => this.getTreinos()
    );


  }


}
