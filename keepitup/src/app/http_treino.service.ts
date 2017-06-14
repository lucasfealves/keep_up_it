import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';
import { Treino } from './treino.component'

@Injectable()
export class HttpTreinoService {
  constructor(private _http: Http) { }

  getAlunos(): Observable<Treino[]> {
    return this._http.get('http://localhost:8080/keep_it_up_/rest/treinorest').
      map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json()['aluno'];
  }

  addAluno(treino: Treino): Observable<string> {
    const json = JSON.stringify(treino);
    const headers = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: headers });
    return this._http.post('http://localhost:8080/keep_it_up_/rest/treinorest',
      json, options).map(res => res.json());
  }
}
