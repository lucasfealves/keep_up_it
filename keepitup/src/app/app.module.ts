import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';

import { HttpAlunoComponent } from './http_aluno.component';
import { HttpExercicioComponent } from './http_exercicio.component';
import { HttpTreinoComponent } from './http_treino.component';


@NgModule({
  declarations: [
    AppComponent,
    HttpAlunoComponent,
    HttpTreinoComponent,
    HttpExercicioComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
      {
        path: 'aluno',
        component: HttpAlunoComponent
      },
      {
        path: 'treino',
        component: HttpTreinoComponent
      },
      {
        path: 'exercicio',
        component: HttpExercicioComponent
      }
    ])
  ],
  providers: [HttpAlunoComponent, HttpTreinoComponent, HttpExercicioComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
