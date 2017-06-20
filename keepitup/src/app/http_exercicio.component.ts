import { Component } from '@angular/core';
import { Exercicio } from './exercicio.component'
import { HttpExercicioService } from './http_exercicio.service';

@Component({
  selector: 'app-root',
  templateUrl: './http_exercicio.component.html',
  providers: [HttpExercicioService]
})
export class HttpExercicioComponent {
  exercicios: Exercicio[];
  exercicio: Exercicio;

  constructor(private httpExercicioS: HttpExercicioService) {
    this.exercicio = new Exercicio();
    this.getExercicios();
  }

  getExercicios() {
    this.httpExercicioS.getExercicios().subscribe(
      exercicios => this.exercicios = exercicios,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  addExercicio() {
    this.httpExercicioS.addExercicio(this.exercicio).subscribe(
      data => data,
      error => alert(error),
      () => this.getExercicios()
    );
  }
}
