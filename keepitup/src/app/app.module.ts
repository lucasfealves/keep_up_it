import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HttpAlunoComponent } from './http_aluno.component';
import { HttpTreinoComponent } from './http_treino.component';


@NgModule({
  declarations: [
    AppComponent,
    HttpAlunoComponent,
    HttpTreinoComponent
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
  }
])
  ],
  providers: [HttpAlunoComponent, HttpTreinoComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
