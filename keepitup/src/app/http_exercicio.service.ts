import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';
import { Exercicio } from './exercicio.component';

@Injectable()
export class HttpExercicioService {
  constructor(private _http: Http) { }

  getExercicios(): Observable<Exercicio[]> {
    return this._http.get('http://localhost:8080/keep_it_up_/rest/exerciciorest').
      map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json()['exercicio'];
  }

  addExercicio(Exercicio: Exercicio): Observable<string> {
    const json = JSON.stringify(Exercicio);
    const headers = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: headers });
    return this._http.post('http://localhost:8080/keep_it_up_/rest/exerciciorest',
      json, options).map(res => res.json());
  }
}
