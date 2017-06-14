import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HttpAlunoComponent } from './http_aluno.component';



@NgModule({
  declarations: [
    AppComponent,
    HttpAlunoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
  {
    path: 'aluno',
    component: HttpAlunoComponent
  }
])
  ],
  providers: [HttpAlunoComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
