import { Component } from '@angular/core';
import { HttpAlunoService } from './http_aluno.service'
import { Aluno } from './aluno.component'

@Component({
  selector: 'app-root',
  templateUrl: './http_aluno.component.html',
  providers: [HttpAlunoService]
})
export class HttpAlunoComponent {
  alunos: Aluno[];
  aluno: Aluno;

  constructor(private httpAlunoS: HttpAlunoService) {
    this.aluno = new Aluno();
    this.getAlunos();
  }

  getAlunos() {
    this.httpAlunoS.getAlunos().subscribe(
      clientes => this.alunos = clientes,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  addCliente() {
    this.httpAlunoS.addAluno(this.aluno).subscribe(
      data => data,
      error => alert(error),
      () => this.getAlunos()
    );


  }


}
