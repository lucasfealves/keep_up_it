import { Component } from '@angular/core';
import { HttpTreinoService } from './http_treino.service'
import { Treino } from './treino.component'

@Component({
  selector: 'app-root',
  templateUrl: './http_treino.component.html',
  providers: [HttpTreinoService]
})
export class HttpTreinoComponent {
  treinos: Treino[];
  treino: Treino;

  constructor(private httpTreinoS: HttpTreinoService) {
    this.treino = new Treino();
    this.getTreinos();
  }

  getTreinos() {
    this.httpTreinoS.getAlunos().subscribe(
      treinos => this.treinos = treinos,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  addCliente() {
    this.httpTreinoS.addAluno(this.treino).subscribe(
      data => data,
      error => alert(error),
      () => this.getTreinos()
    );


  }


}
