import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';
import { Aluno } from './aluno.component'

@Injectable()
export class HttpAlunoService {
  constructor(private _http: Http) { }

  getAlunos(): Observable<Aluno[]> {
    return this._http.get('http://localhost:8080/keep_it_up_/rest/alunorest').
      map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json()['aluno'];
  }

  addAluno(cliente: Aluno): Observable<string> {
    const json = JSON.stringify(cliente);
    const headers = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: headers });
    return this._http.post('http://localhost:8080/keep_it_up_/rest/alunorest',
      json, options).map(res => res.json());
  }
}
