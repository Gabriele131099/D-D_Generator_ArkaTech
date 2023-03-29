import { Component } from '@angular/core';

@Component({
  selector: 'app-compare',
  templateUrl: './compare.component.html',
  styleUrls: ['./compare.component.scss']
})
export class CompareComponent {
  // localStorage.setItem("arrayPgCompara", JSON.stringify(this.arrayPgCompara));
  arrayPgCompara:any = JSON.parse(localStorage.getItem("arrayPgCompara") || "[]");
}
